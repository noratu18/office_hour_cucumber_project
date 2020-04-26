package automationPractice.step_definitions;

import automationPractice.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import java.util.concurrent.TimeUnit;

public class Hooks {

    //Hooks runs before and after scenario

    @Before(order = 0)
    public void setUpScenario() {
        System.out.println("set up browser");
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.get().manage().window().fullscreen();
    }
    @Before(value = "@db", order = 1)
    public void connect(){
        System.out.println("connecting to db");
    }

    @After
    public void tearDownScenario() {
        System.out.println("close driver");
        Driver.closeDriver();
    }

    @After("@db")
    public void closeConnection() {
        System.out.println("closing connection to db");
    }
    //    @BeforeStep
    public void setUpStep() {
        System.out.println("prints before every step");
    }
    //    @AfterStep
    public void tearDownStep(){
        System.out.println("prints after every step");
    }


}
