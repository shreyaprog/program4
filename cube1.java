public class cube1
{
    double ans;
    double n1;
    double n2;
    double n3;
    double result;
    void init(int num1,int num2,int num3)
    {
    n1=num1;
    n2=num2;
    n3=num3;
}
    void calc()
    {
       ans=n1*n2*n3;
       
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
    cube1 obj=new cube1();
    obj.init(6,8,3);
    obj.calc();
    obj.display();
}
}
