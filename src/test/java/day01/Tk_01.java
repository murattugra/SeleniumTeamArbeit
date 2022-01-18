package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tk_01 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.de/");

       Thread.sleep(5000);

        driver.navigate().to("https://www.ebay.de/");

       // Thread.sleep(5000);

        driver.navigate().back();

       // Thread.sleep(5000);

        driver.navigate().refresh(); // sayfayi yenilemek icin kullanilir

       // Thread.sleep(5000);

        driver.manage().window().maximize();


        driver.close();




    }



}
