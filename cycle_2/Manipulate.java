import java.util.*;

class Manipulate {
    void merge(String a, String b) {
        System.out.println("\nConcatinating");
        System.out.println(a.concat(" ").concat(b));
        // 2 concat for adding a space btw 2 of them
    }

    void convert(String a, String b) {
        System.out.print("\nConverting to upper case :");
        System.out.println(a.toUpperCase());
        System.out.print("Converting to lower case :");
        System.out.println(a.toLowerCase());
    }

    void replace(Scanner sc, String a) {
        String x, y;
        System.out.println("\nCurrent string :" + a);
        System.out.print("Enter new string to replace :");
        x = sc.next();
        y = a.replace(a, x);
        System.out.println("new string :" + y);
    }

    public static void main(String[] args) {
        System.out.println("Jerry James \n 23mca036 \n 01-04-24");
        System.out.println("Perform string manipulations.");
        System.out.println("****************************");
        Manipulate obj = new Manipulate();
        String x, y;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string 1 :");
            x = sc.next();
            System.out.print("Enter string 2 :");
            y = sc.next();
            obj.merge(x, y);
            obj.convert(x, y);
            obj.replace(sc, x);
        }
    }
}
