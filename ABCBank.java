import java.util.Scanner;

public class ABCBank implements Bank{
	
	double balance=10000;
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
		
	}

	@Override
	public void withdraw(double amount,String type) {
		// TODO Auto-generated method stub
		if(amount>balance) {
			System.out.println( "Insufficient Balance");
		}
		else {
		if(type.equalsIgnoreCase("s")&&amount>5000)
			System.out.println("Withdraw Attempt Failed");
		else if(type.equalsIgnoreCase("c"))
				balance -= amount;
		else 
			balance -= amount;
	}}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void customerDetails(int num,String type) {
		// TODO Auto-generated method stub
		System.out.println("Account Number:"+num+"\nAccount Type:"+type+"\nBalance:"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int num = scan.nextInt();
		System.out.println("Enter Account Type: ");
		String type = scan.next();
		ABCBank obj=new ABCBank();
		while(true) {
			
			System.out.println("********Menu*******");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Get Customer details");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Amount to deposit");
				double amount=scan.nextDouble();
				obj.deposit(amount);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw");
				double withdraw=scan.nextDouble();
				obj.withdraw(withdraw,type);
				break;
			case 3:
				System.out.println(obj.getBalance());
				break;
			case 4:
				obj.customerDetails(num, type);
				break;
			case 5:
				System.exit(0);
			}
		}
			
				

	}

}
