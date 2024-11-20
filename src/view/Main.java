package view;

import model.SaleManager;

public class Main {
    public static void main(String[] args) {
        SaleManager saleManager = new SaleManager();

        if (saleManager.addSaleItem("at", 2)) {
            System.out.println("Item 'at' adicionado com sucesso!");
        }
        if (saleManager.addSaleItem("ff", 1)) {
            System.out.println("Item 'ff' adicionado com sucesso!");
        }
        if (saleManager.addSaleItem("msa", 2)) {
            System.out.println("Item 'msa' adicionado com sucesso!");
        }

        saleManager.setPaymentMethod("c");

        System.out.println("\nItens da Venda:");
        for (String item : saleManager.getItems()) {
            System.out.println(item);
        }

        System.out.println(String.format("\nTotal: R$ %.2f", saleManager.getTotal()));
        System.out.println(String.format("Forma de pagamento: %s", saleManager.getPaymentMethod()));
        System.out.println(String.format("Valor a ser pago: R$ %.2f", saleManager.getFinalPrice()));

        System.out.println("\nEstoque Atualizado:");
        System.out.println("Arroz Tatiana: " + saleManager.getStock("at"));
        System.out.println("Feijão Feijó: " + saleManager.getStock("ff"));
        System.out.println("Macarrão Santa Amália: " + saleManager.getStock("msa"));
    }
}
