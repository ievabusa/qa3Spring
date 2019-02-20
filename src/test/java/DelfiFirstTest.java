import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {

    private String tilteToCompare = "KHL spēle: Rīgas 'Dinamo' - 'Severstaļ'. Teksta tiešraide";
    private final By TITLE = By.xpath(".//h1[contains(@class,'headline__title')]");

    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/ievabusa/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

        WebElement firstTitle = driver.findElement(TITLE);
        String titleText = firstTitle.getText();

        Assertions.assertEquals(tilteToCompare,titleText, "jeeej!");



    }


}
