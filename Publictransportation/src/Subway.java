
public class Subway   {
	
	int minimumFare = 720; 
	int finalFare = 0;
	int time = 0;
	int age;

	public int calculateMyfare(int distance , int age) {
		if (age > 20){
			minimumFare = 1000;
		}
		else if (age > 14){
			minimumFare = 720;
		}
		else {
			minimumFare = 450;
		}
		
		finalFare = minimumFare + (distance - 10000) / 5000 * 100;
	
		return finalFare;
}
}
