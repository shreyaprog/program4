public class cube1
{
    double ans;
    double n1;
    double result;
    void init(int num1)
    {
    n1=num1;
    
}
    void calc()
    {
       ans=n1*n1*n1;
       
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
    cube1 obj=new cube1();
    obj.calc();
    obj.display();
}
}