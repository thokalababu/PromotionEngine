package com.example.promotion;

import java.util.ArrayList;
import java.util.List;

public class CheckoutCart {
	public int checkout(Item item, CartItems ci, Promotions promo) {
		
		var wrapper = new Object(){ int total = 0; };
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
								tempTotal = (promoAppliedItem*promo.cost.get(present))+((value-(promoAppliedItem*promoSelectedItems))*item.getPrice(k));
							}
							else {
								tempTotal = item.getPrice(k)*value;
							}
							wrapper.total += tempTotal;
						}
					}
				}
			});	
		}
		catch(Exception e) {
			System.out.print(e.toString());
			System.exit(0);
		}
		return wrapper.total;
	}

}
