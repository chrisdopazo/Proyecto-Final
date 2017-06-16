<?php


$HostName = "localdb";
$HostUser = "azure";//gamapp
$HostPass = "6#vWHD_$";//Moni2015
$DatabaseName = "127.0.0.1:53358";

$conn = new mysqli($HostName, $HostUser, $HostPass, $DatabaseName);

if ($conn->connect_error) {
 
 echo "mal";
} 
else
{
	echo "else"
}
?>