import java.util.concurrent.ConcurrentLinkedQueue;

public class Lane extends Thread{
	private ConcurrentLinkedQueue<Car> cars;
	private int direction;
	
	public Lane(){
		cars = new ConcurrentLinkedQueue<>();	
	}
	
	//Update car queue
	public void run(){
		while (true){
			try {
		
				Thread.sleep(1);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}

