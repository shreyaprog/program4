public class time
{
        double hr,min,sec,con1;
        void accept(double hour,double minutes,double secs)
        {
            hr=hour;
            min=minutes;
            sec=secs;
        }
        void convert()
        {
            con1=(hr*60*60)+(min*60)+sec;
        }
        void Result()
        {
            System.out.println(con1);
        }
    }