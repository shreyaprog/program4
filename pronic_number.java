public class pronic_number
{
    int n;
   
    int pro;
    int i;
    int num;
    void init(int num)
    {
        n=num;
        
    }
    void calc()
    {
      for(i=0;i<n;i++)
      {
       pro=i*(i+1);
       if (pro==num)
      System.out.println("pronic num");
      else
      System.out.println("not a pronic num");
    }
}
public static void main()
{
    pronic_number obj=new pronic_number();
    obj.init(15);
    obj.calc();
}
}