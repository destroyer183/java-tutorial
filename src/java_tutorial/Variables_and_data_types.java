package java_tutorial;

public class Variables_and_data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
//		valid variable names: hello, _hello, hello_, _hello_, helloWorld, hello_world
//		invalid variable names: hello name, hello*, hello%
		
//		always declare variables BEFORE referencing them. if line 14 is before line 12, it will error.
//		primitive data types (immutable)
		int hello_world = 9;
		double num2 = 5.947265;
		boolean b = false;
		char c = 'h';
		
//		not primitive
		String str = "9";
		
//		different format syntax for different variables
		System.out.println("variables:");
		System.out.println(String.format("int hello_world = %d", hello_world));
		System.out.println(String.format("double num2 = %.1f", num2));
		System.out.println(String.format("boolean b = %b", b));
		System.out.println(String.format("char c = %c", c));
		System.out.println("String str = " + str);
		
		System.out.println("");
		
//		don't do 'String tim = hello_world;' because 'hello_world' isn't a String
		int tim = hello_world;
		
		System.out.println("declaring variables with other variables as their value");
		System.out.println(String.format("int tim = %d", tim));
		System.out.println(String.format("int hello_world = %d", hello_world));
		

		


	}

}
