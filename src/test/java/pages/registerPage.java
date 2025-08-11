package pages;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;

import static pages.objectRepository.*;

public class registerPage {

    WebDriver driver;

    public registerPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateHome(){
        driver.navigate().to(homePage);
    }

    public void clicktoRegisterPage(){
        driver.findElement(By.xpath(registerHyperlink)).click();
    }

    public void clickRegisterButton(){
        driver.findElement(By.xpath(registerButton)).click();
    }

    public String[] registrationFixtureParser() throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(registerFixture);
        Object obj = jsonparser.parse(reader);
        JSONArray RegistersArray = (JSONArray) obj;
        JSONObject Registers = (JSONObject) RegistersArray.get(0);

        String firstName = (String) Registers.get("firstName");
        String lastName = (String) Registers.get("lastName");
        String address = (String) Registers.get("address");
        String city = (String) Registers.get("city");
        String state = (String) Registers.get("state");
        String zipCode = (String) Registers.get("zipCode");
        String phoneNumber = (String) Registers.get("phoneNumber");
        String ssn = (String) Registers.get("ssn");
        String username = (String) Registers.get("username");
        String password = (String) Registers.get("password");
        String confirmPassword = (String) Registers.get("confirmPassword");

        return new String[]{ firstName, lastName, address, city, state, zipCode, phoneNumber, ssn, username, password, confirmPassword};
    }

    public void enterRegistrationDetails(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String ssn, String username, String password, String confirmPassword){
        driver.findElement(By.xpath(firstNameField)).sendKeys(firstName);
        driver.findElement(By.xpath(lastNameField)).sendKeys(lastName);
        driver.findElement(By.xpath(addressField)).sendKeys(address);
        driver.findElement(By.xpath(cityField)).sendKeys(city);
        driver.findElement(By.xpath(stateField)).sendKeys(state);
        driver.findElement(By.xpath(zipCodeField)).sendKeys(zipCode);
        driver.findElement(By.xpath(phoneNumberField)).sendKeys(phoneNumber);
        driver.findElement(By.xpath(ssnField)).sendKeys(ssn);
        driver.findElement(By.xpath(usernameField)).sendKeys(username);
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
        driver.findElement(By.xpath(confirmPasswordField)).sendKeys(confirmPassword);
    }
}
