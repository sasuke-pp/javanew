package ���骵���Ŀ;
import java.util.Scanner;
public class ppprogram11 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter an amount in double, for example 11.56: ");
	        double amount = input.nextDouble();
	        int remainingAmount = (int)(amount * 100);
	        int numberOfOneDollars = remainingAmount / 100;
	        remainingAmount = remainingAmount % 100;
	        int numberOfQuarters = (int)remainingAmount / 25;
	        remainingAmount = remainingAmount % 25;
	        int numberOfDimes = (int)remainingAmount / 10;
	        remainingAmount = remainingAmount % 10;
	        int numberOfNickels = (int)remainingAmount / 5;
	        remainingAmount = remainingAmount % 5;
	        int numberOfPennies = remainingAmount;
	        System.out.println("Your amount " + amount + " consists of");
	        System.out.println(" " + numberOfOneDollars + " dollars");
	        System.out.println(" " + numberOfQuarters + " dollars");
	        System.out.println(" " + numberOfDimes + " dollars");
	        System.out.println(" " + numberOfNickels + " dollars");
	        System.out.println(" " + numberOfPennies + " dollars");
	}

}
