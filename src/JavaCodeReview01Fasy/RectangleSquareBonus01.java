package JavaCodeReview01Fasy;

import java.util.Random;

/*(10) Save your test data (several widths / heights) for several different rectangles. Think about the data structure you want to use.
        Use a for loop to perform rectangular surface calculation and display the results of your calculation.*/

public class RectangleSquareBonus01 {
    public static void main(String[] args) {

        Random rand = new Random();
        Rectangle01 re = new Rectangle01();
        Square01 sq = new Square01();

//        int width1 = rand.nextInt(100);
//        int height1 = rand.nextInt(100);
//        int width2 = rand.nextInt(100);
//        int height2 = rand.nextInt(100);
//        int width3 = rand.nextInt(100);
//        int height3 = rand.nextInt(100);
//        int width4 = rand.nextInt(100);
//        int height4 = rand.nextInt(100);

        int amountTestData= 10;

        int width[] = new int[amountTestData];
        int height[] = new int[amountTestData];

        for (int i=0; i<amountTestData; i++){
            width[i] = rand.nextInt(100);
            height[i] = rand.nextInt(100);
        }


        for(int i=0; i<amountTestData; i++){
            System.out.println();
            System.out.println("Width" + (i+1) + " : " + width[i] + ", Height" + (i+1) + " : " + height[i]);
            System.out.println("The area of the Rectangle" + (i+1) + " is: " + re.calculateRectArea(width[i], height[i]));
        }
        System.out.println("=============================================");
        for(int i=0; i<amountTestData; i++){
            System.out.println();
            System.out.println("Width" + (i+1) + " : " + width[i]);
            System.out.println("The area of the Square" + (i+1) + " is: " + sq.calculateSquareArea(width[i]));
            System.out.println("The Perimeter of the Square" + (i+1) + " is: " + sq.calculateSquarePerimeter(width[i]));
        }
    }
}
