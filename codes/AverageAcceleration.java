import java.util.Scanner;
public class AverageAcceleration{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter v0");
		double v0 = userInput.nextDouble();
		System.out.println("Enter v1");
		double v1 = userInput.nextDouble();
		System.out.println("Enter t");
		double t = userInput.nextDouble();
		double averageAcceleration = (v0 + v1)/ (t);
		System.out.println("The average acceleration covered is " + averageAcceleration);


}
}



