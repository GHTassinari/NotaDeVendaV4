package model;

import java.util.Map;
import java.util.HashMap;

public class Database {
	private static Map<String, String[]> products = new HashMap<String, String[]>();
	
	private static Map<String, PaymentMethod> payments = new HashMap<String, PaymentMethod>();
	
	static {
		products.put("at", new String[] {
			"Arroz Tatiana", "30"
		});
		
		products.put("ff", new String[] {
				"Feijão Feijó", "20"
			});
		
		products.put("msa", new String[] {
				"Macarrão Santa Amália", "15"
			});
		
		CreditCard creditCard = new CreditCard(5.0);
		DebitCard debitCard = new DebitCard(0.0);
		Cash cash = new Cash(5);
		
		payments.put("cc", creditCard);
		payments.put("dc", debitCard);
		payments.put("c", cash);
	}
	
	public static String [] selectProduct(String code) {
		return products.get(code);
		
	}
	
	public static PaymentMethod selectPayment(String payment) {
		return payments.get(payment);
	}
}
