package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HelloWebDriver {

    public static void main(String[] args) {

        //Create Chromedriver instance
        WebDriver chromeDriver = new ChromeDriver();

        //Get a start page
        chromeDriver.get("https://www.google.com/");

        //Find an element after 5 seconds
        WebElement searchField = waitForElementLocatedBy(chromeDriver, By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        //Enter a value in it
        searchField.sendKeys("api");
        //Press "Enter"
        searchField.sendKeys(Keys.ENTER);

        //Find all h3 elements after 5 seconds and put them in a list
        /*List<WebElement> h3 =  new WebDriverWait(chromeDriver,5)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("h3")));*/

        new WebDriverWait(chromeDriver, 5)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("h3")));

        List<WebElement> h3 = chromeDriver.findElements(By.tagName("h3"));
        System.out.println(h3.size());

        chromeDriver.quit();

    }

    private static WebElement waitForElementLocatedBy(WebDriver chromeDriver, By by) {
        return new WebDriverWait(chromeDriver,5)
                    .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
