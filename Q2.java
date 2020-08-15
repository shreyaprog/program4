public class Q2
{
    void commissionCalc(double sales)
    {
        double commission;
        System.out.println("The sales entered is"+sales);
        if ((sales>=0)&&(sales<10000))
        {
            commission=sales*(5/100);
            System.out.println("The commission is "+commission);
        }
        else if(sales>50000)
        {
            commission=sales*(10/100);
            System.out.println("The commission is "+commission);
        }
        else
        {
            System.out.println("Invalid sales amount");
        }
    }
}
    
           
        
    
    

  
