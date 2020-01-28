package CropXWebTests;

import CropX.AddNewFieldScreen;
import CropX.CropXLogInPage;
import CropX.MyFarmsAndFields;
import configFile.MainConfig;
import org.testng.annotations.Test;

import java.awt.*;

public class CropxLogInPageTest extends BaseTest {


    @Test
    public void CropxLogInPage() {
        browseToUrl(MainConfig.baseUrl);
        CropXLogInPage cropxlogInPage = new CropXLogInPage(driver);
        cropxlogInPage.Email_address_text_enter("ydcropx@gmail.com@x");
        cropxlogInPage.password_text_enter("Syd12061986");
        cropxlogInPage.go_button_click();
        MyFarmsAndFields myFarmsAndFields = new MyFarmsAndFields(driver);
        this.driver.close();
    }

    @Test
    public void AddNewField() throws AWTException, InterruptedException {
        browseToUrl(MainConfig.baseUrl);
        CropXLogInPage cropxlogInPage = new CropXLogInPage(driver);
        cropxlogInPage.Email_address_text_enter("ydcropx@gmail.com@x");
        cropxlogInPage.password_text_enter("Syd12061986");
        cropxlogInPage.go_button_click();
        MyFarmsAndFields myFarmsAndFields = new MyFarmsAndFields(driver);
        myFarmsAndFields.AddNewFieldPlusButtonClike();
        AddNewFieldScreen addNewFieldScreen = new AddNewFieldScreen(driver);
        addNewFieldScreen.searchText("Alamosa");
        addNewFieldScreen.mouseClick();
        addNewFieldScreen.CircleWaitToVisible();
        addNewFieldScreen.rectangleWaitToVisible();
        addNewFieldScreen.CircleClick();
        addNewFieldScreen.SecondContinueClick();
        addNewFieldScreen.fieldDetailAdd("Dimri Field");

        //this.driver.quit();

    }
}

