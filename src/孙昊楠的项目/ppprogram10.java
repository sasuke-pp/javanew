package ���骵���Ŀ;
import java.util.Scanner;
public class ppprogram10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter annul interest rate, e.g., 7.25: ");
        double annulInterestRate = input.nextDouble();
        double monthlyInterestRate = annulInterestRate / 1200;
        System.out.print("Enter number of years as an interge, e.d., 5: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 
        	- 1 / Math.pow(1 + monthlyInterestRate,  numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int )(totalPayment * 100) / 100.0);
	}

}
