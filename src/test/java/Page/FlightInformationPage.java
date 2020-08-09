package Page;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FlightInformationPage extends BasePage {
    public FlightInformationPage(WebDriver driver) {
        super(driver);
    }

    public void flightinformation(String kadi,String soyad,String tc,String hes,String tel,String email){

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       clickselector("#lb-female");
        //setByselector("input.mandatory.alpha.firstname.invalid",kadi);
        setByselector("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(3) > div.row-item.left > div:nth-child(1) > input",kadi);
        setByselector("body > div.container > div.div-reservation-in.margin-top-spacing > div.div-reservation-content.passenger-form > div.details.passenger-count > div > div.passenger-item-right > div:nth-child(3) > div.row-item.left > div:nth-child(2) > input",soyad);
        Select multiSelect = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div[1]/select")));
        multiSelect.selectByValue("04");
        Select multiSelect2 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div[2]/select")));
        multiSelect2.selectByValue("08");
        Select multiSelect3 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div[3]/select")));
        multiSelect3.selectByValue("1998");
        Select multiSelect4 = new Select(driver.findElement(By.id("passenger-nationality")));
        multiSelect4.selectByValue("TR");
        setByselector("input.citizenno",tc);
        setByselector("input.hesCode",hes);
        Select multiSelect5= new Select(driver.findElement(By.id("phoneprefix")));
        multiSelect5.selectByValue("+90");
        setById("txtPhone",tel);
        setById("txtEmail",email);
        Assert.assertEquals("Uçuş Rezervasyon - turna.com",driver.getTitle());
    }




}
