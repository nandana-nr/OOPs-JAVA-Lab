import java.util.Scanner;
public class matrixmultiplication{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
     
System.out.print("Enter the number of rows for the first matrix: ");
int r1 = sc.nextInt();
System.out.print("Enter the number of columns for the first matrix: ");
int c1 = sc.nextInt();

System.out.print("Enter the number of rows for the second matrix: ");
int r2 = sc.nextInt();
System.out.print("Enter the number of columns for the second matrix: ");
int c2 = sc.nextInt();
    
if (c1 != r2) {
System.out.println("Matrix multiplication not possible. The number of columns of the first matrix must be equal to the number of rows of the second matrix.");
return;
}

int[][] m1 = new int[r1][c1];
int[][] m2 = new int[r2][c2];
int[][] resultMatrix = new int[r1][c2];
    
System.out.println("Enter elements of the first matrix:");
for (int i = 0; i < r1; i++) {
for (int j = 0; j < c1; j++) {
m1[i][j] = sc.nextInt();
}
}
     
System.out.println("Enter elements of the second matrix:");
for (int i = 0; i < r2; i++) {
for (int j = 0; j < c2; j++) {
m2[i][j] = sc.nextInt();
}
}
      
for (int i = 0; i < r1; i++) {
for (int j = 0; j < c2; j++) {
resultMatrix[i][j] = 0;
for (int k = 0; k < c1; k++) {
resultMatrix[i][j] += m1[i][k] * m2[k][j];
}
}
}
      
System.out.println("Resultant matrix after multiplication:");
for (int i = 0; i < r1; i++) {
for (int j = 0; j < c2; j++) {
System.out.print(resultMatrix[i][j] + " ");
}
System.out.println();
}

sc.close();
}
}

