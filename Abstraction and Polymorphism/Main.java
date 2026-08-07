
abstract class Shapes {
    abstract void find_area();
    abstract void find_perimeter();
}
class Rectangle extends Shapes {
    int length, width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void find_area() {
        System.out.println("Area of rectangle: " + (length * width));
    }
    void find_perimeter() {
        System.out.println("Perimeter of rectangle: " + (2 * (length + width)));
    }
}
class Circle extends Shapes {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    void find_area() {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
    void find_perimeter() {
        System.out.println("Perimeter of circle: " + (2 * 3.14 * radius));
    }
}
class Parallelogram extends Shapes {
    int base, height;
    Parallelogram(int base, int height) {
        this.base = base;
        this.height = height;
    }
    void find_area() {
        System.out.println("Area of parallelogram: " + (base * height));
    }
    void find_perimeter() {
        System.out.println("Perimeter of parallelogram: " + (2 * (base + height)));
    }
}
class square extends Shapes {
    int side;
    square(int side) {
        this.side = side;
    }
    void find_area() {
        System.out.println("Area of square: " + (side * side));
    }
    void find_perimeter() {
        System.out.println("Perimeter of square: " + (4 * side));
    }
}

public class Main {
    public static void main(String[] args) {

        // rectangle
        Shapes rectangle = new Rectangle(5, 3);
        rectangle.find_area();

        // perimeter
        rectangle.find_perimeter();
        
        // circle
        Shapes circle = new Circle(2);
        circle.find_area();
        circle.find_perimeter();

        // parallelogram
        Shapes parallelogram = new Parallelogram(4, 6);
        parallelogram.find_area();
        parallelogram.find_perimeter();

        // square
        Shapes square = new square(4);
        square.find_area();
        square.find_perimeter();

        
    }
}


