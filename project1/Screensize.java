package project1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\git\\uniathena-automation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(3000);
        //driver.manage().window().maximize();
        Dimension dimension = new Dimension(800, 600);
        driver.manage().window().setSize(dimension);
        String titleValue = driver.getTitle();
        System.out.print("Title is : "+titleValue);
        System.out.print("URL is:"+driver.getCurrentUrl());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        
        
	}

}
