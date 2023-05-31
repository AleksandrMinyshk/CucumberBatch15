package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/failed.txt",
        glue = "StepDefinitions",
        plugin = {"pretty"})


    // This class for running failed tests from target/failed.txt file
public class FailedRunner {

}
