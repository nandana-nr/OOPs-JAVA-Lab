import java.util.Scanner;
public class AreaCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
AreaCalculator calculator = new AreaCalculator();


System.out.println("Enter base of triangle:");
float base = sc.nextFloat();
System.out.println("Enter height of triangle:");
float height = sc.nextFloat();
calculator.calculateArea(base, height);

System.out.println("Enter width of rectangle:");
int width = sc.nextInt();
System.out.println("Enter height of rectangle:");
int length = sc.nextInt();
calculator.calculateArea(width, length);
      
System.out.println("Enter radius of circle:");
float radius = sc.nextFloat();
calculator.calculateArea(radius);
}

   
void calculateArea(float radius) {
float area = 3.14f * radius * radius;
System.out.println("Area of circle is: " + area);
}

   
void calculateArea(float base, float height) {
float area = 0.5f * base * height;
System.out.println("Area of triangle is: " + area);
}

    
void calculateArea(int width, int length) {
int area = width * length;
System.out.println("Area of rectangle is: " + area);
}
}

