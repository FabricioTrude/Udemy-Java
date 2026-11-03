package aulas._12_enum.a_134_order;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Order {
    private Date moment = new Date();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    void addItem(OrderItem item){
        items.add(item);
    }

    void removeItem(OrderItem item){
        items.remove(item);
    }

    Client getClient() {
        return client;
    }

    void setClient(Client client) {
        this.client = client;
    }

    OrderStatus getStatus() {
        return status;
    }

    void setStatus(OrderStatus status) {
        this.status = status;
    }

    String getMoment() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        return sdf.format(moment);
    }

    void showItems(){
        for(OrderItem item:items){
            System.out.println(item.getName() + ", $" + item.getPrice() + ", Quantity: " + item.getQuantity() + ", Subtotal: $" + item.subTotal());
        }
    }
}