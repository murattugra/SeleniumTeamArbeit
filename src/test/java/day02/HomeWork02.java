package day02;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeWork02 {

    //1.Yeni bir class olusturalim (Homework)



    //


    //6. Tekrar “facebook” sayfasina donun
    //7. Sayfayi yenileyin
    //8. Sayfayi tam sayfa (maximize) yapin
    //9.Browser’i kapatin


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.


        driver.get("https://www.facebook.com/");

        String actualTitle= driver.getTitle();
        String expectedResult="facebook";

        if (actualTitle.equals(expectedResult)){
            System.out.println("PASS");
        }else{
            System.out.println(actualTitle);
        }


        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //
        //yazdirin.

        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.contains(expectedResult)){
            System.out.println("PASS");
        }else{
            System.out.println(actualUrl);
        }


        //4.https://www.walmart.com/ sayfasina gidin.

        driver.navigate().to("https://www.amazon.de/");
        Thread.sleep(3000);
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        actualTitle=driver.getTitle();
        expectedResult="Amazon.de: Günstige Preise für Elektronik & Foto, Filme, Musik, Bücher, Games, Spielzeug & mehr";

        Assert.assertEquals(actualTitle,expectedResult);







    }




}
