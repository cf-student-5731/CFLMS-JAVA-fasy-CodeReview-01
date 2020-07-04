package JavaCodeReview01Fasy;

public class RectangleSquareBonus02 {

    public static void main(String[] args) {
        Rectangle01 re = new Rectangle01();

        int[] input = new int[args.length];

        try {


            for (int i = 0; i < args.length; i++) {
                input[i] = Integer.parseInt(args[i]);
            }
            int j = 0;
            for (int i = 0; i < args.length; i = i + 2) {
                j++;
                System.out.println("Width" + j + ": " + input[i] + ", Height" + j + ": " + input[i + 1]);
                System.out.println("The area is: " + re.calculateRectArea(input[i], input[i + 1]));
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Processing stopped:");
            System.out.println(args.length + " Values entered!");
            System.out.println("Error Please enter one or two sets of Width and Height as Integer!");
        }
    }
}




