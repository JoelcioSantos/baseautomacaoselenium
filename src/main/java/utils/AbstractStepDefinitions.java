package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractStepDefinitions {

    private final WebDriver driver;

    public AbstractStepDefinitions() {

        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }

    public void open(String url) {
        driver.navigate().to(url);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

}
