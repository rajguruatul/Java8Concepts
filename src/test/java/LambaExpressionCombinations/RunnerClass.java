package LambaExpressionCombinations;

public class RunnerClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//calling
		IPrintableStringArgument obj1 = (s) -> System.out.println("Lambda Expression for String Argument :"+s);
		obj1.print1("Atul");
		
		IPrintableIntArgument obj2 = (s) -> System.out.println("Lambda Expression for Int Argument "+s);
		obj2.print1(9);

		IPrintableIntStringArgument obj3 = (s,n) -> System.out.println("Lambda Expression for String as :"+s+" and Int Argument as :"+n);
		obj3.print1("Atul", 9);
	
		IPrintableReturn obj4 = () -> (java.time.LocalDateTime.now().getHour()>12)? "afternoon" : "Morning";
		System.out.println(obj4.print1());
		
		IPrintableArgumentReturn obj5 = (n) -> n*n;
		System.out.println("The sqaure of the number is 5 :"+obj5.print1(5));
	
		IPrintableArgumentRetrunBoolean obj6 = n -> n%2==0? true : false;
		System.out.println("the number 102 is Even number :"+obj6.isEven(102));
		System.out.println("the number 103 is Even number :"+obj6.isEven(103));
	
	}
	
	
	

}
