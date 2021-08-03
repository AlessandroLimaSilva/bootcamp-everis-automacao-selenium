package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Utils {

    private static WebDriver driver;

    public Utils(WebDriver driver){
        Utils.driver = driver;
    }

    public Utils clickButtonId(By xpath){
        driver.findElement(xpath).click();
        return this;
    }

    public Utils preencherCampo(By xpath,String dado){
        driver.findElement(xpath).sendKeys(dado);
        return this;
    }

    public void acessarTela(String link){ driver.get(link);}

    public Utils clickEnviarTexto(By xpath,String dado){
        driver.findElement(xpath).sendKeys(dado);
        return this;
    }

    public Utils clickEnviarTextoCss(By css, String dado){
        driver.findElement(css).sendKeys(dado);
        return this;
    }


}
