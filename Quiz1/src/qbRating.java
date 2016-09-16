import java.util.Scanner;

public class qbRating {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Total Passing attempts:"); // Quarterback's Passing Attempts
		double ATT = input.nextDouble();
		
		System.out.println("Total pass completions:"); // Quarterback's Total completions from his attempts
		double COMP = input.nextDouble();
		
		System.out.println("Total Yards:"); // Quarterback's Total yards thrown
		double YDS = input.nextDouble();
		
		System.out.println("Total Touchdowns:"); // Quarterback's Total Touchdowns
		double TDS = input.nextDouble();
		
		System.out.println("Total interceptions:"); // Quarterback's Total Interceptions thrown
		double INT = input.nextDouble();
		
		input.close();
		
		double a = (double) (COMP/ATT-0.3) * 5; // first formula labeled "a" 
		double b = (double) (YDS/ATT-3) * 0.25; // second formula labeled "b"
		double c = (double) (TDS/ATT) * 20; // third formula labeled "c"
		double d = (double) 2.375 - ((INT/ATT) * 25); // fourth formula labeled "d"
		
		double QBR = ((a + b + c + d)/6) * 100; // Final QBR formula. Range from 0 - 158.3
		
		System.out.println("The Quarterback's QuarterBack Rating is:" + QBR); 
	}

}       // GO BIRDS!!!!
