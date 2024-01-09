package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    public Driver() {
    }

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver()   {
        if (driver.get() == null) {
            driver.set(createDriver());
        }
            return driver.get();
        }

            private static WebDriver createDriver() {
            WebDriver driver = null;
            ChromeOptions chromeOptions;
            String browserTypeRemoteValue = System.getProperty("browser");
            String browserType;
            if (browserTypeRemoteValue == null || browserTypeRemoteValue.isEmpty()) {
                browserType = ConfigurationReader.getProperty("browser");
            } else {
                browserType = browserTypeRemoteValue;
            }
            switch (browserType) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--incognito");
                    chromeOptions.addArguments("disable-geolocation");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    chromeOptions.addArguments("--incognito");
                    chromeOptions.addArguments("--headless=new");
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                    firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                    driver = new EdgeDriver(edgeOptions);
                    break;
//                default:
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            return driver;
        }


    public static void closeDriver() {
            driver.get().quit();
            driver.remove();
    }
}