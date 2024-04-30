package graphics.figures;
public class Circle{
float r;
double area;
double pi=3.14;
public void Circle(float r)
{
this.r=r;
area=pi*r*r;
}
public void area()
{
System.out.println("Area of circle="+area);
}
}
