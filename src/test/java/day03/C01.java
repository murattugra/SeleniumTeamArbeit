package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {

// 1. Bir class oluşturun: LoginTest
// 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.



    public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // a. http://a.testaddressbook.com adresine gidiniz.

        driver.get(" http://a.testaddressbook.com");

        // b. Sign in butonuna basin

            WebElement signIn= driver.findElement(By.id("sign-in"));

            signIn.click();


    // c. email textbox,password textbox, and signin button elementlerini locate ediniz..

        WebElement emailtextBox= driver.findElement(By.className("form-control"));
        WebElement passwordTextBox= driver.findElement(By.name("session[password]"));
        WebElement signInButton=driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        emailtextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");

        Thread.sleep(3000);

        signInButton.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).

        WebElement UserId=driver.findElement(By.className("navbar-text"));

        String expecteduserId="testtechproed@gmail.com";
        String actualuserId=UserId.getText();

        System.out.println(expecteduserId.equals(actualuserId)? " userId PASS":"userId FAILED");

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement addresses= driver.findElement(By.linkText("Addresses"));
        WebElement signOut=driver.findElement(By.linkText("Sign out"));

        System.out.println( addresses.isDisplayed());
        System.out.println(signOut.isDisplayed());

        // 3. Sayfada kac tane link oldugunu bulun

        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        System.out.println(linkler.size());

        // linkleri yazdiriniz
        for (WebElement each: linkler) {

            System.out.println(each.getText());

        }











    }





}
