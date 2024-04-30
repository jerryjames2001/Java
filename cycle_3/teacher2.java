import java.util.*;
class person{
String name;
String gender;
String address;
int age;
void input(String name,String gender,String address,int age)
{
this.name=name;
this.gender=gender;
this.address=address;
this.age=age;
}
}

class employee extends person{
int empid;
String company_name;
String qualification;
double salary;
void input(int id,String cname,String qual,double sal)
{
empid=id;
company_name=cname;
qualification=qual;
salary=sal;
}
}

class teacher2 extends employee{
String subject;
String department;
int teacherid;
void input(String sub,String dept,int id)
{
subject=sub;
department=dept;
teacherid=id;
}
void display()
{
System.out.print("\n\nName : "+name);
System.out.print("\tGender :"+gender);
System.out.print("\tAddress : "+address);
System.out.println("\tAge : "+age);
System.out.print("Emp_id : "+empid);
System.out.print("\tCompany name : "+company_name);
System.out.print("\tQualification : "+qualification);
System.out.println("\tSalary : "+salary);
System.out.print("Subject : "+subject);
System.out.print("\tDepartment : "+department);
System.out.print("\tTeacher id : "+teacherid+"\n");
}

public static void main(String[] args)
{
int i,n,age,empid,teachid;
double sal;
String name,gender,address,cname,quali,sub,dept;

try(Scanner sc=new Scanner(System.in))
{
System.out.print("\nEnter the no: inputs");
n=sc.nextInt();
teacher2 obj[]=new teacher2[n];
for(i=0;i<n;i++)
{

obj[i]=new teacher2();
sc.nextLine();
System.out.print("\nEnter person name: ");
name=sc.nextLine();
System.out.print("\nGender: ");
gender=sc.nextLine();
System.out.print("\nAddress: ");
address=sc.nextLine();
System.out.print("\nAge");
age=sc.nextInt();
obj[i].input(name,gender,address,age);

System.out.print("\nEnter employee id: ");
empid=sc.nextInt();
sc.nextLine();
System.out.print("\nCompany name: ");
cname=sc.nextLine();
System.out.print("\nQualification : ");
quali=sc.nextLine();
System.out.print("\nSalary: ");
sal=sc.nextInt();
obj[i].input(empid,cname,quali,sal);

sc.nextLine();
System.out.print("\nSubject : ");
sub=sc.nextLine();
System.out.print("\nDepartment : ");
dept=sc.nextLine();
System.out.print("\nTeacher id : ");
teachid=sc.nextInt();
obj[i].input(sub, dept, teachid);
}
for(i=0;i<n;i++)
obj[i].display();
}
}
}
