package Stepdefenition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpagedefinition {
    @Given("User is on Home page")
    public void Loginpagedefinition() {
        System.out.println("page is openned");
    }

    @When("User enters username")
    public void enterUsername() {
        System.out.println("enter username");
    }
    @And("User enters password")
    public void entersPassword(){
        System.out.println("Enter password");

    }

    @Then("User should be able to login successfully")
    public void loginbutton() {
        System.out.println("login sucessfully");
    }

    @Given("User enters in Dashboard")
    public void Dasboard() {
        System.out.println("enters Dasboard");
    }

    @When("User enters ProfileIamge")
    public void ProfileImage() {
        System.out.println("Enters profile image");
    }

    @And("User enters in  change Password")
    public void password() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Enter new Password");
    }

    @And("User enters in  Old Password")
    public void OldPassword() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Enter old Password");
    }

    @And("User enters in New Password")
    public void NewPassword() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Enter new Password");
    }
    @And("User enters in Verify Password")
    public void VerifyPassword()
    {
        System.out.println("password matched");
    }
    @Then("User should be save")
    public void userShouldBeSave() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Enter save button");
    }

}

