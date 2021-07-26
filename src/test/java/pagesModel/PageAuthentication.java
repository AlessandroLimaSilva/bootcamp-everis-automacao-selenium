package pagesModel;

import org.openqa.selenium.By;

public class PageAuthentication {

    private String linkSignIn = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String linkAccountCreation = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

    private By caixaTextoEmail = By.xpath("//*[@id=\"email_create\"]");
    private By createAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
    private By radioMr = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label");
    private By radioMs = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[2]/label");
    private By caixaTextoFirstName = By.xpath("//*[@id=\"customer_firstname\"]");
    private By caixaTextoLastName = By.xpath("//*[@id=\"customer_lastname\"]");
    private By caixaTextoEmailCadastro = By.xpath("//*[@id=\"email\"]");
    private By caixaTextoPassword = By.xpath("//*[@id=\"passwd\"]");
    private By formularioDateBirthDia = By.xpath("//*[@id=\"days\"]");
    private By formularioDateBirthMes = By.xpath("//*[@id=\"months\"]");
    private By formularioDateBirthAno = By.xpath("//*[@id=\"years\"]");
    private By checkyBoxNewsLetter = By.xpath("//*[@id=\"newsletter\"]");
    private By checkBoxSpecialOffer = By.xpath("//*[@id=\"optin\"]");
    private By caixaTextoFirstName2 = By.xpath("//*[@id=\"firstname\"]");
    private By caixaTextoLastName2 = By.xpath("//*[@id=\"lastname\"]");
    private By caixaTextoCompany = By.xpath("//*[@id=\"company\"]");
    private By caixaTextoAddress = By.xpath("//*[@id=\"address1\"]");
    private By caixaTextoAddressLine2 = By.xpath("//*[@id=\"address2\"]");
    private By caixaTextoCity = By.xpath("//*[@id=\"city\"]");
    private By comboBoxState = By.xpath("//*[@id=\"id_state\"]");
    private By caixaTextoPostalCode = By.xpath("//*[@id=\"postcode\"]"); //5 digitos
    private By comboBoxCountry = By.xpath("//*[@id=\"id_country\"]");
    private By caixaTextoAdditionalInformation = By.xpath("//*[@id=\"other\"]");
    private By caixaTextoHomePhone = By.xpath("//*[@id=\"phone\"]");
    private By caixaTextoMobilePhone = By.xpath("//*[@id=\"phone_mobile\"]");
    private By caixaTextoLabelAddress = By.xpath("//*[@id=\"alias\"]");
    private By buttonRegister = By.xpath("//*[@id=\"submitAccount\"]");

    public String getLinkSignIn() {
        return linkSignIn;
    }

    public String getLinkAccountCreation() {
        return linkAccountCreation;
    }

    public By getCaixaTextoEmail() {
        return caixaTextoEmail;
    }

    public By getCreateAnAccount() {
        return createAnAccount;
    }

    public By getRadioMr() {
        return radioMr;
    }

    public By getRadioMs() {
        return radioMs;
    }

    public By getCaixaTextoFirstName() {
        return caixaTextoFirstName;
    }

    public By getCaixaTextoLastName() {
        return caixaTextoLastName;
    }

    public By getCaixaTextoEmailCadastro() {
        return caixaTextoEmailCadastro;
    }

    public By getCaixaTextoPassword() {
        return caixaTextoPassword;
    }

    public By getFormularioDateBirthDia() {
        return formularioDateBirthDia;
    }

    public By getFormularioDateBirthMes() {
        return formularioDateBirthMes;
    }

    public By getFormularioDateBirthAno() {
        return formularioDateBirthAno;
    }

    public By getCheckyBoxNewsLetter() {
        return checkyBoxNewsLetter;
    }

    public By getCheckBoxSpecialOffer() {
        return checkBoxSpecialOffer;
    }

    public By getCaixaTextoFirstName2() {
        return caixaTextoFirstName2;
    }

    public By getCaixaTextoLastName2() {
        return caixaTextoLastName2;
    }

    public By getCaixaTextoCompany() {
        return caixaTextoCompany;
    }

    public By getCaixaTextoAddress() {
        return caixaTextoAddress;
    }

    public By getCaixaTextoAddressLine2() {
        return caixaTextoAddressLine2;
    }

    public By getCaixaTextoCity() {
        return caixaTextoCity;
    }

    public By getComboBoxState() {
        return comboBoxState;
    }

    public By getCaixaTextoPostalCode() {
        return caixaTextoPostalCode;
    }

    public By getComboBoxCountry() {
        return comboBoxCountry;
    }

    public By getCaixaTextoAdditionalInformation() {
        return caixaTextoAdditionalInformation;
    }

    public By getCaixaTextoHomePhone() {
        return caixaTextoHomePhone;
    }

    public By getCaixaTextoMobilePhone() {
        return caixaTextoMobilePhone;
    }

    public By getCaixaTextoLabelAddress() {
        return caixaTextoLabelAddress;
    }

    public By getButtonRegister() {
        return buttonRegister;
    }
}
