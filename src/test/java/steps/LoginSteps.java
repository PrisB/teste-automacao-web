package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginPage;

import static runners.LoginTest.driver;

public class LoginSteps{

    LoginPage loginPage = new LoginPage(driver);
    
    @Dado("que o usuário acesse a página da phptravels")
    public void queOUsuárioAcesseAPáginaDaPhptravels() {
        loginPage.acessarAplicacao();
    }
    
    @E("informe o email inválido")
    public void informeOEmailInvalido() throws InterruptedException {
    	loginPage.digitarUsuarioInvalido("testephptravels.com");
    }
    
    @E("o password válido")
    public void oPasswordValido() throws InterruptedException {
    	loginPage.digitarSenhaValida("demoadmin");
    }
    
    @Quando("clicar em Login")
    public void clicarEmLogin() throws InterruptedException {
    	loginPage.login();
    }
    
    @Entao("irá exibir uma mensagem {string}")
    public void iraExibirUmaMensagem(String string) throws InterruptedException {
    	loginPage.mensagemEmail(string);
    }
    
    @E("informe o email válido")
    public void informeOEmailValido() throws InterruptedException {
    	loginPage.digitarUsuarioValido("admin@phptravels.com");
    }
    
    @E("o password inválido")
    public void informeASenhaInvalida() throws InterruptedException {
    	loginPage.digitarSenhaInvalida("teste");
    }
    
    @Entao("será direcionado para a tela do Dashboard")
    public void seraDirecionadoParaATelaDoDashboard() throws InterruptedException {
    	loginPage.validarLogin();
    }

}

