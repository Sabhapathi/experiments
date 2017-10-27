package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "username")
    public WebElement txtidUserName;

    @FindBy(how = How.ID, using = "password")
    public WebElement txtidPassword;

    @FindBy(how = How.ID, using = "companyId")
    public WebElement txtidCustomerId;

    @FindBy(how = How.ID, using = "password_submit")
    public WebElement btnidLogin;

    public void Login(String userName, String password, String companyId)
    {
        txtidUserName.sendKeys(userName);
        txtidPassword.sendKeys(password);
        txtidCustomerId.sendKeys(companyId);
    }

    public void ClickLogin(){
        btnidLogin.submit();
    }


}
