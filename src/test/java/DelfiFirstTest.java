import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiFirstTest {

    @Test
    public void delfiFirstTest () {
        // Here we will write a code
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

    }



}
