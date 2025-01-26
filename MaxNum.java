import java.util.Scanner;
public class MaxNum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
MaxNum num= new MaxNum();

System.out.println("--MAX OF TWO NUMBERS--");
System.out.println("Enter first number:");
int first = sc.nextInt();
System.out.println("Enter second number:");
int second = sc.nextInt();
num.numMax(first, second);

System.out.println("--MAX OF THREE NUMBERS--");
System.out.println("Enter first number:");
int firstThree = sc.nextInt();
System.out.println("Enter second number:");
int secondThree = sc.nextInt();
System.out.println("Enter third number:");
int thirdThree = sc.nextInt();
num.numMax(firstThree, secondThree, thirdThree);}

void numMax(int first , int second) {
if (first > second){
System.out.println("Max num is :"+first);
}
else{
System.out.println("Max num is :"+second);}}

void numMax(int first , int second, int third) {
if (first > second && first>third){
System.out.println("Max num is :"+first);
}
else if (second > third) {
System.out.println("Max num is :"+second);}
else{
System.out.println("Max num is :"+third);
}}}




