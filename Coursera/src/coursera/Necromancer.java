package coursera;
import java.util.Scanner;
public class Necromancer {

	public static void main(String[] args) {
		//invoking the method 
		printStatement();
	}
	
	//	printStatement 
	public static void printStatement() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = input.nextLine();
		System.out.println("Enter Your Address: ");
		String address = input.nextLine();
		System.out.println("Enter Your PhoneNumber: ");
		int phone = input.nextInt();
		input.close();

		//printing out the details
		System.out.printf("%s\t %d\t %s\n", name, phone, address);		
	}

}
