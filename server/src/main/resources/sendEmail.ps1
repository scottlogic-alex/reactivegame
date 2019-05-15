param (
    [Parameter(Mandatory=$true)][string]$to,
    [Parameter(Mandatory=$true)][string]$subject,
    [Parameter(Mandatory=$true)][string]$body
)
$Outlook = New-Object -ComObject Outlook.Application
$Mail = $Outlook.CreateItem(0)
$Mail.To = "$to"
$Mail.Subject = "$subject"
$Mail.Body = "$body"
$Mail.Send()
[System.Runtime.Interopservices.Marshal]::ReleaseComObject($Outlook) | Out-Null
