import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

import java.sql.Driver;

public class AutomationFirstPractice {

   private final By DEPARTMENT_WOMEN = By.xpath(".//a [@class = 'sf-with-ul']");
   private final By SUBDEPARTMENT_TOPS = By.xpath(".//a[contains (@title, 'tops')]");
    private final By SUBDEPARTMENT_DRESSES = By.xpath(".//a[contains (@title, 'dresses')]");
    private final By SUBCATEGORY_TOPS = By.xpath(".//a[contains (@href, '4&controller=category')]");
    private final By SUBCATEGORY_DRESSES = By.xpath(".//a[contains (@href, '8&controller=category')]");

    @Test
    public void automationFirstPractice() {

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        WebElement departmentWomen = driver.findElement(DEPARTMENT_WOMEN);
        driver.findElement(DEPARTMENT_WOMEN).click();
        WebElement subdepartmentTops = driver.findElement(SUBDEPARTMENT_TOPS);
        String topsToCompare = subdepartmentTops.getText();
        WebElement subdepartmentDresses = driver.findElement(SUBDEPARTMENT_DRESSES);
        String dressesToCompare = subdepartmentDresses.getText();
        WebElement subCategoryTops = driver.findElement(SUBCATEGORY_TOPS);
        String topsCategoryToCompare = subCategoryTops.getText();
        WebElement subCategoryDresses = driver.findElement(SUBCATEGORY_DRESSES);
        String dressesCategoryToCompare = subCategoryDresses.getText();


        //driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
    }

    //public void findWoman() {
        //WebDriver driver = new ChromeDriver();
        //driver.findElement(By.linkText("Women")).click();

}




