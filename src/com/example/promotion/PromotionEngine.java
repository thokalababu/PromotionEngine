package com.example.promotion;

public class PromotionEngine {
	
	public int executeCheckout() {
		try {
			int total = 0;
			return total;
		}
		catch(Exception e) {
			System.out.print("Something went wrong!!");
			return -1;
		}
	}
	public static void main(String[] args) {
		try {
			PromotionEngine pe = new PromotionEngine();
			int total = pe.executeCheckout();
			if(total > 0)
				System.out.print("Total cost of the cart after applying promo:: "+ total);
			else
				System.out.print("You have entered invalid input!!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
