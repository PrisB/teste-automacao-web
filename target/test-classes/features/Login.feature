#language: pt
#Author: Priscila Barbosa

@login
Funcionalidade: Realizar login no phptravels
	Eu como admin da phptravels
	Quero acessar o site
	Para gerenciar as informações

	Cenário: Email inválido
		Dado que o usuário acesse a página da phptravels
		E informe o email inválido
		E o password válido
		Quando clicar em Login
		Então irá exibir uma mensagem "The Email field must contain a valid email address."
		
	Cenário: Senha inválida
		Dado que o usuário acesse a página da phptravels
		E informe o email válido
		E o password inválido
		Quando clicar em Login
		Então irá exibir uma mensagem "Invalid Login Credentials"
		
	Cenário: Realizar o login com sucesso
		Dado que o usuário acesse a página da phptravels
		E informe o email válido
		E o password válido
		Quando clicar em Login
		Então será direcionado para a tela do Dashboard