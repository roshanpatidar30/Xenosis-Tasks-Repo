package BasicAssigment;

import java.util.Scanner;

public class CalculatorProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your operator: ");
		char operator = sc.next().charAt(0);
		System.out.println("Enter the first number");
		Double input1 = sc.nextDouble();
		System.out.println("Enter the second number");
		Double input2 = sc.nextDouble();
		Double result;
		switch (operator) {

		case '+':
			result = input1 + input2;
			System.out.println(result);
			break;
			
		case '-':
			result = input1 - input2;
			System.out.println("susbtraction is : "+result);
			break;
			
		case '*': 
			result = input1 * input2;
			System.out.println("multiplication is: "+ result);
			break;
			
		case '/':
			result = input1 / input2;
			System.out.println("division is: "+ result);
			break;
			default : 
				System.out.println("Invalid Operator!");
				break;
		}
		

	}
}
