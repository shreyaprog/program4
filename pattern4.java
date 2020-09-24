import java.util.Scanner;
public class pattern4
{
    int n;
    
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number or rows for the pattern:");
        n=sc.nextInt();
    }
    void generatePattern()
    {
        for(int i=1;i<=n;i++)
        for(int j=1;j<=i;j++)
        System.out.print(""+j);
        System.out.println();
}
public static void main()
    {
        pattern4 obj=new pattern4();
        obj.getData();
        obj.generatePattern();
    }
}

        
    