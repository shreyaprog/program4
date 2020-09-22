import java.util.Scanner;
public class scanner1
{
    int n1;
    int n2;
    int n3;
    int sum;
    void init()
    {
        n1=5;
        n2=8;
        n3=7;
    }
    void getData()
        {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
    }
    void calc()
    {
       sum= (5*5*5)+(8*8*8)+(7*7*7);
    }
    void display()
    {
        System.out.println("Three numbers are:"+n1+","+n2+","+n3);
        System.out.println("Sum of their cubes is"+sum);
    }
    public static void main()
    {
    scanner1 obj=new scanner1();
    obj.getData();
    obj.calc();
    obj.display();
}
}  