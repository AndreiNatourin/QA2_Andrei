import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DelfiArticleTest {

private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");
private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains (@class, 'text-size-22')]");
private final By ARTICLE_PAGE_COMMENTS = By.xpath(".//a [contains (@class, 'text-size-md-28')]");
private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");
private final By ARTICLE = By.xpath(".//span [@class = 'text-size-22 d-block']");


   @Test
   public void titleAndCommentsTest() {

       //open browser
       System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       //open Delfi home page
       driver.get("http://rus.delfi.lv");

       WebElement article = driver.findElements(ARTICLE).get(0);
       //find 1st article title
       WebElement homePageTitle = article.findElements(HOME_PAGE_TITLE).get(0);

       //save to  string
       String titleToCompare = homePageTitle.getText();

       //Find comments count
       Integer commentsToCompare = 0;
        if (article.findElements(HOME_PAGE_COMMENTS).isEmpty()) {
            commentsToCompare = 0;
            } else {
            WebElement homePageComments = article.findElement(HOME_PAGE_COMMENTS);
       };

       //Save to Integer
        String  commentsToParse = homePageComments.getText(); //(1)
    commentsToParse = commentsToParse.substring(1, commentsToParse.length() -1);
    Integer commentsToCompare = Integer.valueOf(commentsToParse);
        //Open articles page
       homePageTitle.click();
       //Find article title
driver.findElement(ARTICLE_PAGE_TITLE).getText();
String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText();
       //Check title
       Assertions.assertEquals(titleToCompare, apTitle, "wrong title on article title");
       //find comments count //Save to Integer don't do like this
       Integer apComments = Integer.valueOf(driver.findElement(ARTICLE_PAGE_COMMENTS).getText().substring(1, driver.findElement(ARTICLE_PAGE_COMMENTS).getText().length() - 1));

       //Check count
       Assertions.assertEquals(commentsToCompare, apComments, "comments count is not same as on home page");
       //open comments page save to String
       driver.findElement(ARTICLE_PAGE_COMMENTS).click();
       String cpTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();
       //Check title
       Assertions.assertEquals(titleToCompare, cpTitle, "Some text here");

       //Find article title
       //Save to Integer
       //Check title
       //find comments count
       //Save to Integer
       //Check count


    }
}
