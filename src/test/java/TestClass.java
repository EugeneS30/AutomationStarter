import org.openqa.selenium.WebDriver;

public class TestClass {

    public static void main(String[] args) {
        WebDriver driver = WebDriverUtils.getDriver();
        driver.close();
        driver.quit();
    }

}
