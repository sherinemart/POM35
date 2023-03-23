package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageclass.LoginPage;

public class Logintc {
  @Test
  public void login() {
	  
	   System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver110\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver d= new ChromeDriver(options);
		
		 d.get("https://demo.guru99.com/test/newtours/index.php");
			
		 d.manage().window().maximize();
		 
		  PageFactory.initElements(d, LoginPage.class);
		  LoginPage.user.sendKeys("jhfhf");
		  LoginPage.pswd.sendKeys("wterwg");
		  LoginPage.submit.click();
		  
		  /*
		  // Page Object Model
		  LoginPage.user(d).sendKeys("dfg");
		  LoginPage.pswd(d).sendKeys("wterwg");
		  LoginPage.submit(d).click();
		  */
		  
		  /*
		  d.findElement(By.name("userName")).sendKeys("ewrerwt");
		  d.findElement(By.name("password")).sendKeys("wterwg");
		  d.findElement(By.name("submit")).click();
		  */
  }
}
