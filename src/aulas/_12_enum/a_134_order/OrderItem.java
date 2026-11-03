package aulas._12_enum.a_134_order;

class OrderItem {
    private int quantity;
    private double price;

    private Product product;

    OrderItem(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
        price = product.getPrice();
    }

    double subTotal(){
        return quantity * price;
    }

    int getQuantity() {
        return quantity;
    }

    double getPrice() {
        return price;
    }

    String getName(){
        return product.getName();
    }
}
