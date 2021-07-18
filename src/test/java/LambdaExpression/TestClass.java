package LambdaExpression;

public class TestClass 
{

	
	public static void main(String args[])
	{
		// 1. Override the menthod in Interface using Lamda Expression
		
		IPrintable obj1 = new IPrintable()
		{
			
			@Override
			public void print() 
			{
				System.out.println("Example using anonymous class");
				
			}	
		};
		
		obj1.print();
		
		//2. Override using Lambda expression
		
		IPrintable obj2 = ()->System.out.println("Example using Lambda Expression");
		obj2.print();
	}
	
}

