import java.util.Scanner ;
public class palindrome {
public static void main( String[] args) {
String str="",reversestr="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to check palindrome:");
str=sc.nextLine();
int strLength=str.length();
for(int i=(strLength-1); i>=0;--i) {
reversestr=reversestr+str.charAt(i);
}
if (str.toLowerCase().equals(reversestr.toLowerCase())) 
{
System.out.println(str+"\tis a palindrome");
} 
else {
System.out.print(str+"\tis not a palindrome");
}}}
