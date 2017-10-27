package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest()    {

        System.setProperty("webdriver.chrome.driver", "C:\\QAHome\\Experiments\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-password-autofill-public-suffix-domain-matching");

        base.Driver = new ChromeDriver();


    }

    @After
    public void TearDownTest(Scenario scenario)
    {
        if(scenario.isFailed()){
            //Take screenshot
            System.out.println(scenario.getName() +" is Failed");
        }

        base.Driver.close();
        base.Driver.quit();
    }

}
