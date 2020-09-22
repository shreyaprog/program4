import java.util.Scanner;
public class armstrong_no
{
    Scanner sc=new Scanner(System.in);
    int n;
    int sum;
    int t;
    int rem;
    void getData()
    {
        System.out.println("enter a number");
        n=sc.nextInt();
        t=n;
    }
    void calc()
    {
        while(t!=0)
        rem=t%10;
        t=t/10;
        sum=sum+rem*rem*rem;
        {
        System.out.println(sum);
    }
    }
    void check()
    {
    if(n==sum);
    System.out.println(n+"is an Armstrong number"); 
     
     System.out.println(n+"not an Armstrong number");
}
public static void main()
{
armstrong_no obj=new armstrong_no();
obj.getData();
obj.calc();
obj.check();
}
}
