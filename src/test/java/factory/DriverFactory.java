package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static final String chromeDriver = "webdriver.chrome.driver";
    private static final String pathChrome = "src/test/java/driver/";

    public DriverFactory(){}

    public WebDriver getConnectionChrome() throws WebDriverException{
        WebDriver browser = null;
        try{
            System.setProperty(chromeDriver, pathChrome);
            browser = new ChromeDriver();
        }catch (Exception e){
            e.printStackTrace();
        }
        return browser;
    }

    public void closeConnection(WebDriver browser) throws WebDriverException{

        try {

            browser.quit();

        } catch (WebDriverException e) {

            e.printStackTrace();

        }
    }
}
