package pertemuan12;

public class Main {

	public Main() {
		Class2 count = new Class2();
		Thread countdown2 = new Thread(count);  // bikin thread dari runnable
		countdown2.start();
		
		Class1 countdown1 = new Class1();
		countdown1.start();
		
		countdown2.setPriority(8);
		countdown1.setPriority(2);
		
		System.out.println("Priority of: " + countdown2.getName() + " " + countdown2.getPriority());
		System.out.println("Priority of: " + countdown1.getName() + " " + countdown1.getPriority());
		
		
		
	}

	public static void main(String[] args) {
		
		new Main();

	}

}
