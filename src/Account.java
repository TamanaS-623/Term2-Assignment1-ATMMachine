import java.util.*; // this is the general import package used here to import the date package from java library

public class Account {

	//the field datas are declared privately
	private String _customerName; //name of customer
	private int _id;              //id of customer
	private double _balance;      //current balance in the customer's account
	private double _annualInterestRate;
	private Date dateCreated; // to get the current date

	public Account(int id, String customerName){
		_customerName = customerName;
		_id = id;
	}

	public void setCustomerName(String customerName){
		_customerName = customerName;
	}

	public String getCustomerName(){
		return _customerName;
	}

	public void setId(int id){
		_id = id;
	}

	public int getId(){
		return _id;
	}

	public void setBalance(double balance){
		_balance = balance;
	}

	public double getBalance(){
		return _balance;
	}

	public void setAnnualInterestRate(double annualInterstRate){
		_annualInterestRate = annualInterstRate;
	}

	public double getAnnualInterstRate(){
		return _annualInterestRate;
	}

	//if-else statement in withdraw() is to check whether the withdrawal money is (equal/less than) the current balance of the account
	public double withdraw(double reducedMoney){
		if(_balance >= reducedMoney )
			_balance = _balance - reducedMoney;
		else
			System.out.print("Transaction failed due to Insuffecient Amount \nP"
					+ "lease try again!");
		return _balance;
	}

	public double deposits(double additionalMoney){
		_balance = _balance + additionalMoney;
		return _balance;
	}

	public double monthlyInterest(){
		return _balance * (_annualInterestRate / 12 / 100);
	}

	//this method creates an object of Date class and returns the date
	public Date getdate(){
		dateCreated  = new Date();
		return dateCreated ;
	}

}
