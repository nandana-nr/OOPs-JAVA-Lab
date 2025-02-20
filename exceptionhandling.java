import java.util.Scanner;
public class exceptionhandling{  

public static int divide(int a, int b) {
if (b == 0) {       
throw new ArithmeticException("Division by zero is not allowed");
}
return a / b;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {                   
System.out.print("Enter numerator: ");
int numerator = scanner.nextInt();            
System.out.print("Enter denominator: ");
int denominator = scanner.nextInt();      
int result = divide(numerator, denominator);  
System.out.println("Result: " + result);
} 
catch (ArithmeticException e) {
System.out.println("Caught an exception:" +  e.getMessage());
} 
finally {
System.out.println("Execution completed.");
scanner.close();
}
}
}
