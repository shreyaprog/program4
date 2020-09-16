public class avg
{
    double num1;
    double num2;
    double num3;
    double ans;
    
void init(int n1,int n2,int n3)
    {
     num1=n1;
     num2=n2;
     num3=n3;
    }
    void calc()
    {
    ans=(num1+num2+num3)/3;
}
void accept()
{
    int ans;
}
void display()
 {
  System.out.println(ans);
   }
public static void main(String args[])
    {
    avg obj=new avg();
    obj.init(5,8,9); 
    obj.calc();
    obj.accept();
    obj.display();
}
} 