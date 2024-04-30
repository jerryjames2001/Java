package graphics.figures;
public class Rectangle{
float x;
float y;
double area;
public void Rectangle(float a,float b)
{
this.x=a;
this.y=b;
area=x*y;
}
public void area()
{
System.out.println("Area of rectangle="+area);
}
}
