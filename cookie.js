			function setcookie(nome, valor, expira){
				var d = new Date();
    			d.setTime(d.getTime() + "expira = Thu, 01 Jan 1970 00:00:00 UTC;";
   				var expires = "expires="+ d.toUTCString();
   				//toUTCString = Converte um objeto Date em uma string, de acordo com a hora universal.
    			document.cookie = nome + "=" + valor + ";" + expires + ";path=/";
    		}
			function getcookie(nome){
				var vnome = nome + "=";
				var ca =  document.cookie.split(';')
				for (var i = 0; i < ca.length; i++) {
					var c = ca[i];
					while ( c.charAt(0) ==' '){
						//charAt = Retorna o primeiro caractere de uma string.
						c = c.substring(1);
						// substring = Extrair caracteres de uma string.
					}
					if (c.indexOf(nome) == 0 ){
						return c.substring(name.length, c.length);
					}
			}
			// return " ";
			// Pegue o nome da receita como parâmetro (name).
			// Crie uma variável (nome) com o texto para procurar por (nome + "=").
			// Decodifique a string do cookie, para manipular cookies com caracteres especiais, por exemplo, '$'
			// Dividir document.cookie em ponto e vírgula em uma matriz chamada ca (ca = decodedCookie.split (';')).
			// Faça um loop pelo array ca (i = 0; i <ca.length; i ++) e leia cada valor c = ca [i].
			// Se o cookie for encontrado (c.indexOf (name) == 0), retorne o valor do cookie (c.substring (name.length, c.length).
			// Se o cookie não for encontrado, retorne "".

			function chekcookie(){
				var user = getcookie("username");
				if(user !=" "){
					alert("Bem Vindo Denovo" + nome)
				}else {
					user = prompt("Por favor coloque seu nome" + " ");
					if(user != "" && user != null){
						setcookie("username", user, 365);	
				    }
				}
			}