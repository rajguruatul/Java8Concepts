package InbuildFunctionalGenerics;

public class Runner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IPrintableOneArgumentgeneric<String> obj1 = (s) -> System.out.println("1 . Lambda expression using Generics as String Argument:"+s);
		obj1.print("testString");
		
		IPrintableOneArgumentgeneric<Integer> obj2 = (s) -> System.out.println("2 . Lambda expression using Generics as int Argument:"+s);
		obj2.print(9);
		
		IPrintableOneArgumentReturnGeneric<String, String, String> obj3 = (a,b) -> a+b;
		System.out.println("3 . Lambda expression using Generics 2 argument and Retrun type :"+obj3.print1("Atul", "Rajguru")); 
		

	}

}
