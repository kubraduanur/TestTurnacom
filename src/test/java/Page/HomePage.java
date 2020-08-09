package Page;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static constant.ConstantElement.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {



    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.turna.com/");
    }

    public void biletislemleri(String yer1,String yer2) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions action=new Actions(driver);
        clickselector("label#lb-way");
        //clickselector("span.popup-close");
        clickBy(SELECT_TICKET1);
        setBy(SELECT_TICKET1,yer1);
        clickBy(SELECT_TICKET2);
        setBy(SELECT_TICKET2,yer2);
         action.moveToElement(driver.findElement(By.name("fromdate"))).doubleClick().perform();
         clickselector("td.dp-highlight.ui-datepicker-current-day");
        action.moveToElement(driver.findElement(By.name("todate"))).doubleClick().perform();
        clickselector("table.ui-datepicker-calendar");
       clickId("btnSearch");


    }




}
