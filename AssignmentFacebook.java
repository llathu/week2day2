package Week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {
	private static WebElement webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Latha");
		driver.findElement(By.name("lastname")).sendKeys("Leo Xavier Raj");
		driver.findElement(By.name("reg_email__")).sendKeys("llathu2005@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("llathu2005@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("lathadanny");
		
		WebElement eledropdown = driver.findElement(By.id("day"));
		Select date = new Select(eledropdown);
		date.selectByVisibleText("2");
		WebElement eledropdown1 = driver.findElement(By.id("month"));
		Select month = new Select(eledropdown1);
		month.selectByVisibleText("Jun");
		WebElement eledropdown2 = driver.findElement(By.id("year"));
		Select year = new Select(eledropdown2);
		year.selectByVisibleText("1978");
		
		driver.findElement(By.className("_58mt")).click();
		
		
		
		
		


	}

}
