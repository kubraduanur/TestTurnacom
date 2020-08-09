package Base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestBase {

   public WebDriver driver;


    @Before
    public void testbefore(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\IdeaProjects\\TestTurnacom\\src\\test\\resource\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
@After
    public void testafter() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.quit();

}
}
