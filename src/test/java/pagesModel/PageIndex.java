package pagesModel;

import org.openqa.selenium.By;

public class PageIndex {

    private String user = "";
    private String password = "";
    private String email = "alessandrosilva.2705@aluno.saojudas.br";

    //Links utilizados na pagina
    private String linkIndex = "http://automationpractice.com/index.php";
    private String linkSignIn = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    //Endereços de componentes da pagina index
    private By buttonSignin = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
    private By caixaTextoEmail = By.xpath("//*[@id=\"email_create\"]");
    private By createAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
    private By
}
