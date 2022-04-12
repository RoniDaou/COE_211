import java.util.Scanner;
public class Grades{
	public static void main(String[] args){
		int grades[]=new int[6];
		int attended_labs;
		int midterm_grade;
		Scanner scan=new Scanner(System.in);

		for(int indx=0;indx<=grades.length-1;indx++){
		System.out.println("Enter your grade of assignment "+(indx+1));
		grades[indx]=scan.nextInt();
		}
		System.out.println("Input the number of attended labs: ");
		attended_labs=scan.nextInt();
		System.out.println("Input the midterm grade: ");
		midterm_grade=scan.nextInt();
		System.out.println("Assignments (30%): "+grade(grades));
		System.out.println("Attendance (5%): "+attendedlabs(attended_labs));
		System.out.println("Midterm (30%): "+midterm_grade*0.3);


	}
	private static double grade(int grades[]){
		int sumofgrades=0;
		double totalgrade;
		
		for(int indx=0;indx<=grades.length-1;indx++){
			sumofgrades+=grades[indx];
		}
		totalgrade=(sumofgrades/5.0)*0.3;
		return totalgrade;

		}

	private static double attendedlabs(int attended_labs){
		
		double totalgrade;
		totalgrade=((attended_labs*100)*0.05)/attended_labs;
		return totalgrade;
	}
	
}