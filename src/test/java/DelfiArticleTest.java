import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiArticleTest {

private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");


   @Test
   public void titleAndCommentsTest() {

       //open browser
       System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       //open Delfi home page
       driver.get("http://rus.delfi.lv");
       //find 1st article title
       WebElement homePageTitle = driver.findElement(HOME_PAGE_TITLE);

       //save to  string
       String titleToCompare = homePageTitle.getText();

       //Find comments count
        WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

       //Save to Integer
        String  commentsToParse = homePageComments.getText(); //(1)
    commentsToParse = commentsToParse.substring(1, commentsToParse.length() -1);
    Integer commentsToCompare = Integer.valueOf(commentsToParse);

        //Open articles page
       //Find article title
       //Save to Integer
       //Check title
       //find comments count
       //Save to Integer
       //Check count
       //open comments page
       //Find article title
       //Save to Integer
       //Check title
       //find comments count
       //Save to Integer
       //Check count


    }
}
