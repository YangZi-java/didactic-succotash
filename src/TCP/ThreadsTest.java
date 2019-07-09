package TCP;

public class ThreadsTest {
	public static void main(String[] args) {
		
		ThreadsSend ts1 = new ThreadsSend();
		ThreadsSend ts2 = new ThreadsSend();
		ThreadsSend ts3 = new ThreadsSend();
		
		Thread t1 = new Thread(ts1);
		Thread t2 = new Thread(ts2);
		Thread t3 = new Thread(ts3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
