import java.util.*;
class main1{

public static void main(String[] args)
{
PProduct obj1=new PProduct();
PProduct obj2=new PProduct();
PProduct obj3=new PProduct();
System.out.println("Jerry James \n 23mca036 \n 13-02-24");
System.out.println("Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price.");
System.out.println("****************************");

obj1.product();
obj2.product();
obj3.product();

obj1.display();
obj2.display();
obj1.display();

System.out.println("Product having the lowest price\n");
if(obj1.price<obj2.price && obj1.price<obj3.price)
System.out.println("name: "+obj1.name+"\nprice :"+obj1.price);
else if(obj2.price<obj3.price && obj2.price<obj1.price)
System.out.println("name: "+obj2.name+"\nprice :"+obj2.price);
else
System.out.println("name: "+obj3.name+"\nprice :"+obj3.price);
}
}

class PProduct{
int pcode;
String name;
float price;
void product()
{
Scanner sc=new Scanner(System.in);

System.out.println("\nEnter product code");
pcode=sc.nextInt();
System.out.println("Enter product name");
name=sc.next();
System.out.println("Enter product price");
price=sc.nextInt();
}
void display()
{
System.out.println("\nDetails");
System.out.println("code: "+pcode+"\tname: "+name+"\tprice: "+price+"\n");
}
}
