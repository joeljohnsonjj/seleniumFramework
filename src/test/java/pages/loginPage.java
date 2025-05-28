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

public class loginPage {

    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLogin(){
        driver.findElement(By.xpath(loginButton)).click();
    }

    public void navigateLogin(){
        driver.navigate().to(loginPage);
    }

    public String[] loginFixtureParser() throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader(validTestLoginsFixture);
        Object obj = jsonparser.parse(reader);
        JSONArray validTestLoginsArray = (JSONArray) obj;
        JSONObject validTestLogins = (JSONObject) validTestLoginsArray.get(0);

        String username = (String) validTestLogins.get("username");
        String password = (String) validTestLogins.get("password");

        return new String[]{username, password};
    }

    public void enterCredentials(String username, String password){
        driver.findElement(By.xpath(usernameField)).sendKeys(username);
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
    }
}
