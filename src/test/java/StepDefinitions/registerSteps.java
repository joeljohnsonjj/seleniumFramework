package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.registerPage;
import java.io.IOException;
import java.util.List;

public class registerSteps {

    WebDriver driver;
    registerPage register;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        register = new registerPage(driver);
    }

    @Given("I am on the home page")
    public void user_is_on_home_page() {
        register.navigateHome();
    }

    @When("I go to register page")
    public void user_goes_to_register_page() {
        register.clicktoRegisterPage();
    }

    @And("I enter details from fixture file")
    public void user_enters_details() throws IOException, ParseException {
        String[] registrationData = register.registrationFixtureParser();
        String firstName = registrationData[0];
        String lastName = registrationData[1];
        String address = registrationData[2];
        String city = registrationData[3];
        String state = registrationData[4];
        String zipCode = registrationData[5];
        String phoneNumber = registrationData[6];
        String ssn = registrationData[7];
        String username = registrationData[8];
        String password = registrationData[9];
        String confirmPassword = registrationData[10];
        register.enterRegistrationDetails(firstName, lastName, address, city, state, zipCode, phoneNumber, ssn, username, password, confirmPassword);
    }

    @And("I click register")
    public void user_clicks_register() {
        register.clickRegisterButton();
    }

    @Then("I verify registration completed")
    public void user_registration_completed() throws InterruptedException {
        register.verifyRegistration();
    }
}