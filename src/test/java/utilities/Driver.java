package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private final static ThreadLocal<WebDriver> localDriver;

    static {
        localDriver = new ThreadLocal<>();
    }

    public static void setup() {
        String driver = ConfigurationReader.get("browser");
        switch (driver) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                set(new ChromeDriver());
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                set(new FirefoxDriver());
                break;
            case "ie":
                if (System.getProperty("os.name").toLowerCase().contains("mac"))
                    throw new WebDriverException("You are operating Mac OS which doesn't support Internet Explorer");
                WebDriverManager.iedriver().setup();
                set(new InternetExplorerDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                set(new EdgeDriver());
                break;
            case "safari":
                if (System.getProperty("os.name").toLowerCase().contains("windows"))
                    throw new WebDriverException("You are operating Windows OS which doesn't support Safari");
                WebDriverManager.getInstance(SafariDriver.class).setup();
                set(new SafariDriver());
                break;
        }
    }

    private static void set(WebDriver driver) {
        localDriver.set(driver);
    }

    public static WebDriver get() {
        return localDriver.get();
    }

    public static void quit() {
        get().quit();
        set(null);
    }
}
