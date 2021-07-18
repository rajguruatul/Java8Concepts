package ConsumerInterface;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConsumerinterfaceSelectDropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		
		
//		//1. Convention way of declaring and calling
//		selectValueFromDropDown(element,"1","index");
//		Thread.sleep(3000);
//		selectValueFromDropDown(element,"2","value");
//		Thread.sleep(3000);
//		selectValueFromDropDown(element,"Aqua","Text");
//		Thread.sleep(3000);
		
		
		//2. Selecting select option using consumer Class
		selectFromDropdown(e -> e.selectByIndex(1), element);
		Thread.sleep(3000);
		selectFromDropdown(e -> e.selectByValue("2"), element);
		Thread.sleep(3000);
		selectFromDropdown(e -> e.selectByVisibleText("Aqua"), element);
		Thread.sleep(3000);
		
		//3. select using Stream + skip + foreach feature
		List<WebElement> options = new Select(driver.findElement(By.id("cars"))).getOptions();
		options.stream().skip(2).forEach(e->e.click());
		
		
		
		driver.quit();
	}
	

	
	
	//1. conventional Way
	public static void selectValueFromDropDown(WebElement element,String indexOrValueOrText,String type)
	{
		Select select = new Select(element);
		
		if(type.equalsIgnoreCase("index"))
			select.selectByIndex(Integer.parseInt(indexOrValueOrText));
		else if(type.equalsIgnoreCase("value"))
			select.selectByValue(indexOrValueOrText);
		else if(type.equalsIgnoreCase("Text"))
			select.selectByVisibleText(indexOrValueOrText);
		else
			System.out.println("invalid option selected");
	}

	
	//2.Select using Consumner interface
	
	public static void selectFromDropdown(Consumer<Select> consumer,WebElement element)
	{
		consumer.accept(new Select(element));
	}
}
