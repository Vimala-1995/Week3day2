package Week3day2Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafgroundalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text( )='Show']")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	    driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']/.//span[text( )='Show']")).click();
	    Alert b=driver.switchTo().alert();
	    b.sendKeys("Hello Welcome");
		System.out.println(b.getText());
		b.accept();
		
		 driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']/.//span[text( )='Show']")).click();
		    Alert x=driver.switchTo().alert();
			System.out.println(x.getText());
			x.accept();
			driver.findElement(By.xpath("//*[@id='j_idt88:j_idt111']/.//span[text( )='Show']")).click();
		    Alert e=driver.switchTo().alert();
			System.out.println(e.getText());
			e.accept();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']/.//span[text( )='Show']")).click();
			driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']/.//span[text( )='Show']")).click();
			driver.findElement(By.xpath("//span[text( )='Dismiss']")).click();
		    Alert d=driver.switchTo().alert();
			System.out.println(d.getText());
			d.accept();
	
	}

}
