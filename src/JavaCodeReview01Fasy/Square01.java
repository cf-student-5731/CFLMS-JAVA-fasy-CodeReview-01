package JavaCodeReview01Fasy;


/*4. (30) Create a solution for the following problem: given a width of a square (image
        below, right side), calculate the squareArea (on image below 16
        cm²)  and the squarePerimeter (Perimeter:  line forming the boundary of a closed
        geometrical figure.  Example: for a square with a width = 4cm, squarePerimeter  is 16
        cm; for a square with a width = 2cm, squarePerimeter  is 8cm)*/


public class Square01 {

    public static int calculateSquareArea(int width){
        return width * width;
    }

    public static int calculateSquarePerimeter(int width){
        return width * 4;
    }


    public static void main(String[] args) {

        int width1 = 4;
        int width2 = 2;

        System.out.println("Width1: " + width1);
        System.out.println("The area of the Square1 is: " + calculateSquareArea(width1));
        System.out.println("The perimeter of the Square1 is: " + calculateSquarePerimeter(width1));
        System.out.println();
        System.out.println("Width2: " + width2);
        System.out.println("The area of the Square2 is: " + calculateSquareArea(width2));
        System.out.println("The perimeter of the Square2 is: " + calculateSquarePerimeter(width2));




    }
}
