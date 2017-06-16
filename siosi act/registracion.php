<?php

if($_SERVER['REQUEST_METHOD']=='POST'){

include 'conn.php';

 $con = mysqli_connect($HostName,$HostUser,$HostPass,$DatabaseName);

 $nombre = $_POST['nombre'];
 $apellido = $_POST['apellido'];
 $email = $_POST['email'];
 $password = $_POST['password'];
 $saldo = $_POST['saldo']

 
if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
  echo  "Ingrese un Email Correcto"; 
  die;
}else if(strlen(trim($password)) < 8){
	echo "La contraseña tiene que tener mas de 8 caracteres";	
	die;
}
else{

 $CheckSQL = "SELECT * FROM userinfo WHERE email='$email'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$CheckSQL));
 
 if(isset($check)){

 echo 'Ya hay una cuenta registrada con este Email';

 }
else{ 
$Sql_Query = "INSERT INTO userinfo (nombre,apellido,email,password) values ('$nombre','$apellido','$email','$password')";

 if(mysqli_query($con,$Sql_Query))
{
 echo 'Cuenta Creada . Muchas Gracias!';
}
else
{
 echo 'Hubo un Error . Intente de Nuevo';
 }
 }
}
}

 mysqli_close($con);
?>