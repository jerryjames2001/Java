import java.util.*;
class shapes{
int l,b,r;
double area,pi;
void shapes(int l)
{
//area of square
area=l*l;
System.out.println("Area of square="+area);
}

void shapes(int l,int b)
{
//area of rectangle
area=l*b;
System.out.println("Area of reactangle="+area);
}

void shapes(double pi,int r)
{
//area of circle
area=pi*r*r;
System.out.println("Area of circle="+area);
}

public static void main(String[] args)
{
shapes obj=new shapes();
int x,y,r;
double pi=3.14;
System.out.println("Jerry James \n 23mca036 \n 02-04-24");
System.out.println("Area of different shapes using overloaded functions");
System.out.println("****************************");
  
try(Scanner sc=new Scanner(System.in))
{
System.out.print("Enter the length to find area of square :");
x=sc.nextInt();
obj.shapes(x);
System.out.print("\nEnter the length and breadth to find area of reactangle :");
x=sc.nextInt();
y=sc.nextInt();
obj.shapes(x,y);
System.out.print("\nEnter the radius to find area of circle :");
r=sc.nextInt();
obj.shapes(pi,r);
}
}
}
