package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;

    }

    //arama hereyerde olabileceği için buraya aldık yoksa homepage de olurdu
   /* public void Search(String search) throws InterruptedException {
        Thread.sleep(4000);
        clickxpath("//*[@id=\"product-search-0\"]/input");
        Thread.sleep(4000);
        setById("product-search-0",search);


    }*/
    //information=bilgi
    public void setById(String idsend,String information){
        driver.findElement(By.id(idsend)).clear();
        driver.findElement(By.id(idsend)).sendKeys(information,Keys.ENTER);



    }
    public void clickId(String idclick){

        driver.findElement(By.id(idclick)).click();


    }
    //path=yol
    public void clickxpath(String yol){

        driver.findElement(By.xpath(yol)).click();
    }
    public void clickname(String yol){

        driver.findElement(By.name(yol)).click();
    }
    public void clickselector(String yol){

        driver.findElement(By.cssSelector(yol)).click();
    }

    public void setByselector(String id2send,String information2)
    {
        driver.findElement(By.cssSelector(id2send)).clear();
        driver.findElement(By.cssSelector(id2send)).sendKeys(information2);
    }
    public void setByxpath(String id2send,String information2)
    {
        driver.findElement(By.xpath(id2send)).clear();
        driver.findElement(By.xpath(id2send)).sendKeys(information2);
    }
    public void clickBy(By by){

        driver.findElement(by).click();

    }
    public void setBy(By by,String bilgi){
        driver.findElement(by).sendKeys(bilgi);

    }
}

