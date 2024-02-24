import java.util.*;
public class main4 {
    int[][] ar=new int[15][15];
    int n,i,j;

    void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size row or column no: required");
        n=sc.nextInt();
        System.out.println("Enter the matrix elements");
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        ar[i][j]=sc.nextInt();
        sc.close();
    }

    void check()
    {
        int count=0;
        System.out.println("The given matrix is\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(" "+ar[i][j]);
            System.out.println();
        }
        System.out.println("Transpose of the matrix is\n");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(" "+ar[j][i]);
            System.out.println();
        }
        // checking
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                if (ar[i][j]!=ar[j][i])
                {
                    count=1;
                    break;
                }
        }
        if(count==1)
        System.out.println("It is not a Symmetric matrix");
        else
        System.out.println("It is a Symmetric matrix");
    }

    public static void main(String[] args) {
    System.out.println("Jerry James \n 23mca036 \n 19-02-24");
    System.out.println("Read a matrix from the console and check whether it is symmetric or not.");
    System.out.println("****************************");
        main4 obj=new main4();
        obj.insert();
        obj.check();
    }
}
