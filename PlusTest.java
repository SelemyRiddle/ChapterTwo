public class PlusTest
{
    public static void main (String[] args)
    {
        System.out.println("This is a long string that is the " +
                                "concatenation of two shorter strings.");
        //prediction: will print string normally
        //real: printed without errors
        System.out.println ("The first computer was invented about" + 55 +
                                "years ago.");
        //prediction: will print fine
        //real: missing spaces before/after 55
        System.out.println ("8 plus 5 is " + 8 + 5);
        //prediction: will print "is 8 + 5" instead of sum
        //real: printed "is 85"
        System.out.println ("8 plus 5 is " + (8 + 5));
        //prediction: will print with sum
        //real: printed wiht sum
        System.out.println (8 + 5 + " equals 8 plus 5.");
        //prediction: will print sum with string
        //real: printed sum with string
    }
}