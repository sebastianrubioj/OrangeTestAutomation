package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/login.feature", glue = "stepdefs")
public class LoginRunner extends AbstractTestNGCucumberTests {

}
