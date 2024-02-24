import java.util.*;
public class main3 {
    int img,real;
    void input(Scanner sc)
    {
        System.out.println("Enter the real part ");
        real=sc.nextInt();
        System.out.println("Enter the imaginary part ");
        img=sc.nextInt();
    }

    
    public static void main(String[] args) {
        System.out.println("Jerry James \n 23mca036 \n 19-02-24");
System.out.println("Add complex numbers");
System.out.println("****************************");
        try(Scanner sc=new Scanner(System.in))
        {
        main3 one=new main3();
        main3 two=new main3();
        one.input(sc);
        two.input(sc);
        int simg = one.img + two.img;
        int sreal = one.real + two.real;
        System.out.println("\n"+sreal+" + "+simg+"i");
        }
    }
}
