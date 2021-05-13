package application;

import java.util.Locale;
import java.util.Scanner;

import bank.Transaction;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Transaction transaction; 

		System.out.print("Enter account number: ");
		int acNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String acHolder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);

		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();

			transaction = new Transaction(acNumber, acHolder, initialDeposit);
		} else {
			transaction = new Transaction(acNumber, acHolder);
		}

		System.out.println("Account data:");
		System.out.println(transaction);

		System.out.print("Enter a deposit value: ");
		double dep = sc.nextDouble();
		transaction.deposit(dep);
		System.out.println("Updated account data:");
		System.out.println(transaction);

		System.out.print("Enter a withdraw value: ");
		double wit = sc.nextDouble();
		transaction.withdraw(wit);
		System.out.println("Updated account data:");
		System.out.println(transaction);

		sc.close();
	}

}
