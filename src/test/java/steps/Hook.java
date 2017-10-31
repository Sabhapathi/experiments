package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {

    private BaseUtil base;
    protected AndroidDriver mobiledriver;
    public static final String appName = "TimeTrack_Sprint.apk";
    public static final String APP_DIR = System.getProperty("user.dir") + "\\src\\apps";
    public static java.lang.Process Process;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() throws IOException, InterruptedException {


        //************        CHROME Driver         *******//
        System.setProperty("webdriver.chrome.driver", "C:\\QAHome\\Experiments\\src\\main\\resources\\chromedriver.exe");

//       //Chrome Remote Driver
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("disable-password-autofill-public-suffix-domain-matching");
//        chromeOptions.addArguments("disable-infobars");
//        chromeOptions.addArguments("--start-maximized");
//        chromeOptions.addArguments("test-type");
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        dc.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//       dc.setCapability("version","ANY");
//        URL url = new URL("http://localhost:4444/wd/hub");
//        base.Driver=new RemoteWebDriver(url, dc);
//        // END Chrome Remote Driver

        base.Driver = new ChromeDriver();


//        //FireFox Driver
//        System.setProperty("webdriver.gecko.driver", "C:\\QAHome\\Experiments\\src\\main\\resources\\geckodriver.exe");
//        URL url = new URL("http://localhost:4444/wd/hub");
//        DesiredCapabilities dc = DesiredCapabilities.firefox();
//        dc.setCapability("marionette",true);
//        dc.setCapability("version","ANY");
//        base.Driver = new RemoteWebDriver(url,dc);
//       //END FIREFOX DRIVER



        base.Driver.manage().window().maximize();
        base.Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        // Appium Server
        InitializeAppiumServer();

        //Android Mobile Driver

        File appDir = new File(APP_DIR);
        File app = new File(appDir, appName);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("device", "Device");
        caps.setCapability("deviceName", "Pixel");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", app.getAbsolutePath());
        caps.setCapability("newCommandTimeout", 60);

        mobiledriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);



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
        mobiledriver.closeApp();
        mobiledriver.close();
        mobiledriver.quit();
    }

    public  void InitializeAppiumServer() throws IOException,InterruptedException{
        if(Process == null)
        {
            Process= Runtime.getRuntime().exec("cmd /c start "+System.getProperty("user.dir") + "\\src\\apps\\startappium.bat");
            System.out.println("Appium starts..");
            Thread.sleep(10000);
        }

    }

}
