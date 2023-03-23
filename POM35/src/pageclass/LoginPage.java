package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	
	@FindBy(how=How.NAME,using="userName")
	public static WebElement user;
	
	@FindBy(name="password")
	public static WebElement pswd;
	
	@FindBy(xpath="/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")
	public static WebElement submit;
	
	/*
 
	public static WebElement user(WebDriver d)
	{
		return d.findElement(By.name("userName"));			  
  }
	
	public static WebElement pswd(WebDriver d)
	{
		return d.findElement(By.name("password"));
			  
 }
	public static WebElement submit(WebDriver d)
	{
		return d.findElement(By.name("submit"));
 }*/
     	
} 
