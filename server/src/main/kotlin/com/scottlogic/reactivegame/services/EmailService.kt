package com.scottlogic.reactivegame.services

import com.microsoft.outlook.ClassFactory
import com.microsoft.outlook.OlItemType
import com.microsoft.outlook._MailItem
import org.springframework.stereotype.Service
import java.io.BufferedReader
import java.io.InputStreamReader
import java.nio.file.Paths


@Service
class EmailService {
    fun sendEmail(emailAddress: String): Int {
        emailAddress
        val subject = "Worm World request access link"
        val body = "hello Ellie"
        //getting the file path of sendEmail.ps1
        val path = Paths.get(javaClass.classLoader.getResource("sendEmail.ps1").toURI()).toAbsolutePath().toString()
        //constructing the command
        val powerShellProcess = ProcessBuilder().command("powershell.exe", path, "-to", "'$emailAddress'", "-subject", "'$subject'", "-body", "'$body'").start()
        // Getting the results
        val stdout = BufferedReader(InputStreamReader(
                powerShellProcess.inputStream))
        stdout.useLines { it.forEach(::println) }
        //getting any errors
        val stderr = BufferedReader(InputStreamReader(
                powerShellProcess.errorStream))
        stderr.useLines {
            val lines = it.joinToString("\n")
            if (lines.isNotBlank()) {
                throw EmailException(lines, powerShellProcess.exitValue())
            }
        }
        return powerShellProcess.exitValue()
    }

    fun sendEmail2() {
//        param (
//                [Parameter(Mandatory=$true,Position=0)][string]$to,
//        [Parameter(Mandatory=$true,Position=1)][string]$subject,
//        [Parameter(Mandatory=$true,Position=2)][string]$body
//        )
//        $Outlook = New-Object -ComObject Outlook.Application
//        $Mail = $Outlook.CreateItem(0)
//        $Mail.To = "$to"
//        $Mail.Subject = "$subject"
//        $Mail.Body = "$body"
//        $Mail.Send()
//        [System.Runtime.Interopservices.Marshal]::ReleaseComObject($Outlook) | Out-Null

        val application = ClassFactory.createApplication()
        val comObject = application.createItem(OlItemType.olMailItem)
        val mailItem: _MailItem = comObject.queryInterface(_MailItem::class.java)
//        mailItem.
//        mailItem.queryInterface()
    }
}

class EmailException(message:String, val exitCode: Int): Exception(message)