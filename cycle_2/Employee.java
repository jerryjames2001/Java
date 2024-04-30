import java.util.*;
public class Employee {
int id;
String name;
int salary;
public void input(Scanner sc)
{
    System.out.print("\nEnter the employee id: ");
    id=sc.nextInt();
    System.out.print("Enter employee name: ");
    name=sc.next();
    System.out.print("Enter emplyee salary: ");
    salary=sc.nextInt();
}
public void display()
{
    System.out.print("\nid : "+id);
    System.out.print("\nName : "+name);
    System.out.println("\nSalary"+salary);
}
    
public static void main(String[] args)
{
int n,i,key,flag=0;
System.out.println("Jerry James \n 23mca036 \n 01-04-24");
System.out.println("Program to create a class for Employee having attributes eNo, eName eSalary. Read n \n employ information and Search for an employee given eNo, using the concept of Array of\n Objects.");
System.out.println("****************************");
try(Scanner sc=new Scanner(System.in))
{
System.out.println("Enter the no:of employess");
n=sc.nextInt();
Employee emp[]=new Employee[n];
for(i=0;i<n;i++)
{
    System.out.println("\nEnter the employee "+(i+1)+" details");
    emp[i]=new Employee();
    emp[i].input(sc);
}
for(i=0;i<n;i++)
{
    System.out.println("\nEmplyee details of "+(i+1));
    emp[i].display();
}
System.out.print("\nEnter the id to search : ");
key=sc.nextInt();
for(i=0;i<n;i++)
{
    if(key==emp[i].id)
    {
        emp[i].display();
        flag=1;
        break;
    }
}
if (flag==0)
System.out.println("\nSearch id "+key+" not found");
}
}
}