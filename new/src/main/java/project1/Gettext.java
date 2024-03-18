package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String heading = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
        System.out.println("heading is:"+heading);
        driver.findElement(By.xpath("//input[@class='btn_action']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
        System.out.println("Error message is:" +driver.findElement(By.xpath("//h3[@data-test='error']"))
        .getText());
        driver.close();
        
	}

}
