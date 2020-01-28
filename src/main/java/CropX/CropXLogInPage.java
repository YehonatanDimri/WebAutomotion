package CropX;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CropXLogInPage extends CropXAbstractPage {

    public CropXLogInPage(WebDriver driver) {
        super("My farm and field Page", driver, LogIn);
    }

    private static final By2 LogIn = new By2("Log In text", By.xpath("/html/body/app-root/div/app-login/div/div[3]/form/div[1]"));
    private static final By2 Email_address = new By2("Email address field", By.xpath("//*[@id=\"emailId\"]"));
    private static final By2 password = new By2("password", By.xpath("/html/body/app-root/div/app-login/div/div[3]/form/div[2]/div[4]/input"));
    private static final By2 GO = new By2("GO button", By.xpath("/html/body/app-root/div/app-login/div/div[3]/form/div[2]/div[5]/button"));

    public void Email_address_text_enter(String Email) {
        this.bot.writeToElement(Email_address, Email);
    }

    public void password_text_enter(String password_text) {
        this.bot.writeToElement(password, password_text );
    }

    public void go_button_click() {
        this.bot.click(GO);
    }
}


