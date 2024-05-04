import java.util.*;
public interface calculator {
    double claculate(int quantity,double price);
}
class billgenerator implements calculator
{
    String name;
    double unit_p,total;
    int quantity; 
    public billgenerator(String name, double unit_p, int quantity) {
        this.name = name;
        this.unit_p = unit_p;
        this.quantity = quantity;
    }
    @Override
    public double claculate(int quantity,double price)
    {
        return quantity*price;
    }
}

class BillCalculator{
    public static void main(String[] args)
    {
        int quantity,n,i;
        String name;
        double unitprice,total,st=0;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter the no:of products");
            n=sc.nextInt();
            billgenerator bill[]=new billgenerator[n];
            
            for(i=0;i<n;i++)
            {
                sc.nextLine();
            System.out.print("\nEnter the product "+ (i+1) +" name: ");
            name=sc.nextLine();
            System.out.print("\nEnter unit price: ");
            unitprice=sc.nextDouble();
            System.out.print("\nEnter quantity: ");
            quantity=sc.nextInt();
            bill[i] = new billgenerator(name, unitprice, quantity);
            }  
            
            System.out.println("Name\t Unit Price\tQuantity\t Total");
            System.out.println("----------------------------------------------");
            for (i = 0; i < n; i++) {
                    total = display((billgenerator) bill[i]);
                    st += total;
                }
                System.out.println("------------------------------------------");
                System.out.println("\nTotal Price: " + st);
                System.out.println("------------------------------------------");
        }    
    }
    private static double display(billgenerator bill)
    {
        double total = bill.claculate(bill.quantity, bill.unit_p);
        System.out.println(bill.name + "\t" + bill.unit_p + "\t\t"+bill.quantity +"\t\t"+ total);
        return total;
    }
}