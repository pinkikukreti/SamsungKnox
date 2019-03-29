package Script1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firstTC {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pinki.kala\\Desktop\\drivers\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoforum.verimployee.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
		
		WebElement d1=driver.findElement(By.xpath("//input[@formcontrolname='email']"));
		d1.sendKeys("pinkikukreti0@gmail.com");
		
		driver.findElement(By.xpath("//input[@formcontrolname='confirmEmail']")).sendKeys("pinkikukreti0@gmail.com");
		
		driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys("pinki");
		
		driver.findElement(By.xpath("//input[@formcontrolname='middleName']")).sendKeys("k");
		
		driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys("k");
		
		
		Select select = new Select(driver.findElement(By.xpath("//select[@formcontrolname='gender']")));
		
		select.selectByVisibleText("Female");
		
		driver.findElement(By.xpath("//input[@formcontrolname='age']")).sendKeys("30");
		
		driver.findElement(By.xpath("//input[@formcontrolname='zipCode']")).sendKeys("122018");
		
		WebElement state =driver.findElement(By.xpath("//input[@formcontrolname='state']"));
		
		System.out.println(state.getText());
		
		WebElement city =driver.findElement(By.xpath("//input[@formcontrolname='city']]"));
		
		System.out.println(city.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
