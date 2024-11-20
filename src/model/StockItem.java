package model;

import java.util.HashMap;
import java.util.Map;

public class StockItem {
	static Map<String, Integer> stock = new HashMap<String, Integer>();
	
	static {
		stock.put("at", 20);
		stock.put("ff", 15);
		stock.put("msa", 30);
	}
}
