package ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Runner 
{
	public static void main(String args[])
	{
		List<String> list = Arrays.asList("Atul","Anil","Rajguru");
		
		
		System.out.println("********************//passing consumer reference***************************");
		//passing consumer reference
		Consumer<String> consumer = (s) -> System.out.println(s);
		list.forEach(consumer);
		
		
		System.out.println("********************//passing the lambda expression***************************");
		//passing the lambda expression
		list.forEach(s->System.out.println(s));
		list.forEach(s->System.out.println(s.toUpperCase()));
		list.forEach(s->System.out.println(s.toLowerCase()));
		
		
		System.out.println("********************invoking andThen method of consumenr interface***************************");
		//invoking andThen method of consumenr interface
		Consumer<String> consumer1 = (s) -> System.out.println(s.toUpperCase());
		Consumer<String> consumer2 = (s) -> System.out.println(s.toLowerCase());
		list.forEach(consumer1.andThen(consumer2));
		
		
	}

		
		
		
	
}
