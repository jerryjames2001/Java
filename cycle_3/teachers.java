import java.util.*;
class employee_inherit
{
int empid;
String name;
double salary;
String address;
}
class teachers extends employee_inherit
{
String dept;
String subject;
void display()
{
System.out.print("\nEmployee id :"+empid);
System.out.print("\nEmployee name :"+name);
System.out.print("\nEmployee salary :"+salary);
System.out.print("\nEmployee address :"+address);
System.out.print("\nteacher's department :"+dept);
System.out.println("\nteacher's subject :"+subject+"\n");
}
public static void main(String[] args)
{
System.out.println("Jerry James \n 23mca036 \n 08-04-24");
System.out.println("Create a class ‘Employee’ with data members Empid, Name, Salary, Address. Create another class ‘Teacher’ that inherit the properties of class employee and contain its own data members department.");
System.out.println("****************************");
int i,n;
try(Scanner sc=new Scanner(System.in))
{
System.out.println("Enter the no: of teachers");
n=sc.nextInt();
teachers obj[]=new teachers[n];
for(i=0;i<n;i++)
{
obj[i]=new teachers();
System.out.print("\nEnter employee id :");
obj[i].empid=sc.nextInt();
sc.nextLine();
System.out.print("\nEnter employee name :");
obj[i].name=sc.nextLine();
System.out.print("\nEnter employee salary :");
obj[i].salary=sc.nextDouble();
sc.nextLine();
System.out.print("\nEnter employee address :");
obj[i].address=sc.nextLine();
System.out.print("\nEnter teacher dept :");
obj[i].dept=sc.nextLine();
System.out.print("\nEnter teacher subject :");
obj[i].subject=sc.nextLine();
}
for(i=0;i<n;i++)
obj[i].display();
}

}
}
