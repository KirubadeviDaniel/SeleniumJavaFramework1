package mypkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
public class FirstTest {
	 public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://selenium.dev");

	        //driver.quit();
	        driver.get("https://www.selenium.dev/selenium/web/inputs.html");

		    // Click on the element 
	        WebElement checkInput=driver.findElement(By.name("checkbox_input"));
	        checkInput.click();
	        
	        driver.get("https://www.facebook.com");
	        WebElement e=driver.findElement(By.name("email"));
	        e.sendKeys("myname");
	        System.exit(0);
	    }
}
