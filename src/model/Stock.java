	package model;
	
	public class Stock {
	    public static int getStock(String productCode) {
	        return StockItem.stock.getOrDefault(productCode, 0);
	    }
	    
	    public static boolean reduceStock(String productCode, int quantitySold) {
	        if (StockItem.stock.containsKey(productCode) && StockItem.stock.get(productCode) >= quantitySold) {
	            StockItem.stock.put(productCode, StockItem.stock.get(productCode) - quantitySold);
	            return true;
	        }
	        return false;
	    }
	    
	    public static void addStock(String productCode, int quantityToAdd) {
	        if (StockItem.stock.containsKey(productCode)) {
	            StockItem.stock.put(productCode, StockItem.stock.get(productCode) + quantityToAdd);
	        } else {
	            StockItem.stock.put(productCode, quantityToAdd);
	        }
	    }
	}
