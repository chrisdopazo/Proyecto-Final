<?php

 if($_SERVER['REQUEST_METHOD']=='POST'){

 include 'conn.php';
 
 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);
 
 $email = $_POST['email'];
 $password = $_POST['password'];
 
 $Sql_Query = "select * from userinfo where email = '$email' and password = '$password' ";
 
 $check = mysqli_fetch_array(mysqli_query($con,$Sql_Query));
 
 if(isset($check)){
 
 echo "Datos Correctos";
 }
 else{
 echo "Usuario o Password incorrecta";
 }
 
 }else{
 echo "Intente devuelta";
 }
mysqli_close($con);

?>