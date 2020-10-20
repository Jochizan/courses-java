<?php
require_once('car.php');
require_once('uberX.php');
require_once('Account.php');

$uberX = new UberX("QWE345", new Account("Andres Herrera","AND456"), "Chevrolet", "Spark");
$uberX->printDataCar();
$uberPool = new UberX("FNX179", new Account("Joan Roca","AFG875"), "Dodge", "Attitude");
$uberPool->printDataCar();
?>
