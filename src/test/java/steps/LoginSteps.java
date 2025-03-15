package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    @Given("user opens portal")
    public void user_opens_portal() {
        WebDriver driver = new ChromeDriver();
        System.out.println("Opening Portal");
        driver.get("google.com");
        System.out.println("Opening Portal");
        driver.manage().window().maximize();
        System.out.println("Maximizing Window");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Given("User login to portal")
    public void user_login_to_portal() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}
