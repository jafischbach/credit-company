import java.util.Scanner;

public class CreditCompanyInterface {

	private static Scanner input = new Scanner(System.in);
	private static CreditCompany company = new CreditCompany();
	
	public static void main(String[] args) {
		int choice;
		do {
			choice = getChoice();
			switch(choice) {
			case 1: // Charge
				// company.charge(getName(), getAmount());
				break;
			case 2: // Credit
				
			case 3: // Display Account
				
			case 4: // Display All Accounts
				
			case 5: // Increase Credit Limit
				
			case 6: // Display Debtors
				
			case 7: // Purge Accounts
				
			case 8: // Exit Program
				System.out.println("Yeah, I was bored with you too.");
				break;
			default:
				System.out.println("Invalid option, nimrod.");
			}
		} while(choice != 8);
	}

	private static String getName() {
		System.out.print("Enter customer name: ");
		return input.nextLine();
	}
	
	private static double getAmount() {
		System.out.print("Enter amount $");
		double amount = input.nextDouble();
		input.nextLine();
		return amount;
	}
	
	private static int getChoice() {
		System.out.println("1) Charge");
		System.out.println("2) Credit");
		System.out.println("3) Display Account");
		System.out.println("4) Display All Accounts");
		System.out.println("5) Increase Credit Limit");
		System.out.println("6) Display Debtors");
		System.out.println("7) Purge Accounts");
		System.out.println("8) Exit Program");
		System.out.print("Enter an option: ");
		int choice = input.nextInt();
		input.nextLine();
		return choice;
	}
	
}
