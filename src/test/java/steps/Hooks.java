package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before
    public void setupDriver() {
        Driver.setup();
        Driver.get()
            .manage()
            .window()
            .maximize();
        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void quitDriver() {
        Driver.quit();
    }
}
