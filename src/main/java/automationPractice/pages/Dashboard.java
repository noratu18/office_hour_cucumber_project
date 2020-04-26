package automationPractice.pages;

import org.junit.Assert;

public class Dashboard extends BasePage {


    @Override
    public void clickButton(String button) {

        button = button.toUpperCase();
        switch (button) {
            case "LOGIN":
                //   btn_account.click();
                break;
            default:
                Assert.fail("There are no button " + button + "available in switch statement");

        }

    }
}