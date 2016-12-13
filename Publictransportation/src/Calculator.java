
public class Calculator {
	public static void main	(String[]args){
		Bus b = new Bus();
		simulation (b);
		
		Taxi t = new Taxi ();
		simulation (t);
		
		Subway s = new Subway();
		simulation(s);
	}
	private static void simulation(PublicTransportation p){
		p.printCharge(15000); //change fixed value -> user input
	}
}