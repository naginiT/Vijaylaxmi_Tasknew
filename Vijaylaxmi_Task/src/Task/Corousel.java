package Task;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Corousel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\vijju selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cubicitsolution.co.in/#");
		driver.manage().window().maximize();
		List<WebElement> x=driver.findElements(By.xpath("//div[@class='sb-description']/h3"));
		 System.out.println("number of images" +x.size());
	        for(int i = 0; i < x.size(); i++){
	            System.out.println(x.get(i).getAttribute("outerText"));
	        }
	}

}
