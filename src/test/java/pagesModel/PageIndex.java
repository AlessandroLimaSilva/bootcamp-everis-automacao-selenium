package pagesModel;

import org.openqa.selenium.By;

public class PageIndex {

    //Links utilizados na pagina
    private String linkIndex = "http://automationpractice.com/index.php";

    //Endereços de componentes da pagina index
    private By buttonSignin = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");

    public By getButtonSignin() {
        return buttonSignin;
    }

    public String getLinkIndex() {
        return linkIndex;
    }
}
