import java.text.DecimalFormat;
import java.util.*;
public class Mortgage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("Principal:");
		int principal=sc.nextInt();
		
		while(true)
			{
			
				if((principal)<1000||(principal>1000000))
			{
				System.out.println("Enter a value between 1000 and 1000000");
				System.out.print("Principal:");
				principal=sc.nextInt();
				
				
			}
				else 
				break;
			}
		
		System.out.print("Annual Interest Rate:");
		double r=sc.nextDouble();
		
		
		while(true)
		{
			if((r<1)||r>30) {
			System.out.println("Enter a value between 1 and 30");
			System.out.print("Annual Interest Rate:");
			r=sc.nextDouble();
			}
			else
				break;
		}
		r=(r)/100;
		double month=r/12.0;
		
		System.out.print("Period (Years):");
		int n=sc.nextInt();
		while(true)
		{
			if((n<1)||n>30) {
			System.out.println("Enter a value between 1 and 30");
			System.out.println("Period (Years):");
			n=sc.nextInt();
			}
			else
				break;
		}
		int termM=n*12;
		DecimalFormat f=new DecimalFormat("##.00");
		
		double mortgage=(principal*month)/(1-Math.pow(1+month,-termM));
		System.out.println("Mortgage:$"+f.format(mortgage));
		
}
}