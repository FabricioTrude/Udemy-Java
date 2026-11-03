package aulas._8_poo;

public class a_75_object {
    public static void main(String[] args) {
        Product p = new Product();

        p.name = "Tv";
        p.price = 320.99;
        p.quantity = 12;

        p.data();
    }

    private static class Product{
        public String name;
        public int quantity;
        public double price;
        public void data(){
            System.out.println(this.toString());
            System.out.println(this);
            System.out.println(quantity);
            System.out.println(price);
        }
        public String toString(){
            return name;
        }
    }
}
