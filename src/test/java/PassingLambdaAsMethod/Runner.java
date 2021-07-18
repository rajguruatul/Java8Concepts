package PassingLambdaAsMethod;

public class Runner
{

	static void  perform(Animal animal)
	{
		animal.run();
	}
	
	
	public static void main(String[] args) 
	{
		//conventional method
		Animal animal = new Dog();
		perform(animal);
		
		//user can directly pass the Object
		perform(new Cat());
		
		//overiding using lambda and then passing object 
		Animal animal1 = () -> System.out.println("Dog is running and barking");
		perform(animal1);
		
		//overiding using lambda and then passing object 
		perform(() -> System.out.println("Dog is running and barking and moving his tail"));
		

	}

}
