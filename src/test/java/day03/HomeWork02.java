package day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class HomeWork02 {

    //  /*
    //        1-driver olusturalim
    //        2-java class'imiza chromedriver.exe'yi tanitalim
    //        3-driver'in tum ekrani kaplamasini saglayalim
    //        4-https://github.com/ adresine gidelim
    //        5-Ardindan https://www.hepsiburada.com/ adrsine gidelim
    //        6-Title ve url console da yazdirin ve yine title ve url in "burada" kelimesini icerip icermedigini kontrol edelim
    //        7-Sonrasinda https://github.com/ adresine geri donelim ve  sayfayi yenileyelim
    //        8-Son adim olarak butun sayfalarimizi kapatmis olalim
    //     */


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://github.com/");
        driver.navigate().to("https://www.hepsiburada.com/");

        String title=driver.getTitle();
        String url=driver.getCurrentUrl();

        System.out.println(title);
        System.out.println(url);

        String exectedResult="burada";

       // Assert.assertEquals(title,exectedResult);
      //  Assert.assertEquals(url,exectedResult);

        if (title.contains(exectedResult)){
            System.out.println("title tets PASS");

        }else {
            System.out.println("title Test FAILED");


        }


        if (url.contains(exectedResult)){
            System.out.println("url tets PASS");

        }else {
            System.out.println("url Test FAILED");


        }


        driver.navigate().back();
       // Thread.sleep(10000);
      driver.navigate().back();// bazi sayfalarda allert kaynakli yeni bir site olarak  gorebiliyor bu nedenle
                                // ilk yapilan bac te tekrar bulundugumuz siteye donuyor
      driver.navigate().refresh();

       driver.quit();




    }



}
