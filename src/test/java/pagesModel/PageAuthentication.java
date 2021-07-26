package pagesModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageAuthentication {

    private WebDriver driver;
    private String linkSignIn = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private String linkAccountCreation = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

    private By caixaTextoEmail = By.xpath("//*[@id=\"email_create\"]");
    private By buttonCreateAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
    private By radioMr = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label");
    private By radioMs = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[2]/label");
    private By caixaTextoFirstName = By.xpath("//*[@id=\"customer_firstname\"]");
    private By caixaTextoLastName = By.xpath("//*[@id=\"customer_lastname\"]");
    private By caixaTextoEmailCadastro = By.xpath("//*[@id=\"email\"]");
    private By caixaTextoPassword = By.xpath("//*[@id=\"passwd\"]");
    private By formularioDateBirthDia = By.cssSelector("#days");
    private By formularioDateBirthMes = By.cssSelector("#months");
    private By formularioDateBirthAno = By.cssSelector("#years");
    private By checkyBoxNewsLetter = By.xpath("//*[@id=\"newsletter\"]");
    private By checkBoxSpecialOffer = By.xpath("//*[@id=\"optin\"]");
    private By caixaTextoFirstName2 = By.xpath("//*[@id=\"firstname\"]");
    private By caixaTextoLastName2 = By.xpath("//*[@id=\"lastname\"]");
    private By caixaTextoCompany = By.xpath("//*[@id=\"company\"]");
    private By caixaTextoAddress = By.xpath("//*[@id=\"address1\"]");
    private By caixaTextoAddressLine2 = By.xpath("//*[@id=\"address2\"]");
    private By caixaTextoCity = By.xpath("//*[@id=\"city\"]");
    private By comboBoxState = By.cssSelector("#id_state");
    private By caixaTextoPostalCode = By.xpath("//*[@id=\"postcode\"]"); //5 digitos
    private By comboBoxCountry = By.cssSelector("#id_country");
    private By caixaTextoAdditionalInformation = By.xpath("//*[@id=\"other\"]");
    private By caixaTextoHomePhone = By.xpath("//*[@id=\"phone\"]");
    private By caixaTextoMobilePhone = By.xpath("//*[@id=\"phone_mobile\"]");
    private By caixaTextoLabelAddress = By.xpath("//*[@id=\"alias\"]");
    private By buttonRegister = By.xpath("//*[@id=\"submitAccount\"]");


    public PageAuthentication(WebDriver driver){this.driver = driver;}

    public PageAuthentication clickCreateAccount(){
        driver.findElement(getButtonCreateAnAccount()).click();
        return this;
    }

    public PageAuthentication preencherEmail(String email){
        driver.findElement(getCaixaTextoEmail());
        return this;
    }

    public PageAuthentication clickRadioMr(){
        driver.findElement(getRadioMr()).click();
        return this;
    }

    public PageAuthentication clickRadioMs(){
        driver.findElement(getRadioMs()).click();
        return this;
    }

    public PageAuthentication preencherFirstName(String firstName){
        driver.findElement(getCaixaTextoFirstName()).sendKeys(firstName);
        return this;
    }

    public PageAuthentication preencherLastName(String lastName){
        driver.findElement(getCaixaTextoLastName()).sendKeys(lastName);
        return this;
    }

    public PageAuthentication preencherEmailCadastro(String email){
        driver.findElement(getCaixaTextoEmailCadastro()).sendKeys(email);
        return this;
    }

    public PageAuthentication preencherPassword(String password){
        driver.findElement(getCaixaTextoPassword()).sendKeys(password);
        return this;
    }

    //Precisa refatorar
    public PageAuthentication clickBirthDateDia(String dia){
        driver.findElement(getFormularioDateBirthDia()).sendKeys(dia);
        return this;
    }

    public PageAuthentication clickBirthDateMes(String mes){
        driver.findElement(getFormularioDateBirthMes()).sendKeys(mes);
        return this;
    }

    public PageAuthentication clickBirthDateAno(String ano){
        driver.findElement(getFormularioDateBirthAno()).sendKeys(ano);
        return this;
    }


    public PageAuthentication clickCheckyBoxNewsLetter(){
        driver.findElement(getCheckyBoxNewsLetter()).click();
        return this;
    }

    public PageAuthentication clickCheckBoxSpecialOffer(){
        driver.findElement(getCheckBoxSpecialOffer()).click();
        return this;
    }

    public PageAuthentication preencherFirstName2(String firstName){
        driver.findElement(getCaixaTextoFirstName2()).sendKeys(firstName);
        return this;
    }

    public PageAuthentication preencherLastName2(String lastName){
        driver.findElement(getCaixaTextoLastName2()).sendKeys(lastName);
        return this;
    }

    public PageAuthentication preencherCompany(String company){
        driver.findElement(getCaixaTextoCompany()).sendKeys(company);
        return this;
    }

    public PageAuthentication preencherAddress(String address){
        driver.findElement(getCaixaTextoAddress()).sendKeys(address);
        return this;
    }

    public PageAuthentication preencherAddressLine2(String addressLine){
        driver.findElement(getCaixaTextoAddressLine2()).sendKeys(addressLine);
        return this;
    }

    public PageAuthentication preencherCity(String city){
        driver.findElement(getCaixaTextoCity()).sendKeys(city);
        return this;
    }


    public PageAuthentication preencherState(String state){
         driver.findElement(getComboBoxState()).sendKeys(state);
         return this;
     }


    public PageAuthentication peencherPostalCode(String postalCode){
        driver.findElement(getCaixaTextoPostalCode()).sendKeys(postalCode);
        return this;
    }


    public PageAuthentication preencherCountry(String country){
        driver.findElement(getComboBoxCountry()).sendKeys(country);
        return this;
    }


    public PageAuthentication preencherAdditionalInformation(String information){
        driver.findElement(getCaixaTextoAdditionalInformation()).sendKeys(information);
        return this;
    }

    public PageAuthentication preencherHomePhone(String phone){
        driver.findElement(getCaixaTextoHomePhone()).sendKeys(phone);
        return this;
    }

    public PageAuthentication preencherMobilePhone(String mobile){
        driver.findElement(getCaixaTextoMobilePhone()).sendKeys(mobile);
        return this;
    }

    public PageAuthentication preencherLabelAdress(String labelAdress){
        driver.findElement(getCaixaTextoLabelAddress()).sendKeys(labelAdress);
        return this;
    }

    public PageAuthentication clickButtonRegister(){
        driver.findElement(getButtonRegister()).click();
        return this;
    }

    public String getLinkSignIn() {
        return linkSignIn;
    }

    public String getLinkAccountCreation() {
        return linkAccountCreation;
    }

    public By getCaixaTextoEmail() {
        return caixaTextoEmail;
    }

    public By getButtonCreateAnAccount() {
        return buttonCreateAnAccount;
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
