package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                 glue = "StepDefinitions",
                 dryRun = false,
                 tags = "@database",
                 plugin = {"pretty","html:target/AlexCucumber.html","json:target/AlexCucumber.json","rerun:target/failed.txt"}
                    //    {"pretty","html:target/AlexCucumber.html","html:target/AlexCucumber.json"}
                 ) // tags = "@testCase2 and @testcase3 or testCase1"

public class SmokeRunner {

}
//tags option will execute the tagged testcase as mentioned in your runner class
//target folder is mostly used for storing the test case execution reports generated using Cucumber
