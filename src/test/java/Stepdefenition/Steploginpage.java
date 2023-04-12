package Stepdefenition;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Steploginpage {
    @Step("Enter Username")
    public void inputUserName(String Username) {
        $(By.xpath("//input[@id='ul-inp-em-1']")).click();
        $(By.xpath("//input[@id='ul-inp-em-1']")).sendKeys(Username);
    }

    private WebElement $(By xpath)

    {
        return null;
    }

    @Step("Enter Password")
    public void inputPassword(String Password) {
        $(By.xpath("//input[@id='ul-inp-pw-1']")).click();
        $(By.xpath("//input[@id='ul-inp-pw-1']")).sendKeys(Password);
    }

    @Step("Click Submit Button")
    public void clickLogin()
    {
        $(By.xpath("//a[@id='ul-btn-1']")).click();
    }

    @Step("Enter Dashboard")
    public void Dashboard()
    {
        $(By.xpath("//a[@class='left-mnui fa-home']")).click();
    }


    @Step("Enter Password")
    public void Password()
    {
        $(By.xpath("//input[@id='accPass']")).sendKeys("Mani@123");
    }

    @Step("Enter Conform Password")
    public void ConformPassword()
    {
        $(By.xpath("//input[@id='accCPass']")).sendKeys("Mani@123");
    }

    @Step("Save")
    public void Save()
    {
        $(By.xpath("//span[@id='accSave']//a[@class='button okb']")).click();
    }
}



