
public class q7_Student
{
    public static void main(int name,int roll_number,double mat,double sci,double hindi,double comp,double comm)
    {
        System.out.println("The name of the student"+name);
        double total=mat+sci+comp+comm;
        double per=(total/100)*100;
        if (per>=90);
        {
          System.out.println("Science with Computers");
        }
         if (per>=80 && per<=89);
        {
         System.out.println("Science without Computers");
        }
         if (per>=70 && per<=79);
        {
          System.out.println("Commerce with Maths");
        }
         if (per>=60 && per<=69);
         {
             System.out.println("Commerce without Maths");
            }
        }
    }