
public class Taxi extends PublicTransportation {

	Taxi(){
		minimumfare = 3000;
	}

	int getfare(int distance) {
		if (time <=4){
		if (distance > 2000){
			additionalfare = (distance - 2000) / 142 * 100;
		}
	}
		else if (time <= 24)
			if (distance > 2000){
				additionalfare = (distance -2000) / 142 * 120;
			}
		return minimumfare + additionalfare;
}
}
//taxi has to different from bus and taxi.