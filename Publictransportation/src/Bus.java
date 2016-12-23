
public class Bus {

	int minimumFare = 0; 
	int finalFare = 0;
	int time = 0;
	int age;
	
	public int calculateMyfare(int distance, int age) {
		if (age > 20){
			minimumFare = 1000;
		}
		else if (age > 14){
			minimumFare = 720;
		}
		else {
			minimumFare = 450;
		}
		if (distance > 50000){
			finalFare = minimumFare + (distance - 10000) / 8000 * 100;
		}
		else if(distance > 10000){
			finalFare = minimumFare + (distance - 10000) / 5000	* 100;
		}
		
		else {
			finalFare = minimumFare;
		}
		return finalFare;
	}

}
	