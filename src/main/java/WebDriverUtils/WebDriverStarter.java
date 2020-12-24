package WebDriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverStarter {

    private static WebDriver webDriver = null;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");


        if (webDriver == null) {
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }
}