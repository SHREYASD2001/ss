package steps;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginSteps {

    @Given("user opens portal")
    public void user_opens_portal() {
//        WebDriverManager.chromedriver().setup();
        System.out.println("Opening chrome browser");
        RemoteWebDriver driver = new ChromeDriver();
        System.out.println("Opening Portal");
        driver.get("https://www.google.com/");
        System.out.println("Maximizing Window");
        driver.manage().window().maximize();
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Given("User login to portal")
    public void user_login_to_portal() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}
