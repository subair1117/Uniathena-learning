package project1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);     
        WebElement el = driver.findElement(By.tagName("a"));
        System.out.println("Link Text:" +el.getText());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println("Number of elements : "+elements.size());
        
        for (int i=0; i<elements.size();i++) {
        	System.out.println("Link text :" + elements.get(i).getText());
        	
      
        }
        

	}

}
