package project1;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_event {
	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();
    System.out.println("title is :"+ driver.getTitle());
    WebElement signlink = driver.findElement(By.xpath("//a[@id='opentab']"));
    Actions clicklink = new Actions(driver);
    //clicklink.click(signlink).build().perform();
   // clicklink.clickAndHold().build().perform();
   // clicklink.contextClick(signlink).build().perform();
   // clicklink.doubleClick(signlink).build().perform();
   // clicklink.moveToElement(signlink).build().perform();
    driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
    WebElement dragg = driver.findElement(By.xpath("//img[@src='images/high_tatras_min.jpg']"));
    WebElement dropp = driver.findElement(By.xpath("//div[@id='trash']"));
    clicklink.dragAndDrop(dragg, dropp).build().perform();
    driver.close();     
    }
}