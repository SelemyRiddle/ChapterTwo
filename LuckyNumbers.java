import java.util.Random;
public class LuckyNumbers
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int lucky1, lucky2;
        lucky1 = Math.abs(generator.nextInt())%30 + 50;
    }
}