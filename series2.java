import java.util.Scanner;
public class series2
{
    int n;
    int sum;
    int i;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("8");
    }
    void computeSum()
    {
        int sum=2;
        for(i=0;i<=n;i++)
        sum=sum+i;
    }
    void display()
    {
        System.out.println(sum);
    }
    public static void main()
    {
        series2 obj=new series2();
        obj.getData();
        obj.computeSum();
        obj.display();
    }
}   