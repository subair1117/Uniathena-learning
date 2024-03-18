package project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
		ChromeOptions incognito = new ChromeOptions();
		incognito.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(incognito);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("title is :"+driver.getTitle());
		System.out.println("url is :"+driver.getCurrentUrl());
		WebElement googlebutton = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		if (googlebutton.isDisplayed()) {
			System.out.println("pass"); 
		}
			else
				System.out.println("fail"); 
			}
	}

