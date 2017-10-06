public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;
        int length, width, height, doors, windows;
        double totalSqFt;
        double paintNeeded;
        length = 15;
        width = 11;
        height = 8;
        doors = 1;
        windows = 2;
        totalSqFt= ((2*(15*8))+(2*(11*8))+(15*11))-((20*doors)+(15*windows));
        paintNeeded= (totalSqFt/350);
        System.out.println("length: "+length);
        System.out.println("width: "+width);
        System.out.println("height: "+height);
        System.out.println("Gallons needed: "+paintNeeded);
    }
}