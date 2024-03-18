package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("titile is :"+driver.getTitle());
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		System.out.println("alert clicked"+driver.findElement(By.xpath("//button[@id='alertButton']")).isSelected());
		org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();    


	}

}
