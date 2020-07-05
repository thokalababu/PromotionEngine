package main.com.example.promotion;

import java.util.Hashtable;
import java.util.Scanner;

public class CartItems {

	Hashtable<String, Integer> items;

	public void setCartItems(int total_items) {
		items = new Hashtable<String, Integer>();
		try {
			Scanner in = new Scanner(System.in);
			while(total_items > 0) {
				System.out.print("Enter item id:: ");
				String item = in.next();
				System.out.print("Enter total number of "+item+"'s:: ");
				int count = Integer.parseInt(in.next());
				if(count <=0 ) {
					in.close();
					System.out.print("You have entered invalid count for item "+item);
					System.exit(0);
				}
				else {
					items.put(item, count);
					total_items--;
				}
			}
			in.close();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
}
