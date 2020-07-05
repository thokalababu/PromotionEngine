package com.example.promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Promotions {

	List<Map<String,Integer>> promos;
	List<Integer> cost;
	
	public Promotions(){
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		promos = new ArrayList<>();
		cost = new ArrayList<>();
		
		map.put("A", 3);
		promos.add(0, map);
		cost.add(0, 130);
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
				
		map1.put("B", 2);
		promos.add(1, map1);
		cost.add(1, 45);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		map2.put("C", 1);
		map2.put("D", 1);
		promos.add(2, map2);
		cost.add(2, 30);
		
	}
}
