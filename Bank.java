
public interface Bank {
	void deposit(double amount);
	void withdraw(double amount,String type);
	double getBalance();
	void customerDetails(int num,String type);

}
