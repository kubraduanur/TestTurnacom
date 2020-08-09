package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static constant.ConstantElement.*;

public class TicketPage extends BasePage {
    public TicketPage(WebDriver driver) {
        super(driver);
    }

    public void ticketpage() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickselector("input.from-in-button");
        clickselector("input.to-in-button");
        clickselector("button.bt-choose");
        Assert.assertEquals("Uçuş Rezervasyon - turna.com",driver.getTitle());
    }
}
