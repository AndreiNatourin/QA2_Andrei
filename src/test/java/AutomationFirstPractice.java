import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationFirstPractice {

    private final By DEPARTMENT_WOMEN = By.xpath(".//a[@title='Women']");
    private final By FILTER_TOPS = By.xpath(".//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-tops']");
    private final By FILTER_DRESSES = By.xpath(".//a[contains (@href, '#categories-dresses')]");
    private final By SUBCATEGORY_TOPS = By.xpath(".//a[contains (@class, 'category-name')]");
    private final By SUBCATEGORY_DRESSES = By.xpath(".//h5//a[text()='Dresses']");     //(".//a[contains (@href, '8&controller=category')]");

 //   private final By CATEGORIES_S = By.xpath(".//div [contains (@class, 'cat-title')]");
 //   private final By DEPARTMENT_WOMEN_S = By.xpath(".//a [contains (@title, 'Women')]");
 //  private final By SUBDEPARTMENT_TOPS_S = By.xpath(".//a[contains (@href, '4&controller=category')]");
 //  private final By SUBDEPARTMENT_DRESSES_S = By.xpath(".//a[contains (@title, 'dresses')]");
 //   private final By SUBCATEGORY_TOPS_S = By.xpath(".//a[contains (@href, '4&controller=category')]");
 //   private final By SUBCATEGORY_DRESSES_S = By.xpath(".//a[contains (@href, '8&controller=category')]");

    @Test
    public void automationFirstPractice() {
        //open Chrome
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //open home page
        driver.get("http://automationpractice.com/index.php");
        //find and open department Women
        WebElement departmentWomen = driver.findElement(DEPARTMENT_WOMEN);
        driver.findElement(DEPARTMENT_WOMEN).click();

        //find filter Tops, save to String
        WebElement filterTops = driver.findElement(FILTER_TOPS);
        String filterTopsToCompare = filterTops.getText();
        //find subdepartment Dresses, save to String
        WebElement filterDresses = driver.findElement(FILTER_DRESSES);
        String filterDressesToCompare = filterDresses.getText();
        //find subcategory Tops, save to String
        WebElement subCategoryTops = driver.findElement(SUBCATEGORY_TOPS);
        String topsCategoryToCompare = subCategoryTops.getText();
        //find subcategory Dresses, save to String
        WebElement subCategoryDresses = driver.findElement(SUBCATEGORY_DRESSES);
        String dressesCategoryToCompare = subCategoryDresses.getText();
        //assert
        Assertions.assertEquals(filterTopsToCompare, topsCategoryToCompare, "not the same");
        Assertions.assertEquals(filterDressesToCompare, dressesCategoryToCompare, "not the same");
    }

    private final By CATEGORIES_S = By.xpath(".//div [contains (@class, 'cat-title')]");
    private final By DEPARTMENT_WOMEN_S = By.xpath(".//a [contains (@title, 'Women')]");
    private final By SUBDEPARTMENT_TOPS_S = By.xpath(".//a[contains (@href, '4&controller=category')]");
    private final By SUBDEPARTMENT_DRESSES_S = By.xpath(".//a[contains(@href, 'id_category=8&')]");

    private final By SUBCATEGORY_TOPS_S = By.xpath(".//a[contains (@href, '4&controller=category')]");
    private final By SUBCATEGORY_DRESSES_S = By.xpath(".//a[contains (@href, '8&controller=category')]");

    @Test
    public void resizeWindow() {
        //resize window to mobile dimension
        Dimension dimension = new Dimension(300, 800);
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.get("http://automationpractice.com/index.php");

        WebElement categoriesS = driver.findElement(CATEGORIES_S);
        driver.findElement(CATEGORIES_S).click();
        WebElement departmentWomenS = driver.findElement(DEPARTMENT_WOMEN_S);
        departmentWomenS.click();

        //find subdepartment Tops, save to String
        WebElement subdepartmentTopsS = driver.findElement(SUBDEPARTMENT_TOPS_S);
        String subdepartmentTopsSText = subdepartmentTopsS.getText();
        //find subdepartment Dresses, save to String
        WebElement subdepartmentDressesS = driver.findElement(SUBDEPARTMENT_DRESSES_S);
        String subdepartmentDressesSText = subdepartmentDressesS.getText();
        //find subcategory Tops, save to String
        WebElement subCategoryTopsS = driver.findElement(SUBCATEGORY_TOPS_S);
        String subCategoryTopsSText = subCategoryTopsS.getText();
        //find subcategory Dresses, save to String
        WebElement subCategoryDressesS = driver.findElement(SUBCATEGORY_DRESSES_S);
        String subCategoryDressesSText = subCategoryDressesS.getText();
        //assert
        Assertions.assertEquals(subdepartmentDressesSText, subCategoryDressesSText, "not the same");
        Assertions.assertEquals(subdepartmentTopsSText, subCategoryTopsSText, "not the same");


    }

}




