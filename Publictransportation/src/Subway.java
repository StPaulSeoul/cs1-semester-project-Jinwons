
public class Subway extends PublicTransportation {
	
	Subway(){
		minimumfare = 720;
	}

	@Override
	int getfare(int distance) {
		if (distance > 10000){
			additionalfare = (distance - 10000) / 5000 * 100;
		}
		return distance;
	}
	
	}