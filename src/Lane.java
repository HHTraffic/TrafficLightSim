import java.util.concurrent.ConcurrentLinkedQueue;

public class Lane extends Thread{
	public ConcurrentLinkedQueue<Car> cars;
	public int direction;
	
	public TrafficLight currentLight;
	
	public Lane(){
		cars = new ConcurrentLinkedQueue<>();
		currentLight = TrafficLight.red;
	}
	
	//Update car queue
	public void run(){
		
		while (currentLight.equals(TrafficLight.green)){
			
			//let cars drive.
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

