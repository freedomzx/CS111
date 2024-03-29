public class ParkingMeter
{
    private int timeLeft = 0;
    private int maxTime;
    public ParkingMeter(int num)
    {
        maxTime = num;
    }
    public boolean add(int num)
    {
        if(num == 25)
        {
            if(timeLeft + 30 <= maxTime)
            {
                timeLeft+=30;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public void tick()
    {
        if(timeLeft > 0)
        {
            timeLeft--;
        }
    }
    public boolean isExpired()
    {
        if(timeLeft == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
