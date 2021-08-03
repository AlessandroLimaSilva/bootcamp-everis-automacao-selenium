package tests;

import factory.DriverFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesModel.PageAuthentication;
import pagesModel.PageIndex;
import pagesModel.PageMyAccount;
import pagesModel.PageUsuario;
import utils.Utils;

public class CadastrarUsuarioTest {

    private static PageIndex index;
    private static PageAuthentication authentication;
    private static PageMyAccount account;
    private static Utils utils;
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
                "sao judas","Street SA","New York","Hawai",
                "00007","United States",
                "11111111111","22222222222"
        );

        index = new PageIndex(driver);
        authentication = new PageAuthentication(driver);
        account = new PageMyAccount(driver);
        utils = new Utils(driver);
        utils.acessarTela(index.getLinkIndex());
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(index.getButtonSignin()));
        Assertions.assertEquals(index.getLinkIndex(), driver.getCurrentUrl());
        utils.clickButtonId(index.getButtonSignin());

        wait.until(ExpectedConditions.
                visibilityOfAllElementsLocatedBy(authentication.getButtonCreateAnAccount()));

        utils.preencherCampo(authentication.getCaixaTextoEmail(),user.getEmail()).
                clickButtonId(authentication.getButtonCreateAnAccount());

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(authentication.getButtonRegister()));

        utils.clickButtonId(authentication.getRadioMr()).
                preencherCampo(authentication.getCaixaTextoFirstName(), user.getUserFirstName()).
                preencherCampo(authentication.getCaixaTextoLastName(),user.getUserLastName()).
                preencherCampo(authentication.getCaixaTextoPassword(),user.getPassword()).
                clickEnviarTextoCss(authentication.getFormularioDateBirthDia(),user.getDiaNascimento()).
                clickEnviarTextoCss(authentication.getFormularioDateBirthMes(), user.getMesNascimento()).
                clickEnviarTextoCss(authentication.getFormularioDateBirthAno(),user.getAnoNascimento()).
                preencherCampo(authentication.getCaixaTextoCompany(), user.getCompany()).
                preencherCampo(authentication.getCaixaTextoAddress(),user.getAddress()).
                clickEnviarTexto(authentication.getCaixaTextoCity(),user.getCity()).
                clickEnviarTexto(authentication.getComboBoxState(),user.getState()).
                preencherCampo(authentication.getCaixaTextoPostalCode(),user.getPostalCode()).
                clickEnviarTexto(authentication.getComboBoxCountry(),user.getCountry()).
                preencherCampo(authentication.getCaixaTextoHomePhone(),user.getHomePhone()).
                preencherCampo(authentication.getCaixaTextoMobilePhone(),user.getMobilePhone());

                //clickButtonRegister();


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(account.getButtonSignOut()));
        Assertions.assertEquals(authentication.getLinkAccountCreation(),driver.getCurrentUrl());
        Assertions.assertEquals(account.getLinkMyAccount(),driver.getCurrentUrl());
    }
}
