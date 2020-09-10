import java.util.Scanner;
class pattern2
  {
 int n;
 void getData()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enetr the value of n:");
     n=sc.nextInt();
    }
    void generatePattern()
    {
        int x=0;
        for(int i=1;i<=n;i++)
        {
            x=i;
            for(int j=1;j<=i;j++)
            System.out.print(""+(x++));
            System.out.println();
        }
    }
    public static void main()
    {
        pattern2 obj=new pattern2();
        obj.getData();
        obj.generatePattern();
    }
}

        