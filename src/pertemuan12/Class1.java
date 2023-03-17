package pertemuan12;

public class Class1 extends Thread {

	public Class1() {
		setDaemon(true); // bikin dari user thread jadi daemon thread
	}
	
	public void run() {
		System.out.println("Countdown from 10 to 5");
		
		int count = 10;
		
		while(count>5) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(count);
			count--;
		}
		
		boolean cek = isDaemon();
		System.out.println(cek);
	}

}
