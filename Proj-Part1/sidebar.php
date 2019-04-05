<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: "Lato", sans-serif;
}

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #2ca540;
  overflow-x: hidden;
  transition: 0.7s;
  padding-top: 60px;
  border-radius: 5%;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #c5ccc6;
  display: block;
  transition: 0.4s;
}

.sidenav a:hover {
  color: #f9fcfa;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.span{
	margin-left: 4%;5
	margin-top: 30%
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
</head>
<body>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="fecharNav()">&times;</a>
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Clients</a>
  <a href="#">Contact</a>
</div>

<span style="font-size:30px;cursor:pointer" class="span" onclick="abrirNav()">&#9776; Topicos</span>

<script>
function abrirNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("mySidenav").style.height = "210px";

}

function fecharNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("mySidenav").style.height = "0";

}
</script>
   
</body>
</html> 
