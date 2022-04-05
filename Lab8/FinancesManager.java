import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
	public class FinancesManager{

		public static void main(String[] args){
		try {
		 Scanner scan=new Scanner(System.in);
		 FileWriter FW = new FileWriter("expenses.txt", true);
		 String name,purchase,operation,summary;
		 double amount;
		do{
		 System.out.println("Input your name: ");
		 name=scan.nextLine();
		
		 System.out.println("What did you purchase?");
		 purchase=scan.nextLine();

		 System.out.println("How much did you pay? (in USD)");
		  amount=scan.nextDouble();
		scan.nextLine();
		 
		 

		FW.write(name + " purchased " + purchase + " for " + amount + " US Dollars" + "\n");
		
		
		System.out.println("Would you like to log another purchase? (y/n)");
		operation=scan.nextLine();
		if (operation.equals("n")) {
		System.out.println("Get off of ZoodMall!");
			break;
		}
		}
		while(operation.equals("y"));

		FW.close();
		
		
		Scanner exp = new Scanner(new File("expenses.txt"));
		System.out.println("Would you like to read a summary of your purchases?(y/n)");
			summary=scan.nextLine();
		
		if(summary.equals("y")) {
		 while(exp.hasNext()) {
                 System.out.println(exp.nextLine());
		}
		}
		
		exp.close();
		} catch (IOException e) {
                  System.out.println("An error occurred.");
                  e.printStackTrace();
        }

		}
}