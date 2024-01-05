package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.sql.Timestamp;

public class Hooks {

    @Before
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", timeMilliseconds);
        }
    }

    @After
    public void ending(){
        Driver.closeDriver();
    }
}
