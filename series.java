import java.util.Scanner;
class series
{
    int n;
    void input()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of terms");
       n=sc.nextInt();
       sc.close();
    }
    void calc()
    {
        double sum=0;
        double s1=1;
        double s2=1;
        for(int i=1;i<=n;i++)
        {
            s1+=i+1;
            s2+=i+1;
            sum+=s1/s2;
        }
        System.out.println(sum);
    }
    public static void main()
    {
        series obj=new series();
        obj.input();
        obj.calc();
    }
}   