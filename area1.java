public class area1
{
    double n1;
    double n2;
    double ans;
    void init(int num1,int num2)
    {
       n1=num1;
       n2=num2;
    }
    void calc()
{
  ans=n1*n2;
}
   void display()
{
System.out.println(ans);
}
public static void main()
{
  area1 obj=new area1();
  obj.init(3,4);
  obj.calc();
  obj.display();
}
}