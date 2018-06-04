package Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ColourCode {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\vijju selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]"));
		Actions action = new Actions(driver);
		   action.moveToElement(element).build().perform();
		   String colorafterhover = element.getCssValue("color");
		   System.out.println("The color after  hover is"+colorafterhover);
		   String[] numbers =colorafterhover.replace("rgba(","").replace(")","").split(",");
		   System.out.println(numbers);
		   
			int r=Integer.parseInt(numbers[0].trim());
			int g=Integer.parseInt(numbers[1].trim());
			int b=Integer.parseInt(numbers[2].trim());
			int a=Integer.parseInt(numbers[3].trim());
			System.out.println("r: " + r + " g: " + g + " b: " + b + " a: " + a);
			String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b) + Integer.toHexString(a);
			System.out.println(hex);
	}
}
