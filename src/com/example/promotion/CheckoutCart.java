package com.example.promotion;

import java.util.ArrayList;
import java.util.List;

public class CheckoutCart {
	public int checkout(Item item, CartItems ci, Promotions promo) {
		int total = 0;
		try {
			ci.items.forEach((k,v) -> {
				String id = k;
				int value = v;
				int tempTotal = 0;
				for(int i=0;i<promo.promos.size();i++) {
					int present = i;
					if(promo.promos.get(present).size()>1) {

							
					}
					else {
						if(promo.promos.get(present).containsKey(k)) {
							int promoSelectedItems = promo.promos.get(present).get(k);
							int promoAppliedItem = value/promoSelectedItems;
							if(promoAppliedItem>0) {
								
							}
							else {
								tempTotal = item.getPrice(k)*value;
								System.out.println(tempTotal);
							}
						}
					}
				}
			});	
		}
		catch(Exception e) {
			System.out.print(e.toString());
		}
		return total;
	}

}
