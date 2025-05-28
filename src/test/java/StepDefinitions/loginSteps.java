package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;
import static pages.objectRepository.*;
import java.io.IOException;

public class loginSteps {

    WebDriver driver;
    loginPage login;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/JoelJohnson(G10XIND)/Desktop/sampleBddFramework/src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        login = new loginPage(driver);
    }

    @Given("I am on the login page")
    public void user_is_on_login_page() {
        login.navigateLogin();
    }

    @When("I enter valid username and password")
    public void user_enters_username_and_password() throws IOException, ParseException {
        String[] credentials = login.loginFixtureParser();
        String username = credentials[0];
        String password = credentials[1];
        login.enterCredentials(username, password);
    }

    @And("I click on login button")
    public void clicks_on_login_button() {
        login.clickLogin();
    }

    @Then("I should be logged in")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        driver.findElements(By.xpath(homepageLogo));
    }
}