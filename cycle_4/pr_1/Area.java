import graphics.figures.*;
import java.util.Scanner;
public class Area{

public static void main(String[] args)
{
    System.out.println("Jerry James \n 23mca036 \n 10-04-24");
    System.out.println("Package using shapes");
    System.out.println("****************************");
Rectangle r=new Rectangle();
Circle c=new Circle();
Triangle t=new Triangle();
Square s=new Square();
r.Rectangle(5,2);
r.area();
c.Circle(2);
c.area();
t.Triangle(2,3);
t.area();
s.Square(5);
s.area();
}
}
