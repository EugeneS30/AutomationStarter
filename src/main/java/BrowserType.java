import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.opera.OperaDriverService;

public enum BrowserType {
    FIREFOX("Firefox", org.openqa.selenium.remote.BrowserType.FIREFOX, GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, 1),
    CHROME("Chrome", org.openqa.selenium.remote.BrowserType.CHROME, ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, 3),
    HEADLESS_CHROME("Chrome", org.openqa.selenium.remote.BrowserType.CHROME, ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, 827),
    OPERA("Opera", org.openqa.selenium.remote.BrowserType.OPERA_BLINK, OperaDriverService.OPERA_DRIVER_EXE_PROPERTY, 4),
    IE("IE", org.openqa.selenium.remote.BrowserType.IE, InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, 2),
    EDGE("Edge", org.openqa.selenium.remote.BrowserType.EDGE, EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, 5);

    BrowserType(String name, String seleniumBrowserName, String webDriverSystemPropertyName, int clientId) {
        this.name = name;
        this.seleniumBrowserName = seleniumBrowserName;
        this.webDriverSystemPropertyName = webDriverSystemPropertyName;
        this.clientId = clientId;
    }

    private final String name;
    private final String seleniumBrowserName;
    private final String webDriverSystemPropertyName;
    private final int clientId;
}