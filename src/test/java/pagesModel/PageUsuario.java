package pagesModel;

public class PageUsuario {

    private String userFirstName;
    private String userLastName;
    private String password;
    private String email;
    private String diaNascimento;
    private String mesNascimento;
    private String anoNascimento;
    private boolean newLetter;
    private boolean specialOfter;
    private String firstName2;
    private String lastName2;
    private String company;
    private String address;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String additionalInformation;
    private String homePhone;
    private String mobilePhone;

    public PageUsuario(String userFirstName,String userLastName,String password,
                       String email,String diaNascimento,String mesNascimento,
                       String anoNascimento,String company,String address,
                       String city,String state,String postalCode,
                       String country,String homePhone,String mobilePhone){

        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.password = password;
        this.email = email;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
    }



    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(String diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public String getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(String mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public String getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public boolean isNewLetter() {
        return newLetter;
    }

    public void setNewLetter(boolean newLetter) {
        this.newLetter = newLetter;
    }

    public boolean isSpecialOfter() {
        return specialOfter;
    }

    public void setSpecialOfter(boolean specialOfter) {
        this.specialOfter = specialOfter;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
