package aulas._13_polimorfismo.a_146_abstract;

class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }
}
