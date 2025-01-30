import java.util.Scanner;
class employee {
String name;
String phonenumber;
String address;
int age;
int salary;

void printSalary(){
System.out.println("Salary:"+ salary);
}}

class Officer extends employee{
String specialization;

void displayDetails(){
System.out.println("--Officer Details--");
System.out.println("Name:" + name);
System.out.println("PhoneNumber:"+phonenumber);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Specialization:"+specialization);
printSalary();
}}

class Manager extends employee{
String department;

void displayDetails(){
System.out.println("--Manager Details--");
System.out.println("Name:" + name);
System.out.println("PhoneNumber:"+phonenumber);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Salary:"+salary);
System.out.println("Department:"+department);
printSalary();
}}

public class employeeDetails {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

Officer officer=new Officer();
System.out.println("Enter officer's name:");
officer.name=sc.nextLine();
System.out.println("Enter officer's phone number:");
officer.phonenumber=sc.nextLine();
System.out.println("Enter officer's address:");
officer.address=sc.nextLine();
System.out.println("Enter officer's age:");
officer.age=sc.nextInt();
System.out.println("Enter officer's salary:");
officer.salary=sc.nextInt();
System.out.println("Enter officer's specialization:");
officer.specialization=sc.nextLine();

Manager manager=new Manager();
System.out.println("Enter manager's name:");
manager.name=sc.nextLine();
System.out.println("Enter manager's phone number:");
manager.phonenumber=sc.nextLine();
System.out.println("Enter manager's address:");
manager.address=sc.nextLine();
System.out.println("Enter manager's age:");
manager.age=sc.nextInt();
System.out.println("Enter manager's salary:");
manager.salary=sc.nextInt();
System.out.println("Enter manager's department :");
manager.department=sc.nextLine();

officer.displayDetails();
System.out.println();
manager.displayDetails();
System.out.println();

sc.close();
}}






