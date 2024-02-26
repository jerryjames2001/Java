import java.util.Scanner;
class Search{


void input()
{
try(Scanner sc=new Scanner(System.in)
{
int[] ar=new int[10];
int n,key,i;
System.out.println("Enter the limit for elements");
n=sc.nextInt();
System.out.println("Enter the elements");
for(i=0;i<n;i++)
ar[i]=sc.nextInt();

System.out.println("Enter the element for searching");
key=sc.nextInt();
for(i=0;i<n;i++)
{
if(ar[i]==key)
{int x=i+1;
System.out.println("Found "+key+" at position "+x);
break;
}
else
System.out.println("Element not found");
}
}
}
public static void main(String[] args)
{
System.out.println("Jerry James\n23mca036\n26-02-2024");
System.out.println("Search an element in an array.");
System.out.println("***************************\n");
Search obj=new Search();
obj.input();
}
}
