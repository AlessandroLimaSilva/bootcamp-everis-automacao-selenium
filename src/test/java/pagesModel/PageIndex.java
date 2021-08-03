package pagesModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageIndex {

    private WebDriver driver;
    private String linkIndex = "http://automationpractice.com/index.php";
    private By buttonSignin = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");

    public PageIndex(WebDriver driver){this.driver = driver;}

    public By getButtonSignin() {
        return buttonSignin;
    }

    public String getLinkIndex() {
        return linkIndex;
    }

}
