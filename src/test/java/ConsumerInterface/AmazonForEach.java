package ConsumerInterface;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonForEach {

	public static void main(String[] args) 
	{
		//***************************Selenium usage for Lamba expression + forEach loop
		//webDriver Example of for each as consumer parameter
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		//elements.forEach(e -> System.out.println(e.getText()));
		
         
          
          Consumer<WebElement> consumer3 = e -> {
			if(!e.getText().isBlank())
				System.out.println(e.getText());			
				};
          
			
		elements.forEach(consumer3);
		
		driver.quit();
	
	}

}


