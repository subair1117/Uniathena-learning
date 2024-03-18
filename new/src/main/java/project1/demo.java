package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        String titleValue = driver.getTitle();
        System.out.print("Title is : "+titleValue);
        String titleURL = driver.getCurrentUrl();
        System.out.print("Url is:"+titleURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
        
        WebElement ele =driver.findElement(By.xpath("//div[@aria-label='iphone 14 plus']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).click();
        //driver.close();   
	} 
       

}
