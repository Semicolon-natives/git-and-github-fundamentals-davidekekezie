import java.util.Scanner;
public class Interest{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter balance");
		int balance = userInput.nextInt();
		System.out.println("Enter annualInterestRate")
		int annualInterestRate = userInput.nextInt();
		int interest = balance *(annualInterestRate/1200);
		System.out.println("The interest of" + balance + "and" + annualInterestRate + "is" + interest);















}

}