package Week6;

import java.util.Random;

public class FruitMarket {
	public static void main(String args[]){   	
		int noFarmers = 1;
		int noConsumers = 1;
		
		Market market = new Market();
		
		for (int i = 0; i < noFarmers; i++) {
			new Farmer (market).start();
		}

		for (int i = 0; i < noConsumers; i++) {
			new Consumer (market).start();
		}
	}
}

class Market {
	private BufferFixed appleQ = new BufferFixed (5);
	private BufferFixed orangeQ = new BufferFixed (5);
	private BufferFixed grapeQ = new BufferFixed (6);
	private BufferFixed watermelonQ = new BufferFixed (6);
		
	public void produceApple(Apple apple) throws Exception {
		appleQ.addItem(apple);
	}

	public void produceOrange(Orange orange) throws Exception {
		orangeQ.addItem(orange);
	}
	
	public void produceGrape(Grape grape) throws Exception {
		grapeQ.addItem(grape);
	}
	
	public void produceWatermelon(Watermelon watermelon) throws Exception {
		watermelonQ.addItem(watermelon);
	}
	
	public void consumeApple() throws Exception {
		appleQ.removeItem();
	}

	public void consumeOrange() throws Exception {
		orangeQ.removeItem();
	}
	
	public void consumeGrape() throws Exception {
		grapeQ.removeItem();
	}
	
	public void consumeWatermelon() throws Exception {
		watermelonQ.removeItem();
	}
}

class Apple {
	
}

class Orange {
	
}

class Grape {
	
}

class Watermelon {
	
}


class Farmer extends Thread {		
	private Market market;
	
	public Farmer (Market market) {
		this.market = market;
	}
	
	public void run () {
		while (true) {
		System.out.println ("Growing...");
		Random random = new Random();
		try {
			Thread.sleep(random.nextInt(1000));		
			int fruittype = random.nextInt(4);			
			switch (fruittype) {
			case 0: 
				market.produceApple(new Apple());
				System.out.println ("One apple on the market ...");
				break;
			case 1: 
				market.produceOrange(new Orange());
				System.out.println ("One orange on the market ...");
				break;
			case 2: 
				market.produceGrape(new Grape());
				System.out.println ("One grape on the market ...");
				break;
			default: 
				market.produceWatermelon(new Watermelon());			
				System.out.println ("One watermelon on the market ...");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class Consumer extends Thread {	
	private Market market;
	
	public Consumer (Market market) {
		this.market = market;
	}
	
	public void run () {
		while (true) {
		System.out.println ("Hungry~~~Must eat~~~");
		Random random = new Random();
		try {
			Thread.sleep(random.nextInt(1000));		
			int fruittype = random.nextInt(4);			
			switch (fruittype) {
			case 0: 
				market.consumeApple();
				System.out.println ("One apple in the tummy ...");
				break;
			case 1: 
				market.consumeOrange();
				System.out.println ("One orange in the tummy ...");
				break;
			case 2: 
				market.consumeGrape();;
				System.out.println ("One grape in the tummy ...");
				break;
			default: 
				market.consumeWatermelon();			
				System.out.println ("One watermelon in the tummy ...");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Why~~~CAN'T~~~EAT~~~");
		}
	}
		}
}
