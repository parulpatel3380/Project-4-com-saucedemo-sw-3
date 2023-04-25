package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**BaseUrl = https://www.saucedemo.com/
 1. Create the package ‘browserfactory’ and create the
 class with the name ‘BaseTest’ inside the
 ‘browserfactory’ package. And write the browser setup
 code inside the class ‘Base Test’.
 *
 */
public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        // Launce the URL
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        //Implicit Time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){

        driver.quit();
    }
}
