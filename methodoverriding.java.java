import java.util.Scanner;
abstract class Shape {
abstract void numberOfSides();
}

class Rectangle extends Shape {
void numberOfSides() {
System.out.println("A Rectangle has 4 sides.");
}
}

class Triangle extends Shape {
void numberOfSides() {
System.out.println("A Triangle has 3 sides.");
}
}

class Hexagon extends Shape {
void numberOfSides() {
System.out.println("A Hexagon has 6 sides.");
}
}

public class shapes {
public static void main(String[] args) {      
Shape rectangle = new Rectangle();
Shape triangle = new Triangle();
Shape hexagon = new Hexagon();

       
rectangle.numberOfSides();
triangle.numberOfSides();
hexagon.numberOfSides();
}
}
