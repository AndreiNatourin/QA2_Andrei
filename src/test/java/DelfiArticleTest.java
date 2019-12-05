import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class DelfiArticleTest {

    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");
    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class = 'comment-count text-red-ribbon']");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains (@class, 'text-size-md-30')]");
    private final By ARTICLE_PAGE_COMMENTS = By.xpath(".//a[contains (@class, 'text-size-19')]");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");
    private final By ARTICLE = By.xpath(".//span [@class = 'text-size-22 d-block']");
    private final By COMMENT_PAGE_COMMENT = By.xpath(".//span [@class = 'type-cnt']");
    private static final Logger LOGGER = LogManager.getLogger(DelfiArticleTest.class);


    @Test
    public void titleAndCommentsTest() {

        LOGGER.info("Open Chrome browser");

        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Open Delfi home page");
        driver.get("http://rus.delfi.lv");

        LOGGER.info("Find first article. Save title");
        WebElement article = driver.findElements(ARTICLE).get(0);
        WebElement homePageTitle = driver.findElements(HOME_PAGE_TITLE).get(0);
        String titleToCompare = homePageTitle.getText().trim();

        LOGGER.info("Find comments count. Save");
        Integer commentsToCompare = 0;
        if (!driver.findElements(HOME_PAGE_COMMENTS).isEmpty()) { //! menjaet znachenie na protivopolozhnoe
                        WebElement homePageComments = driver.findElement(HOME_PAGE_COMMENTS);

            String commentsToParse = homePageComments.getText();
            commentsToParse = commentsToParse.substring(1, commentsToParse.length()- 1);
            commentsToCompare = Integer.valueOf(commentsToParse);
        }
        LOGGER.info("Open article. Save and check title");
        homePageTitle.click();
        String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText().trim();
        Assertions.assertEquals(titleToCompare, apTitle, "wrong title on article page");

        LOGGER.info("Find, save and check comments count");
        Integer apComments = Integer.valueOf(driver.findElement(ARTICLE_PAGE_COMMENTS).getText().substring(1, driver.findElement(ARTICLE_PAGE_COMMENTS).getText().length() - 1));

        Assertions.assertEquals(commentsToCompare, apComments, "wrong comments count on article page");

        LOGGER.info("Open comments page. Save and check title");
        driver.findElement(ARTICLE_PAGE_COMMENTS).click();
        String cpTitle = driver.findElement(COMMENT_PAGE_TITLE).getText().trim();

        Assertions.assertEquals(titleToCompare, cpTitle, "wrong title on comment page");

        LOGGER.info("Find, save and check comments count");

        Integer cpCommentsToCompare  = 0;
        if (!driver.findElements(COMMENT_PAGE_COMMENT).isEmpty()) {
            WebElement cpComments = driver.findElement(COMMENT_PAGE_COMMENT);

            String cpCommentsToParse = cpComments.getText();
            cpCommentsToParse = cpCommentsToParse.substring(1, cpCommentsToParse.length()- 1);
            cpCommentsToCompare = Integer.valueOf(cpCommentsToParse);
        }

        Assertions.assertEquals(commentsToCompare, cpCommentsToCompare, "Wrong comments count on comments page");

        driver.close();
        System.out.println("Everything is OK!");


    }
}

