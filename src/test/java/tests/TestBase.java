package tests;

import WebDriverUtils.WebDriverStarter;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public Properties properties;
    public WebDriver driver;

    @Before
    public void init() throws IOException {
        loadProperties();
        initDriver();
    }

    @After
    public void cleanup() {
        releaseDriver();
    }

    private void loadProperties() throws IOException {
        String rootPath = System.getProperty("user.dir");
        String propertiesFileName = rootPath + "/src/test/resources/" + "config.properties";

        properties = new Properties();
        properties.load(new FileInputStream(propertiesFileName));
    }

    private void initDriver() {
        driver = WebDriverStarter.getDriver();
    }

    private void releaseDriver() {
        driver.close();
        driver.quit();
    }
}
