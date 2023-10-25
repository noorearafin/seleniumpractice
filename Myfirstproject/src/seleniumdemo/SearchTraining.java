package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTraining {

    WebDriver driver;
	
    public void LaunchBrowser() {
       System.setProperty("ChromeDriver","Referenced Libraries/selenium-chrome-driver-4.14.1.jar");
       driver = new ChromeDriver();
       driver.get("https://www.simplilearn.com");
    }
    
    public void search() throws InterruptedException {
    	driver.findElement(By.id("header_srch")).sendKeys("selenium");
       Thread.sleep(3000);
    	driver.findElement(By.xpath("//span[@class='search_icon']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//h2[Text()='Selenium 3.0 Training']")).click();
    	System.out.println("The :"+ driver.getTitle());
    }
    public void closeBrowser() {
    	driver.quit();
    }
    
	public static void main(String[] args) throws InterruptedException {
	//searching selenium training 
		
		SearchTraining obj = new SearchTraining();
		obj.LaunchBrowser();
		obj.search();
		obj.closeBrowser();
		
		
	}

}
