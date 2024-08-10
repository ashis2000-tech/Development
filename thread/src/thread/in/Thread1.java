package thread.in;

public class Thread1 extends Thread {
	public void run() {
		System.out.println("run from MyThread");
	}	
}

 class Test03_MyThread {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Thread1 mt = new Thread1();
		mt.start();
		
		System.out.println("main end");
	}

}
	


