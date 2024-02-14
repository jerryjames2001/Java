import java.util.*;

class main2{
int[][] ar1 = new int[5][5];
int[][] ar2 = new int[5][5];
int[][] s=new int[5][5];
int i,j;

void insert()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter matrix 1 elements");
for(i=0;i<2;i++)
for(j=0;j<2;j++)
ar1[i][j]=sc.nextInt();
System.out.println("Enter matrix2 elements");
for(i=0;i<2;i++)
for(j=0;j<2;j++)
ar2[i][j]=sc.nextInt();
}

void display()
{
System.out.println("\nMatrix1");
for(i=0;i<2;i++)
{

for(j=0;j<2;j++)
System.out.print(ar1[i][j]+"  ");
System.out.println();
}
System.out.println("\nMatrix2");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
System.out.print(ar2[i][j]+"  ");
System.out.println();
}
System.out.println("\nSum of matrix is...");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
System.out.print(s[i][j]+"  ");
System.out.println();
}
}

void add()
{
for(i=0;i<2;i++)
for(j=0;j<2;j++)
s[i][j]=ar1[i][j]+ar2[i][j];
}

public static void main(String[] args)
{
main2 obj=new main2();
System.out.println("Jerry James \n 23mca036 \n 14-02-24");
System.out.println("Read 2 matrices from the console and perform matrix addition.");
System.out.println("****************************");

obj.insert();
obj.add();
obj.display();

}
}
