package steps;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class LoginSteps {

    @Given("user opens portal")
    public void user_opens_portal() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Generate a unique temporary user-data directory
//        Path userDataDir = Paths.get(System.getProperty("java.io.tmpdir"), "chrome-user-data-" + System.currentTimeMillis());
//        options.addArguments("--user-data-dir=" + userDataDir.toAbsolutePath().toString());
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
        System.out.println("Opening chrome browser");
        WebDriver driver = new ChromeDriver(options);
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
