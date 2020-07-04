package JavaCodeReview01Fasy;

/*
1. (10) Create a Java class with a main() method that can be used for running the program.
        2. (20) Create a solution for the following problem: given a width and a height of
        a rectangular (image below, left side), calculate the rectangular area.
        3. (30) Create this solution with the usage of a new Java method calculateRectArea, that
        returns a computed value.  Call this method with two different sets of
        arguments: 20cm (width1) and 30cm (height1), as well as 40cm (width2) and 50cm
        (height2)
*/


public class Rectangle01 {

    public static int calculateRectArea(int width, int height){
        return width * height;
    }

    public static void main(String[] args) {

        int width1 = 20;
        int height1 = 30;
        int width2 = 40;
        int height2 = 50;

        System.out.println("Width1: " + width1 + ", " + "Height1: " + height1);
        System.out.println("The area of the Rectangle1 is: " + calculateRectArea(width1, height1));
        System.out.println();
        System.out.println("Width2: " + width2 + ", " + "Height2: " + height2);
        System.out.println("The area of the Rectangle2 is: " + calculateRectArea(width2, height2));
    }
}
