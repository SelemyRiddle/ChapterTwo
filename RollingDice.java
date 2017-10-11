import java.util.Random;
public class RollingDice
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        int die1, die2,dieSum;
        die1 = Math.abs(generator.nextInt())%7;
        die2 = Math.abs(generator.nextInt())%7;
        dieSum= die1+die2;
        System.out.println("The first die rolled a " + die1);
        System.out.println("The second die rolled a " + die2);
        System.out.println("The total roll is " + dieSum);
        
    }
}