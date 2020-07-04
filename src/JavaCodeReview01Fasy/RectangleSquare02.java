package JavaCodeReview01Fasy;
import java.util.Random;

//5. (10) Demonstrate solutions from point 3 and 4 with several method calls (at least 3 for each) with different arguments.

public class RectangleSquare02 {

    public static void main(String[] args) {

        Random rand = new Random();
        Rectangle01 re = new Rectangle01();
        Square01 sq = new Square01();

        int width1 = rand.nextInt(100);
        int height1 = rand.nextInt(100);
        int width2 = rand.nextInt(100);
        int height2 = rand.nextInt(100);
        int width3 = rand.nextInt(100);
        int height3 = rand.nextInt(100);
        int width4 = rand.nextInt(100);
        int height4 = rand.nextInt(100);


        System.out.println("Width1: " + width1 + ", " + "Height1: " + height1);
        System.out.println("The area is: " + re.calculateRectArea(width1, height1));
        System.out.println();
        System.out.println("Width2: " + width2 + ", " + "Height2: " + height2);
        System.out.println("The area is: " + re.calculateRectArea(width2, height2));
        System.out.println();
        System.out.println("Width3: " + width3 + ", " + "Height3: " + height3);
        System.out.println("The area is: " + re.calculateRectArea(width3, height3));
        System.out.println();
        System.out.println("Width4: " + width4 + ", " + "Height4: " + height4);
        System.out.println("The area is: " + re.calculateRectArea(width4, height4));
        System.out.println();



        System.out.println("Width1: " + width1);
        System.out.println("The area is: " + sq.calculateSquareArea(width1));
        System.out.println("The perimeter is: " + sq.calculateSquarePerimeter(width1));
        System.out.println();
        System.out.println("Width2: " + width2);
        System.out.println("The area is: " + sq.calculateSquareArea(width2));
        System.out.println("The perimeter is: " + sq.calculateSquarePerimeter(width2));
        System.out.println();
        System.out.println("Width1: " + width3);
        System.out.println("The area is: " + sq.calculateSquareArea(width3));
        System.out.println("The perimeter is: " + sq.calculateSquarePerimeter(width3));
        System.out.println();
        System.out.println("Width1: " + width4);
        System.out.println("The area is: " + sq.calculateSquareArea(width4));
        System.out.println("The perimeter is: " + sq.calculateSquarePerimeter(width4));

    }

}
