/*
 * Author : Tamana Seddiqi
 * Student ID : 991528861
 * Description : This is a  java code works same as a teller ATM machine and performs the required Tasks
 */
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		//Creating and initializing object of Account class
		Account acc1 = new Account(101, "Tamana Seddiqi");
		acc1.setBalance(50);
		acc1.setAnnualInterestRate(5);

		//Creating and initializing another object of Account class
		Account acc2 = new Account(102, "Meryam Uzerli");
		acc2.setBalance(1000);
		acc2.setAnnualInterestRate(5);

		Scanner input = new Scanner(System.in);

		//creating an object of ATM class to call a non-static method (menu())
		ATM acct = new ATM();


		//do-while loop to check whether the customer inputed ID is same as the IDs we already have and if yes, then passing the object of Account class to menu()
		int id;
		restart:do{
			System.out.print("Enter an account ID: ");
			id = input.nextInt();
			if(id == acc1.getId())
				acct.menu(acc1);
			else if(id == acc2.getId())
				acct.menu(acc2);
			else
				System.out.println("Invalid choice! please enter again...");
		}while((id != acc1.getId()) && (id != acc2.getId()));
	}

	//menu() method to help customers with the required tasks
	public void menu(Account acct){

		while(true){
			System.out.println("\n\t\t\t********** Main Menu **********");
			System.out.println("1: Account Info ");
			System.out.println("2: Withdraw ");
			System.out.println("3: Deposit ");
			System.out.println("4: Exit ");
			System.out.print("Please choose what you'd like to do: ");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();

			//switch case to perform the specific task based on customer input
			switch (x) {

					//case 1: to give the details of the account
				case 1: System.out.print("\nCustomer: ");
						System.out.println(acct.getCustomerName());
						System.out.print("Account Balance: $");
						System.out.println(acct.getBalance());
						System.out.print("Monthly Interet earned: $");
						System.out.print(acct.monthlyInterest());
						System.out.println("\n\t--------------- "+acct.getdate()+" ---------------\n");//it calls and prints the getdate() from Account class  for current date of transaction
						break;

						//case 2: to help the customers withdrawal of money
				case 2: System.out.print("Enter the amount to withdraw: ");
						double withdraw = input.nextDouble();
						acct.withdraw(withdraw);
						break;

						//case 3: to help the customers with deposit of money
				case 3: System.out.print("Enter the amount to deposit: ");
						double deposit = input.nextDouble();
						acct.deposits(deposit);
						break;

						//case 4: to logout the customer's account in the system
				case 4: System.exit(0);

						//when none of the customer's input matches the the cases
				default : System.out.print("Invalid choice! please try again...");
			}
		}
	}
}

