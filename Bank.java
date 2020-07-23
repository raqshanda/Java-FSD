
public interface Bank {
	void deposit(double amount);
	void withdraw(double amount,String type) throws Exception;
	double getBalance();
	void customerDetails(int num,String type);

}
