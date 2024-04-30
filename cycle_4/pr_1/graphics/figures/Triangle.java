package graphics.figures;
public class Triangle{
float l;
float b;
double area;
public void Triangle(float l,float b)
{
this.l=l;
this.b=b;
area=0.5*l*b;
}
public void area()
{
System.out.println("Area of triangle="+area);
}
}
