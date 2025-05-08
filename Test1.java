abstract class Shape {
    abstract double area();
}


interface Printable {
    void print();
}


class Rectangle extends Shape implements Printable {
    private double width;
    private double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    @Override
    double area() {
        return width * height;
    }

    
    @Override
    public void print() {
        System.out.println("This is a rectangle with width " + width + " and height " + height + ".");
    }
}


public class Test1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);

        rect.print(); 
        System.out.println("Area of rectangle: " + rect.area()); 
    }
}