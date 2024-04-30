import java.util.*;
class student{
    String name,dept;
    student(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }
    void display()
    {
        System.out.println("Name : "+name+"\tDepartment : "+dept);
    }
}
class sports{
    String category;
    int place;
    sports(String  cateogry,int place)
    {
        this.category=cateogry;
        this.place=place;
    }
    void display()
    {
        System.out.println("Category: "+category+"\tplace: "+place);
    }
}
class result
{
    student st;
    sports sp;
    result(student st,sports sp)
    {
        this.st=st;
        this.sp=sp;
    }
    void display()
    {
        st.display();
        sp.display();
    }
}
public class Score {
    public static void main(String[] args)
    {
        String name,dept,category;
        int place;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Student Name and Department");
        name=sc.nextLine();
        dept=sc.nextLine();
        student st=new student(name,dept);
        System.out.println("Enter  Category and Place of the Sportsman 1'st 2'nd 3'rd");
        category=sc.nextLine();
        place=sc.nextInt();
        sc.nextLine();
        sports sp=new sports(category, place);
        result re=new result(st, sp);
        re.display();
        sc.close();
    }
}