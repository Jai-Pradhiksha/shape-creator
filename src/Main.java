public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(5,10);
        Circle circle = new Circle(4);

        System.out.println("Area of Triangle = " + triangle.calculateArea());
        System.out.println("Perimeter of Triangle = " + triangle.calculatePerimeter());

        System.out.println("\nArea of Rectangle = " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle = " + rectangle.calculatePerimeter());

        System.out.println("\nArea of Circle = " + circle.calculateArea());
        System.out.println("Perimeter of Circle = " + circle.calculatePerimeter());
    }
}

abstract class Shape{
    abstract public float calculateArea();
    abstract public float calculatePerimeter();
}

class Triangle extends Shape{
    int base,height;
    public Triangle(int height, int base) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateArea() {
        return (float) (0.5 * base * height);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (base + height);
    }
}

class Rectangle extends Shape{
    int length,breadth;
    public Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public float calculateArea() {
        return (float) (length * breadth);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * (length + breadth));

    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (3.14 * radius * radius);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * 3.14 * radius);
    }
}
