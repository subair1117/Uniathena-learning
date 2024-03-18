package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 String titleURL = driver.getCurrentUrl();
	     System.out.print("Url is:"+titleURL);
	     driver.findElement(By.xpath("//input[@value='radio2']")).click();
		System.out.println("The output IsSelected"+driver.findElement(By.xpath("//input[@value='radio2']")).isSelected());
		Select dropdown = new
				Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		//dropdown.selectByVisibleText("Option2");		 
	     dropdown.selectByIndex(3);
		driver.close();
		
	}

}
