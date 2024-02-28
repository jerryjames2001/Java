import java.util.Scanner;
import java.util.Arrays;
class StringSort{
void input()
{
try(Scanner sc=new Scanner(System.in))
{
System.out.println("Enter the string");
String st=sc.nextLine();
char array[]=st.toCharArray();
Arrays.sort(array);
System.out.println("After sorting");
st=new String(array);
System.out.println("Character is : "+st);
}
}


public static void main(String[] args)
{
System.out.println("Jerry James\n23mca036\n26-02-2024");
System.out.println("Program to Sort strings");
System.out.println("***************************\n");
StringSort obj=new StringSort();
obj.input();
}
}
