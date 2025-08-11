package pages;

public class objectRepository {

    public static String homePage = "https://parabank.parasoft.com/parabank/index.htm";
    public static String registerHyperlink = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]";
    public static String registerFixture = "src/test/java/fixtures/testRegisters.json";

    // Registration form fields
    public static String firstNameField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
    public static String lastNameField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
    public static String addressField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]";
    public static String cityField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]";
    public static String stateField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input[1]";
    public static String zipCodeField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input[1]";
    public static String phoneNumberField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/input[1]";
    public static String ssnField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input[1]";
    public static String usernameField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/input[1]";
    public static String passwordField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[11]/td[2]/input[1]";
    public static String confirmPasswordField = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[12]/td[2]/input[1]";

    // Registration button
    public static String registerButton = "/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]";

}