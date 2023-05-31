package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/* HOOKS: For defining pre and Post steps in any Cucumber framework
      : This is always created inside the StepDefinitions folder
      : Hooks will take care of pre and post conditions irrespective
      : of what goes in between the test steps*/
public class Hooks extends CommonMethods {
    @Before
    public void preConditions() {
        openBrowserLaunchApplication();
    }

    @After
    public void postConditions(Scenario scenario) {
        byte[] pic;
        if (scenario.isFailed()) {
            pic = takeScreenshot("failed/" + scenario.getName());
        } else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }

        // attach the screenshot in my report
        scenario.attach(pic, "image/png", scenario.getName());

        closeBrowser();
    }
}
