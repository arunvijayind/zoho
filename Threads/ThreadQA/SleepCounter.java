package Week6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SleepCounter {
	public static void main(String args[]) throws Exception {   	
		Counter counter = new Counter ();
		counter.start();

        BufferedReader stdIn =
                new BufferedReader(
                    new InputStreamReader(System.in)); 
        
        while (!stdIn.readLine().equals("0")) {
        	continue;
        }
        
        counter.interrupt();
	}
}

class Counter extends Thread {		
	private int counter = 0;
		
	public void run () {
		try {
			while (!this.isInterrupted()) {
				Thread.sleep(1000);
				System.out.println(counter++);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}