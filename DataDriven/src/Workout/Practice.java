package Workout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	

public class Practice {
	
	String [][] data= {
			
			{"Admin","dummy"},
			{"Admin","admin123"},
			{"dummy","dummy"},
			{"dummy","admin123"}
			
	};	
	
	@DataProvider(name="log in")
	public String[][]  dataSet() {
		return data;
		
	}
	
	@Test(dataProvider = "log in")
	public void logIn(String uname,String psw) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement UserName=driver.findElement(By.xpath("//*[@id=\'txtUsername\']"));
		UserName.sendKeys(uname);
		
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.sendKeys(psw);
		
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		
	}

}
