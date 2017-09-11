package Week6;

public class StringBufferExample {
	
	public static void main (String[] args) throws Exception {
		StringBuffer sb = new StringBuffer("A");
		MyThread thread1 = new MyThread(sb);
		thread1.start();
		MyThread thread2 = new MyThread(sb);
		thread2.start();
		MyThread thread3 = new MyThread(sb);
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
	}
	
}

class MyThread extends Thread {
	private StringBuffer stringbuffer;
	
	public MyThread (StringBuffer input) {
		this.stringbuffer = input;
	}
	
	public void run () {
		synchronized (stringbuffer) {
			for (int i = 0; i < 5; i++) {
				System.out.print (stringbuffer.toString());				
			}
			System.out.println ();				
			
			stringbuffer.setCharAt(0, (char)(stringbuffer.charAt(0)+1));
		}
	}
}