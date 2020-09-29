public class temperature
{
    double temp;
    double cel;
    
    void init(int t)
    {
        temp=t;
        temp=92;
    }
    void calc()//farenheit to celcius
    {
      double cel=(5.0/9)*(temp-32);
      
    }
    void display()
    {
     System.out.println("double cel");
    }
    public static void main(String args[])
    {
       temperature obj=new temperature();
       obj.init(92);
       obj.calc();
       obj.display();
    }
} 