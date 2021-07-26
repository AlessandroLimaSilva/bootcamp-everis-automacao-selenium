package pagesModel;

import org.openqa.selenium.By;

public class PageMyAccount {

    private final String linkMyAccount = "http://automationpractice.com/index.php?controller=my-account";
    private By buttonSignOut = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");

    public String getLinkMyAccount() {
        return linkMyAccount;
    }

    public By getButtonSignOut() {
        return buttonSignOut;
    }
}
