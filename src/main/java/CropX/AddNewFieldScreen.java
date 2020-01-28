package CropX;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class AddNewFieldScreen extends CropXAbstractPage {
    public AddNewFieldScreen(WebDriver driver) {
        super("Add new field title", driver, add_new_field_title);
    }

    private static final By2 add_new_field_title = new By2("Add new field title", xpath("/html/body/app-root/div/app-farms-list/div/div[2]/div[1]/app-add-field/div/div[2]/div[1]"));
    public static final By2 SearchWindow = new By2("Search Window", xpath("/html/body/app-root/div/app-farms-list/div/div[2]/div[1]/app-add-field/div/div[2]/div[2]/input"));
    public static final By2 FirstOption = new By2("Alamose in the Search Window", xpath("/html/body/div/div[1]"));
    public static final By2 continueButton = new By2("First Continue", xpath("/html/body/app-root/div/app-farms-list/div/div[2]/div[1]/app-add-field/div/div[2]/div[3]"));
    public static final By2 SecondContinueButton = new By2("Second Continue Button", cssSelector("body > app-root > div > app-farms-list > div > div.map-container > div.control-box.ng-tns-c3-1.ng-trigger.ng-trigger-errorAnimation.ng-star-inserted > app-add-field > div > div.auto-zoning-container > div.next-btn"));
    public static final By2 FieldName  = new By2("Field name Window", xpath("/html/body/app-root/div/app-farms-list/div/div[3]/div[1]/app-add-field/div/div[14]/app-field-summary/div/div[2]/div[1]/input"));
    public static final By2 farmName  = new By2("Farm name line", xpath("/html/body/app-root/div/app-farms-list/div/div[3]/div[1]/app-add-field/div/div[14]/app-field-summary/div/div[2]/div[2]/div[1]"));


    public static final By2 DoneButon = new By2("Done button", cssSelector("body > app-root > div > app-farms-list > div > div.map-container > div.control-box.ng-tns-c3-1.ng-trigger.ng-trigger-errorAnimation.ng-star-inserted > app-add-field > div > div.summary-container > app-field-summary > div > div.summary-options-container.ng-star-inserted > div:nth-child(6) > div > button"));
    public static final By2 CircleButon = new By2("continue", xpath("/html/body/app-root/div/app-farms-list/div/div[2]/div[1]/app-add-field/div/div[7]/div[2]/div[1]/div"));
    public static final By2 Rectangle = new By2("continue", xpath("/html/body/app-root/div/app-farms-list/div/div[2]/div[1]/app-add-field/div/div[7]/div[2]/div[2]/div"));


    WebDriverWait wait = new WebDriverWait(driver, 50);
    WebElement menuOption = driver.findElement(By.xpath("/html/body/div"));

    public void searchText(String search_text) throws InterruptedException {
        this.bot.writeToElement(SearchWindow, search_text);

        this.bot.waitElementToBeVisible(FirstOption);

        this.bot.selectinsearchList(FirstOption);
    }

    public void CircleWaitToVisible() {
        this.bot.waitElementToBeVisible(CircleButon);

    }

    public void rectangleWaitToVisible() {
        this.bot.waitElementToBeVisible(CircleButon);

    }

    public void CircleClick() {
        this.bot.click(CircleButon);

    }

    public void RectangleClick() {
        this.bot.click(Rectangle);

    }
    public void SecondContinueClick() {
        this.bot.waitElementToBeVisible(SecondContinueButton);
        this.bot.click(SecondContinueButton);

    }

    public void mouseClick() {
        WebElement elem = driver.findElement(By.xpath("/html/body/app-root/div"));

        Actions act = new Actions(driver);

        //moveToElement placed us at the center of the screen.
        act.moveToElement(elem).moveByOffset(-400, 100).click().perform();

        bot.waitElementToBeVisible(continueButton);
        bot.click(continueButton);

    }

    public void fieldDetailAdd(String field_name_text) throws InterruptedException {
        this.bot.writeToElement(FieldName, field_name_text);
       // this.bot.click(farmName);
        this.bot.click(DoneButon);

    }




}
