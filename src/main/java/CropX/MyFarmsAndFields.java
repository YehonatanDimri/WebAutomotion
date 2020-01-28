package CropX;

import Web.By2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyFarmsAndFields extends CropXAbstractPage {
    public MyFarmsAndFields(WebDriver driver) {
        super("My Farm and Fields screen", driver, my_farm_and_field_Logo);
    }

    private static final By2 my_farm_and_field_Logo = new By2("My farm and field head line", By.xpath("/html/body/app-root/div/app-farms-list/div/div[1]/app-sidebar/div/div[1]/div[3]/div/div[3]"));
    private static final By2 Add_New_Field = new By2("Add new field", By.xpath("/html/body/app-root/div/app-farms-list/div/div[1]/app-sidebar/div/div[1]/div[4]/div/button/p"));
    private static final By2 PlusButton = new By2("Plus button", By.xpath("/html/body/app-root/div/app-farms-list/div/div[2]/app-add-button/div/div[1]"));
    private static final By2 FieldButton = new By2("Field button", By.xpath("/html/body/app-root/div/app-farms-list/div/div[3]/app-add-button/div/div[3]"));


    // public void AddNewFieldButtonClike() {
    // this.bot.click(Add_New_Field);
    //}

    public void AddNewFieldPlusButtonClike() {
        //Thread.sleep(60);
        bot.waitElementToBeVisible(PlusButton);
        bot.click(PlusButton);
        bot.waitElementToBeVisible(FieldButton);
        //Thread.sleep(20);
        bot.click(FieldButton);

    }
}



