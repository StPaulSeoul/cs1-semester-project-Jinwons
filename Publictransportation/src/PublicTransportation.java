import java.util.Scanner;

public abstract class PublicTransportation {
	Scanner input = new Scanner(System.in);
		
	int minimumfare;
	int additionalfare;
	int time;
	
	abstract int getfare (int distance);

	public void printCharge(int distance){
		System.out.println(distance + " km will cost " + getfare(distance) + " won");
	}
}

// scanner -> input time & distance, print which PublicTransportation is used distance unit is meter