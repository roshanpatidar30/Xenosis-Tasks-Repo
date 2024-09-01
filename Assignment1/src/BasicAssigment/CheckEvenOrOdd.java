package BasicAssigment;

import java.util.Scanner;

public class CheckEvenOrOdd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integer number: ");
int input = sc.nextInt();
if(input % 2 == 0) {
	System.out.println("It is Even number");
}
else {
	System.out.println("It is Odd number");
}
}
}
