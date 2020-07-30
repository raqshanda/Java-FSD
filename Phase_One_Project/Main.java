import java.util.Arrays;
import java.util.Scanner;

public class Main extends MethodsClass{
	public static void main(String[] args) throws Exception {
		
			System.out.println("**************************Welcome to LockedMe.com***********************");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Raqshanda Siddiqua welcomes you on behalf of LockedMe.com");
		System.out.println("-----------------------------------------------------------------------");
		Scanner scan=new Scanner(System.in);
		String[] list=new String[5];
		list[0]="Zaid";
		list[1]="Godawari";
		list[2]="Arun";
		list[3]="Mounika";
		
		System.out.println("Please enter your name:");
		String name=scan.next();
		System.out.println("Hello "+name+" !");
		System.out.println("Please enter your email ID:");
		String email=scan.next();
		Main obj=new Main();
		
		while(true) {
			System.out.println("*****************************************************************");
			System.out.println("------------------------------Menu------------------------------");
			
			System.out.println("1.Get the list of files");
			System.out.println("2.Add a file to the application directory");
			System.out.println("3.Delete a file from application directory");
			System.out.println("4.To see if specified file is present in application directory");
			System.out.println("5.Display contents of specified file");
			System.out.println("6.To see your account details");
			System.out.println("7. Get list of users ");
			System.out.println("8.Log out from your account");
			System.out.println("0.Exit from LockedMe.com");
			System.out.println();
			System.out.println("Enter your choice:");
			int choice = scan.nextInt();

			switch(choice){
			case 1:
				System.out.println("*******************List of files available****************");
				obj.listOfFiles();
				break;
			case 2:
				System.out.println("*********Welcome to adding a file page!****************");
				obj.addFiles();
				break;
			case 3:
				System.out.println("***********Deleting a file page********************** ");
				obj.deleteFiles();
				break;
			case 4:
				System.out.println("***************Checking the location of file************");
				obj.available();
				break;
			case 5:
				System.out.println("*********************Details page*************************");
				obj.getDetails();
				break;
			case 6:
				System.out.println("Your details are...");
				System.out.println("Name:"+name);
				System.out.println("Email:"+email);
				break;
			case 7:
				list[4]=name;
				System.out.println("**********************The registered users are******************");
				obj.mergeSort(list);
				System.out.println(Arrays.toString(list));
				break;
			case 8:
				System.out.println("Logging out");
				main(args);
				break;
			case 0:
				System.out.println("Closing LokedMe.com");
				System.exit(0);
				break;
			default:
				System.out.println("You have given wrong input! \n\nPlease re-enter your choice\n\n");
				
				
			}
		}
	}
}