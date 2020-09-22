import java.util.Scanner;
public class series3
{
    int i;
    int n;
    int sum;
    void getData()
    {
         Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter number of terms");
    }
    void computeSum()
    {
        int sum=0;
        for(i=0;i<=n;i++)
        sum=sum+i;
    }
    void display()
    {
        System.out.println(sum);
    }
    public static void main()
    {
        series3 obj=new series3();
        obj.getData();
        obj.computeSum();
        obj.display();
    }
}   