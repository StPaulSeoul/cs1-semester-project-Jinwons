
public class Taxi {

	int minimumFare = 3000; 
	int finalFare = 0;
	int time = 0;
	int age;

	public int calculateMyfare(int distance) {
		if(distance > 2000) {
			finalFare = minimumFare + (distance - 2000) / 142 * 100;
		}
		return finalFare;
	}

}
