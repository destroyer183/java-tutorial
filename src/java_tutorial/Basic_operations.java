package java_tutorial;

public class Basic_operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		variable 'x' has been declared, but not initialized
//		if you print x before initializing it, the code will error
		int test1;
		test1 = 5;
		
		char test2;
		test2 = 'f';
		
		System.out.println("separately declaring and initializing variables");
		System.out.println(String.format("int test1 = %d", test1));
		System.out.println(String.format("char test2 = %c", test2));
		
		System.out.println("");
		
		int x = 5;
		int y = 7;
		double z = 57;
		double sum = (x - y * (y * y)) / z;
		
		System.out.println("adding/subtracting/multiplying/dividing variables");
		System.out.println(String.format("double sum = %.1f", sum));
		
		System.out.println("");
		
		
//		division works differently in java.
//		even though z / y has a decimal, 'u' won't be able to represent that because it's variable type is integer and not float.
//		even if we make 'u' a double instead of int, it won't have a decimal. this is because 'y' and 'z' are both ints.
//		by making just one of either 'y' or 'z' a double, 'u' will have a decimal value.
//		if one of the operands is a double, then any output will also be a double.
		double u = z / y;
		
		double d = Math.pow(x, y);

		System.out.println("variables with more operators");
		System.out.println(String.format("double u = %f", u));
		System.out.println(String.format("double d = %f", d));		
		
		
		

	}

}