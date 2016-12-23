import java.util.Scanner;

public class Calculator {
	public static void main	(String[]args){
		String tport;
		int distance;
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which transportation are you going to take?(Bus / Subway / Taxi)");
		tport = input.next();
	
		
		if (tport.equals("Bus")) {
			System.out.println("How old are you?");
			age = input.nextInt();
			System.out.println("How many meters?");
			distance = input.nextInt();
			
			Bus b = new Bus();
			System.out.println(b.calculateMyfare(distance , age));
			}
	
		if (tport.equals("Subway")) {
			System.out.println("How old are you?");
			age = input.nextInt();
			System.out.println("How many meters?");
			distance = input.nextInt();
			
			Subway s = new Subway();
			System.out.println(s.calculateMyfare(distance , age));
		}
		
		if (tport.equals("Taxi")) {
			System.out.println("How many meters?");
			distance = input.nextInt();
			
			Taxi t = new Taxi();
			System.out.println(t.calculateMyfare(distance));
		}
	}
}