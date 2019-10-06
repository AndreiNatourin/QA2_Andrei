import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


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

        Assertions.assertEquals(topsToCompare, dressesToCompare, "not the same");
        Assertions.assertEquals(topsCategoryToCompare, dressesCategoryToCompare, "not the same");
    }

    private final By DEPARTMENT_WOMEN_S = By.xpath(".//h2 [@class = 'title_block']");
    private final By SUBDEPARTMENT_TOPS_S = By.xpath(".//a[contains (@title, 'tops')]");
    private final By SUBDEPARTMENT_DRESSES_S = By.xpath(".//a[contains (@title, 'dresses')]");
    private final By SUBCATEGORY_TOPS_S = By.xpath(".//a[contains (@href, '4&controller=category')]");
    private final By SUBCATEGORY_DRESSES_S = By.xpath(".//a[contains (@href, '8&controller=category')]");

    @Test
    public void resizeWindow() {
        Dimension dimension = new Dimension(800, 600);
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().window().setSize(dimension);

        WebElement subdepartmentTopsS = driver.findElement(SUBDEPARTMENT_TOPS_S);
        String subdepartmentTopsSText = subdepartmentTopsS.getText();
        WebElement subdepartmentDressesS = driver.findElement(SUBDEPARTMENT_DRESSES_S);
        String subdepartmentDressesSText = subdepartmentDressesS.getText();
        WebElement subCategoryTopsS = driver.findElement(SUBCATEGORY_TOPS_S);
        String subCategoryTopsSText = subCategoryTopsS.getText();
        WebElement subCategoryDressesS = driver.findElement(SUBCATEGORY_DRESSES_S);
        String subCategoryDressesSText = subCategoryDressesS.getText();

        Assertions.assertEquals(subdepartmentDressesSText, subCategoryDressesSText, "not the same");
        Assertions.assertEquals(subdepartmentTopsSText, subCategoryTopsSText, "not the same");

        
    }

}




