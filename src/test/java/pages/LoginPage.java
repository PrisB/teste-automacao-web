package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    static WebDriver driver;

    By inputEmail = By.name("email");
	By inputPassword = By.name("password");
	By login = By.xpath("//button[@type='submit']");
	By mensagemEmail = By.cssSelector(".alert");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void acessarAplicacao(){
        driver.get("https://phptravels.net/admin/");
    }
    
    public void digitarUsuarioInvalido(String email) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(inputEmail).sendKeys("testephptravels.com");
    }
    
    public void digitarUsuarioValido(String email) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(inputEmail).sendKeys("admin@phptravels.com");
    }
    
    public void digitarSenhaValida(String senha) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(inputPassword).sendKeys("demoadmin");
    }
    
    public void digitarSenhaInvalida(String senha) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(inputPassword).sendKeys("teste");
    }
    
    public void login() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(login).click();
    }
    
    public void mensagemEmail(String string) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(mensagemEmail).getText().equals(string));

    }
    
    public void validarLogin() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().equals("Dashboard"));
    }
    
}
