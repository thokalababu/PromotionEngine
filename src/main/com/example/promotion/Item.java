package main.com.example.promotion;

/*
 * New item's and prices can be added in this class
 * If a new item is added, the corresponding set and get methods need to be added.
 * And getPrice method is to be updated.
 */

public class Item {

int priceOfA, priceOfB, priceOfC, priceOfD;
	
	public Item() {
		this.setPriceOfA();
		this.setPriceOfB();
		this.setPriceOfC();
		this.setPriceOfD();
	}

	public int getPriceOfA() {
		return priceOfA;
	}

	public void setPriceOfA() {
		this.priceOfA = 50;
	}

	public int getPriceOfB() {
		return priceOfB;
	}

	public void setPriceOfB() {
		this.priceOfB = 30;
	}

	public int getPriceOfC() {
		return priceOfC;
	}

	public void setPriceOfC() {
		this.priceOfC = 20;
	}

	public int getPriceOfD() {
		return priceOfD;
	}

	public void setPriceOfD() {
		this.priceOfD = 15;
	}
	
	public int getPrice(String s) {
		
		if(s.equals("A"))
			return getPriceOfA();
		
		else if(s.equals("B"))
			return getPriceOfB();
		
		else if(s.equals("C"))
			return getPriceOfC();
		
		else if(s.equals("D"))
			return getPriceOfD();
		
		return -1;
	}
}
