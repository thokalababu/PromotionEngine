package com.example.promotion;

import java.util.ArrayList;
import java.util.List;

public class CheckoutCart {
	public int checkout(Item item, CartItems ci, Promotions promo) {
		
		var wrapper = new Object(){ int total = 0; };
		try {
			List<String> checkedout = new ArrayList<String>();
			List<Boolean> checked = new ArrayList<Boolean>();
			ci.items.forEach((k,v) -> {
				String id = k;
				int value = v;
				int tempTotal = 0;
				for(int i=0;i<promo.promos.size();i++) {
					int present = i;
					if(promo.promos.get(present).size()>1) {
						var wrapper1 = new Object(){ boolean contain = false; };
						promo.promos.get(present).forEach((k1, v1) ->{
							try {
								if(ci.items.containsKey(k1)) {
									if(ci.items.get(k1) >= v1) {
										wrapper1.contain = true;
									}
									else {
										throw new Exception();
									}
								}	
								else {
									throw new Exception();
								}
							}
							catch(Exception e) {
								wrapper1.contain = false;								
							}							
						});
						if(wrapper1.contain) {
							promo.promos.get(present).forEach((k1, v1) ->{
								if(!checkedout.contains(k1)) {
									checkedout.add(k1);
									checked.add(false);
								}
							});
						}
						else {
							promo.promos.get(present).forEach((k1, v1) ->{
								if(ci.items.containsKey(k1) && promo.promos.get(present).containsKey(k)){
									int cost = v*item.getPrice(k1);
									wrapper.total += cost;
								}
							});
						}	
							
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
