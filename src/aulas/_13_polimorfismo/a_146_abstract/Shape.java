package aulas._13_polimorfismo.a_146_abstract;

abstract class Shape {
    private Color color;

    Shape(){

    }

    Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
