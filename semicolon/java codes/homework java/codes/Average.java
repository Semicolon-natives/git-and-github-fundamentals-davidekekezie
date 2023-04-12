import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter firstNumber");
		int firstNumber = userInput.nextInt();
		System.out.println("Enter secondNumber");
		int secondNumber = userInput.nextInt();
		System.out.println("Enter thirdNumber");
		int thirdNumber = userInput.nextInt();
		int averageAcceleration = (firstNumber + secondNumber)/ (thirdNumber);
		System.out.println("The average acceleration covered is " + averageAcceleration);


}
}



