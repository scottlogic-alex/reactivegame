param (
    [Parameter(Mandatory=$true,Position=0)][string]$to,
    [Parameter(Mandatory=$true,Position=1)][string]$subject,
    [Parameter(Mandatory=$true,Position=2)][string]$body
)
$Outlook = New-Object -ComObject Outlook.Application
$Mail = $Outlook.CreateItem(0)
$Mail.To = "$to"
$Mail.Subject = "$subject"
$Mail.Body = "$body"
$Mail.Send()
[System.Runtime.Interopservices.Marshal]::ReleaseComObject($Outlook) | Out-Null
