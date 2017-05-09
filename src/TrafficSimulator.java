
public class TrafficSimulator {
	public static void main(String[] args) {
		
	}
	
	public TrafficSimulator(){
		
		Lane lane = new Lane();
		lane.start();
		lane.currentLight = TrafficLight.green;
	}
}
