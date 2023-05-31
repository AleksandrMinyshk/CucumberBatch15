package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;
//   Hum@nhrm123
public class Login extends CommonMethods {

   /* @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

        openBrowserLaunchApplication();
    }*/

    @When("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {

        // 1variant driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
        //WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        //sendText(usernameTextBox, ConfigReader.getPropertyValue("username"));

        // 1variant driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
        //WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        //sendText(passwordTextBox, ConfigReader.getPropertyValue("password"));

        //LoginPage login = new LoginPage();
        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));

    }

    @When("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();

        //WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        //doClick(loginBtn);

        //LoginPage login = new LoginPage();
        doClick(login.loginBtn);
    }

    @Then("user is logged in successfully into the application")
    public void user_is_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        boolean userloggedIn = driver.findElement(By.xpath("//a[contains(text(), 'Welcome')]")).isDisplayed();
        if (userloggedIn) {
            System.out.println("User is logged in Successfully");
        }
    }
    /*@Then("close the browser")
    public void close_the_browser() {
       closeBrowser();
    }*/

    @When("user enters valid {string} and valid {string}")
    public void user_enters_valid_and_valid(String username, String password) {
        //WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        //sendText(usernameTextBox, username);

        //WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        //sendText(passwordTextBox, password);

        //LoginPage login = new LoginPage();
        sendText(login.usernameTextBox, username);
        sendText(login.passwordTextBox, password);
    }

    @When("user enters username and password and verifies login")
    public void user_enters_username_and_password_and_verifies_login(DataTable dataTable) {
        //LoginPage login = new LoginPage();
        List<Map<String, String>> userCredentials=dataTable.asMaps();
        for(Map<String, String> userCreds:userCredentials )
        {
            String username = userCreds.get("username");
            String password = userCreds.get("password");

            //WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
            //sendText(usernameTextBox, username);
            sendText(login.usernameTextBox, username);
            //WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
            //sendText(passwordTextBox, password);
            sendText(login.passwordTextBox, password);

            //WebElement loginBtn = driver.findElement(By.id("btnLogin"));
            //doClick(loginBtn);
            doClick(login.loginBtn);

            //WebElement welcomeIcon= driver.findElement(By.id("welcome"));
            //doClick(welcomeIcon);
            doClick(login.welcomeIcon);

            //WebElement logoutLink=driver.findElement(By.xpath("//a[text()='Logout']"));
            //doClick(logoutLink);
            doClick(login.logoutLink);
        }
    }
}
