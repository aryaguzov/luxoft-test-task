package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static driver.DriverFactory.cleanUpDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }

    @After
    public void tearDown() {
        cleanUpDriver();
    }
}
