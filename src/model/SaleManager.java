package model;

import java.util.List;

public class SaleManager {
    private Sale sale;

    public SaleManager() {
        this.sale = new Sale();
    }

    public boolean addSaleItem(String productCode, int quantity) {
        int stockAvailable = Stock.getStock(productCode);

        if (stockAvailable >= quantity) {
            Stock.reduceStock(productCode, quantity);
            sale.createSaleItem(productCode, quantity);
            return true;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + productCode);
            return false;
        }
    }

    public void setPaymentMethod(String paymentMethodCode) {
        sale.setPaymentMethod(paymentMethodCode);
    }

    public String getPaymentMethod() {
        return sale.getPaymentMethod();
    }

    public List<String> getItems() {
        return sale.getItems();
    }

    public double getTotal() {
        return sale.getTotal();
    }

    public double getFinalPrice() {
        return sale.getFinalPrice();
    }

    public void addStock(String productCode, int quantity) {
        Stock.addStock(productCode, quantity);
    }

    public int getStock(String productCode) {
        return Stock.getStock(productCode);
    }
}
