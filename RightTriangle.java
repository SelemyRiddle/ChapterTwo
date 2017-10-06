import java.util.Scanner;
public class RightTriangle
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double side1, side2;
        double hypotenuse;
        System.out.print("Please enter the length of one side of a right triangle");
        side1= keyboard.nextDouble();
        System.out.print("Please enter the length of the second side of a right triangle");
        side2= keyboard.nextDouble();
        hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}