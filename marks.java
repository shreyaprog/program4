public class marks
{
    double wmarks=0;
    double wper;
    double term1;
    double term2;
    double term3;
    void init(int term1,int term2,int term3)
    {
        term1=412;
        term2=423;
        term3=430;
    }
    void calc()
    {
        wmarks=412*0.30+423*0.30+430*0.40;
        wper=wmarks/500*100;
    }
    void display()
    {
        System.out.println("weighted marks are:"+wmarks);
        System.out.println("weighted pers are:"+wper+"%");
    }
     public static void main(String args[])
     {
         marks obj=new marks();
         obj.calc();
         obj.display();
        }
    }