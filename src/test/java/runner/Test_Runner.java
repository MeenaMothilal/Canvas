package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import project_base.Base_Class;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\mural\\OneDrive\\Desktop\\Abinaya\\RestAPI\\45\\Interview\\src\\main\\java\\feature\\.feature",
glue = "com.step_file")
public class Test_Runner  {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver = Base_Class.launchingBrowser("chrome");
    }
@AfterClass
    public static void tearDown(){
        driver.quit();
}
}