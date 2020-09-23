public class spy_num
{
    int pro;
    int sum;
    int n1,n2;
    void init()
    {
        n1=2;
        n2=2;
    }
    void calc()
    {
        sum=n1+n2;
        pro=n1*n2;
    }
    void display()
    {
    if(sum==pro)
    System.out.println("spy no");
    else
    System.out.println("not a spy no");
}
public static void main(String args[])
{
    spy_num obj=new spy_num();
    obj.init();
    obj.calc();
    obj.display();
}
}