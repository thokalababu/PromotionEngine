package com.example.promotion;

import java.util.Scanner;

public class PromotionEngine {
	
	public int executeCheckout() {
		try {
			int total = 0;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter total number of unique items in cart:: ");
			int total_items = in.nextInt();	
			if(total_items <=0) {
				System.out.print("You have entered invalid input.");
				System.exit(0);
			}
			else {
				Item item = new Item();
				CartItems ci = new CartItems();
				ci.setCartItems(total_items);
				Promotions promo = new Promotions();
				CheckoutCart cart = new CheckoutCart();
				total = cart.checkout(item,ci,promo);	
			}
			in.close();
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
