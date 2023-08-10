package Week3day2Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafgroundframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()=\"Try it\"]")).click();
		Alert alert=driver.switchTo().alert();
		String text1=alert.getText();
		System.out.println(text1);
		alert.accept();
		String text2=driver.findElement(By.id("demo")).getText();
		System.out.println(text2);
		if(text2.contains("you pressed")) {
			System.out.println("Name is printed successfully");
		}
		
		
		
		//driver.findElement(By.xpath("//iframe[@id='iframeResult']"))
		//driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		//driver.findElement(By.xpath("//button[text()='Try it']"));
		
	}
	
 
}
