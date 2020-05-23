public class q4_switch_bp
{
    public static void main(char ch,double P,double R,int n, double mp, double rd_rate,int time_in_months)
    {
        switch(ch)
        {
            case'M':
            double x=(1+(R/100));
            double Amt=P*Math.pow(x,n);
            System.out.println("amount="+Amt);
            break;
            case 'T':
            double A= mp*time_in_months+(mp*time_in_months*(time_in_months+1)/2.0)*(rd_rate/100.0)*(1/12.0);
            System.out.println("maturity amount="+A);
            break;
            default:System.out.println("invalid");
            break;
        }
    }
}