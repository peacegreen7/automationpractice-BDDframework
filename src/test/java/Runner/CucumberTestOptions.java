package Runner;

import Utils.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"Steps"},
        features = {"src/test/java/Features"})


public class CucumberTestOptions {
    @BeforeClass
    public static void setUp() {
        BaseTest.launchApplication();
    }

    @AfterClass
    public static void tearDown() {
        BaseTest.closeBrowser();
    }
}
