
public class Bus extends PublicTransportation{

	Bus(){
		minimumfare = 720;
	}

	@Override
	int getfare(int distance) {
		if(distance > 10000){
			additionalfare = (distance - 10000)/5000 * 100;
		}
		else {
			additionalfare = 0;
		}
		
		return minimumfare + additionalfare;
	}

}
