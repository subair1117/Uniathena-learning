package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("title is:"+ driver.getTitle());
		Actions keyboard = new Actions(driver);
		/*driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("chatgpt" +Keys.ENTER );
		Action keydown =keyboard.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();*/
		WebElement el = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		keyboard.keyDown(Keys.SHIFT).sendKeys("chatgpt").keyUp(Keys.SHIFT).sendKeys(" chatgpt").perform();
		//driver.close();
	}

}
