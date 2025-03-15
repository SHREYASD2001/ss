import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",  // ✅ Corrected path
        glue = "steps",  // ✅ Ensure step definitions are in this package
        plugin = {"pretty", "html:target/cucumber-reports.html"}  // ✅ Adds reporting
)

public class TestRunner extends AbstractTestNGCucumberTests {  // ✅ Extend this for TestNG
}