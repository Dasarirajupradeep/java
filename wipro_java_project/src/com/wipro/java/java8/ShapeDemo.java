package com.wipro.java.java8;

@FunctionalInterface
interface Shape {
    void calculateArea(int dimension); // Abstract method

    default String getShapeName(String shape) {
        return "Shape Type: " + shape;
    }

    static String generalInfo() {
        return "Shapes have different properties such as area and perimeter.";
    }
}

class Square implements Shape {
    public void calculateArea(int side) {
        System.out.println("Square Area: " + (side * side));
    }
}

class Circle implements Shape {
    public void calculateArea(int radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape circle = new Circle();

        square.calculateArea(7);
        circle.calculateArea(10);

        System.out.println(circle.getShapeName("Circle"));
        System.out.println(Shape.generalInfo());
    }
}