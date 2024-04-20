package bank;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "D:\\Selenium_Cucumber\\java-cucumber-example\\src\\test\\resources\\selenium"
        ,glue={"selenium"},
        plugin = {"pretty",
                "html:target/report/cucumber.html",
                "json:target/report/cucumber.json"
        },
        monochrome = true
)

public class TestRunner {

}