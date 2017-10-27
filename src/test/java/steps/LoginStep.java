package steps;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.util.ArrayList;
import java.util.List;


public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^user is on login page$")
    public void userIsOnStreetsmartLoginPage() throws Throwable {

        base.Driver.navigate().to("https://stg-mc.xora.com/adapter/guest/login.page");

    }

//    @When("^I enter the username as \"([^\"]*)\" and passwords as \"([^\"]*)\"$")
//    public void iEnterTheUsernameAsAndPasswordsAs(String usrname, String pwd) throws Throwable {
//        System.out.println("I should enter "+usrname + " and" +pwd);
//
//    }



    @When("^I enter the following credentials$")
    public void iEnterTheFollowingCredentials(DataTable table) throws Throwable {

        LoginPage page = new LoginPage(base.Driver);
        //DATA TABLE Example
        // List<List<String>> data = table.raw();
        //base.Driver.findElement(By.id("username")).sendKeys(data.get(1).get(0));
        //base.Driver.findElement(By.id("password")).sendKeys(data.get(1).get(1));
        //base.Driver.findElement(By.id("companyid")).sendKeys(data.get(1).get(2));

        //Create Array list
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        for (User user: users) {
                page.Login(user.username,user.password,user.companyid);
//            base.Driver.findElement(By.name("username")).sendKeys(user.username);
//            base.Driver.findElement(By.name("password")).sendKeys(user.password);
//            base.Driver.findElement(By.name("companyId")).sendKeys(user.companyid);


        }






    }

    @When("^I enter ([^\"]*), ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String username, String password, String companyid) throws Throwable {

        LoginPage page = new LoginPage(base.Driver);
        page.Login(username, password, companyid);
//        base.Driver.findElement(By.id("username")).sendKeys(username);
//        base.Driver.findElement(By.id("password")).sendKeys(password);
//        base.Driver.findElement(By.id("companyId")).sendKeys(companyid);
    }

    @And("^I click on login$")
    public void iClickOnLogin() throws Throwable {
        LoginPage page = new LoginPage(base.Driver);
        page.ClickLogin();
        // base.Driver.findElement(By.id("password_submit")).submit();


    }


    @Then("^I should see the login page$")
    public void iShouldSeeTheLoginPage() throws Throwable {
        WebElement myDynamicElement = (new WebDriverWait(base.Driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("companyInfo")));
        Assert.assertEquals("Login Successful", base.Driver.findElement(By.className("companyInfo")).isDisplayed(), true);
    }

    public class User {
        public String username;
        public String password;
        public String companyid;

        public User(String userName, String passWord, String companyId) {
            username = userName;
            password = passWord;
            companyid = companyId;
        }
    }
}
