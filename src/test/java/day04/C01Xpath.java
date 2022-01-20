package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01Xpath {










    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin

        WebElement addBox=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addBox.click();

        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteBox=driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteBox.isDisplayed()){
            System.out.println("deleteBox Test PASS");
        }else {
            System.out.println("deleteBox Test FAILED");
        }
        //4- Delete tusuna basin

        deleteBox.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveElement=driver.findElement(By.xpath("//h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("addRemove TEST PASS");
        }else {
            System.out.println("addRemove Test FAILED");
        }


    }





}
