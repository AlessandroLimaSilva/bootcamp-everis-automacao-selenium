package tests;

import factory.DriverFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesModel.PageAuthentication;
import pagesModel.PageIndex;
import pagesModel.PageUsuario;

import java.io.IOException;

public class CadastrarUsuarioTest {

    private static PageIndex index;
    private static PageAuthentication authentication;
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void CadastrarUsuario() throws RuntimeException,NullPointerException {
        driver = new DriverFactory().getConnectionChrome();
        wait = new WebDriverWait(driver,5);
        PageUsuario user = new PageUsuario("alessandro",
                "lima",
                "abcdefg",
                "alessandrosilva@aluno.saojudas.br",
                "3","March","1986",
                "sao judas","Street SA","California","Hawai",
                "00007","United States",
                "11111111111","22222222222"
        );

        index = new PageIndex(driver);
        authentication = new PageAuthentication(driver);
        index.acessarTelaPageIndex();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(index.getButtonSignin()));
        Assertions.assertEquals(index.getLinkIndex(), driver.getCurrentUrl());
        index.clickButtonSign();

        wait.until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(authentication.getButtonCreateAnAccount()));
        authentication.preencherEmail(user.getEmail()).clickCreateAccount();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(authentication.getButtonRegister()));

        //Assertions.assertEquals(authentication.getLinkAccountCreation(),driver.getCurrentUrl());

        authentication.clickRadioMr().
                preencherFirstName(user.getUserFirstName()).
                preencherLastName(user.getUserLastName()).
                preencherPassword(user.getPassword()).
                clickBirthDateDia(user.getDiaNascimento()).
                clickBirthDateMes(user.getMesNascimento()).
                clickBirthDateAno(user.getAnoNascimento()).
                preencherCompany(user.getCompany()).
                preencherAddress(user.getAddress()).
                preencherCity(user.getCity()).
                preencherState(user.getState()).
                peencherPostalCode(user.getPostalCode()).
                preencherCountry(user.getCountry()).
                preencherHomePhone(user.getHomePhone()).
                preencherMobilePhone(user.getMobilePhone()).
                clickButtonRegister();

        Assertions.assertEquals(authentication.getLinkAccountCreation(),driver.getCurrentUrl());

    }
}
