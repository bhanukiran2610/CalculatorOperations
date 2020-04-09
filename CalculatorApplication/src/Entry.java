import console.util.ConsoleInput;

public class Entry {
	public static void main(String []args) {
		System.out.println("1.Addition of two integers");
		System.out.println("2.Addition of two floats");
		System.out.println("3.Subtraction of two floats");
		System.out.println("4.Subtraction of two ints");
		
		System.out.println("Enter the choice of Input ");
		int choice=ConsoleInput.getInt();
		while(choice!=5) {
			switch(choice) {
			case 1:
				
				System.out.print("Enter the First Number :");
				int num1= ConsoleInput.getInt();
				System.out.print("Enter the second Number :");
				int num2=ConsoleInput.getInt();
				CalculatorOperations objCalculator=new CalculatorOperations();
				int result=objCalculator.add(num1, num2);
				System.out.println("Sum of two numbers is "+ result);
				break;
			case 2:
				
				System.out.print("Enter the First Number :");
				float num3= ConsoleInput.getFloat();
				System.out.print("Enter the second Number :");
				float num4=ConsoleInput.getFloat();
				CalculatorOperations objCalculator1=new CalculatorOperations();
				float result1=objCalculator1.add(num3, num4);
				System.out.println("Sum of two numbers is "+ result1);
				break;
			case 3:
				
				System.out.print("Enter the First Number :");
				float num5= ConsoleInput.getFloat();
				System.out.print("Enter the second Number :");
				float num6=ConsoleInput.getFloat();
				CalculatorOperations objCalculator2=new CalculatorOperations();
				float result3=objCalculator2.subtract(num5, num6);
				System.out.println("Sum of two numbers is "+ result3);
				break;
			case 4:
				
				System.out.print("Enter the First Number :");
				int num7= ConsoleInput.getInt();
				System.out.print("Enter the second Number :");
				int num8=ConsoleInput.getInt();
				CalculatorOperations objCalculator3=new CalculatorOperations();
				int result4=objCalculator3.subtract(num7, num8);
				System.out.println("Sum of two numbers is "+ result4);
				break;
				
			default:
				System.out.println("Invalid Choice");
						
			}
			System.out.println("Enter the choice of Input and press 5 to Quit ");
			choice=ConsoleInput.getInt();
		}
		
		
		
		/*System.out.print("Enter the First Number :");
		int num1= ConsoleInput.getInt();
		System.out.print("Enter the second Number :");
		int num2=ConsoleInput.getInt();
		CalculatorOperations objCalculator=new CalculatorOperations();
		int result=objCalculator.add(num1, num2);
		System.out.print(" Sum of two numbers is "+ result);*/
	}
}
