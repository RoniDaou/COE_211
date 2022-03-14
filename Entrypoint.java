import java.util.Scanner;
public class Entrypoint{
	public static void main(String[] args){
		String Basic_Week_Visualizer;
		String Advanced_Week_Visualizer ;	
		String Basic_Calculator;	
		String Employee_repertoire;
		int number;
		String operation="";

		Scanner scan=new Scanner(System.in);
		do{
		System.out.println("Which service would you like to use: \n"+"[1]: Basic week visualizer\n"+"[2]: Advanced week visualizer\n"+"[3]: Basic calculator\n"+"[4]: Employee repertoire");
		number=scan.nextInt();
		
		switch(number){
		
			case 1: Basic_Week days=new Basic_Week();
				days.daysprinted();
					break;
			case 2: Advanced_Week weekdays=new Advanced_Week();
				weekdays.printDays();
					break;
			case 3: Calculator compute=new Calculator();
					break;
			case 4: Employee employee=new Employee();
				employee.toString();
					break;
			default: System.out.println("Please make sure you pick a number between 1 and 4");
						continue;
				
				
				
				
						
		}
		
		System.out.println("Would you like to perform another operation (y/n):");
		operation=scan.next();
		if(operation.equals("n")){
			break;
		}
		}//do
		while(operation.equals("y")|| number!=1|| number!=2|| number!=3||number!=4);
		
		





	


	














}
}