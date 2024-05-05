package cycle_4.pr_2;

import cycle_4.pr_2.arithmatic.*;
import java.util.*;

class calc {
    public static void main(String[] args)
    {
        Div d=new Div();
        Mul m=new Mul();
        Sub sub=new Sub();
        Sum s=new Sum();
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        s.output(a, b);
        sub.output(a, b);
        d.output(a, b);
        m.output(a, b);
        sc.close();
    }
}
