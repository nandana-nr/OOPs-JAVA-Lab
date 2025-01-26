import java.util.Scanner;
public class frequency{
public static void main(String[] args) {  
Scanner sc= new Scanner(System.in);

System.out.println("Enter a string: ");
String str=sc.nextLine();

System.out.println("Enter the character to find its frequency: ");
char a = sc.next().charAt(0);

char charcopy=Character.toLowerCase(a);

int f=0;
String strCopy=str;
for(int i=0;i<str.length();i++){
if(charcopy==str.charAt(i)){
f++;
}
}
System.out.println("The frequency of the given character" +a+ "in the string" +strCopy+ "is:" +f);
}
}
