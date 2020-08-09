package Testturna;

import Base.TestBase;
import Page.FlightInformationPage;
import Page.HomePage;
import Page.TicketPage;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class turnatest extends TestBase {

    @Test
    public void testturna() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         new HomePage(driver).biletislemleri("kars","istanbul");
         new TicketPage(driver).ticketpage();
         new FlightInformationPage(driver).flightinformation("kübra","muslu","076748628","63476","563948563945863","kb@vu.com");
    }

}
