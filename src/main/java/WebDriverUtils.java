import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {

    private static WebDriver webDriver = null;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");


        if (webDriver != null) {
            return webDriver;
        } else {
            webDriver = new ChromeDriver();
            return webDriver;
        }
    }
}