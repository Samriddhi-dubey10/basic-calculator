package display;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		double num1;
		double num2;
		double ans;
		char choice;
		Scanner obj =  new Scanner(System.in);
		System.out.println("Enter  two number");
		num1 = obj.nextDouble();
		num2 = obj.nextDouble();
		System.out.print("\nEnter an operator (+, -, *, /): ");
	      choice = obj.next().charAt(0);
	      switch(choice) {
	         case '+': ans = num1 + num2;
	            break;
	         case '-': ans = num1 - num2;
	            break;
	         case '*': ans = num1 * num2;
	            break;
	         case '/': ans = num1 / num2;
	            break;
	      default: System.out.printf("Error! Enter correct operator");
	         return;
	      }
	      System.out.println("\n The result is :");
	      System.out.println(num1 + " " + choice + " " + num2 + " = " + ans);
		
	}
  
}
