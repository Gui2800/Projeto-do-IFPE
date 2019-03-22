<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Longin</title>
    <link rel="stylesheet" href="login.css">
</head>
<body>


<?php
    $dado = $_GET['nome'] . ';' . $_GET['sobrenome'] . ';' . $_GET['idade'] . ';' .  $_GET['e-mail']. ';' .  $_GET ['senha'] . ';' .  $_GET['matricula'] . ';' . "\n";
    $handle = fopen('dados.csv', 'a');
    fwrite($handle, $dado);
?>

<div id="degrtop" class="topo">
<img class="foto" src="logoifpe.jpg">

<a href="index.html" class="a1"> IFPE</a>
<br>
<a href="listagem.php" class="a2">LISTAGEM</a>
<a href="index.html" class="a3">HOME</a>
</div>
    <form action="login.php">
    <div class= "input">        

        <label>Nome:</label>
        <input type="text" id="input" class="inp" name="nome" placeholder="Nome...">
        <br>

        <label>Sobrenome:</label>
        <input type="text" class="inp" name="sobrenome" placeholder="Sobrenome...">
        <br>

        <label>Idade:</label>
        <input type="text" class="inp" name="idade" placeholder="Idade...">
        <br>

        <label>E-mail:</label>
        <input type="text" class="inp" name="e-mail" placeholder="E-mail...">
        <br>

        <label>Senha:</label>
        <input type="text" class="inp" name="senha" placeholder="Senha...">
        <br>

        <label>Matrícula:</label>
        <input type="text" class="inp" name="matricula" placeholder="Matrícula...">
        <br>
        <button type="submit" class="button" onclick="alert('Login efetuado com sucesso!')">Enviar</button>
   </form>
 </div> 

<div id="debrbot" class="baixo"></div>
   
</body>
</html>
