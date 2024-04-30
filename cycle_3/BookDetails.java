import java.util.*;
class publisher{
    String publish;
    publisher(String pub)
    {
        this.publish=pub;
    }
}
class book extends publisher{
    String bname;
    book(String pub,String name)
    {
        super(pub);
        bname=name;
    }
}

class literature extends book{
    String category;
    literature(String pub, String name, String category)
    {
        super(pub,name);
        this.category=category;
    }
    void display()
    {
        System.out.println("Literatures");
        System.out.print("\nBook: " +bname+ "\tPublisher: " +publish+ "\tCategory: " +category+"\n");
    }
}

class fiction extends book{
    String category;
    fiction(String pub, String name, String category)
    {
        super(pub,name);
        this.category=category;
    }
    void display()
    {
        System.out.println("Fictionss");
        System.out.print("\nBook: " +bname+ "\tPublisher: " +publish+ "\tCategory: " +category+"\n");
    }
}


public class BookDetails {
    public static void main(String[] args)
    {
        literature L;
        fiction F;
        String a,b,lc,fc;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter literature book derailss ********");
            System.out.println("Enter author name");
            a=sc.nextLine();
            System.out.println("Enter book name");
            b=sc.nextLine();
            System.out.println("Enter book category");
            lc=sc.nextLine();
            L = new literature(a, b, lc);
            L.display();
            
            System.out.println("Enter fiction book details ********");
            System.out.println("Enter author name");
            a = sc.nextLine();
            System.out.println("Enter book name");
            b = sc.nextLine();
            System.out.println("Enter book category");
            fc = sc.nextLine();
            F = new fiction(a, b, fc);
            F.display();
        }
    }
}
