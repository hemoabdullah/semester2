package jobsheet3 ;
import java.util.Scanner;

    public class ArrayOfObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rectangles: ");
        int numRectangles = sc.nextInt();
        Rectangle[] rectangleArray = new Rectangle[numRectangles]; // Define array length based on user input
        for (int i = 0; i < numRectangles; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);
            System.out.println("Input length : ");
            rectangleArray[i].length = sc.nextInt();
            System.out.println("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }
        for (int i = 0; i < numRectangles; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width " + rectangleArray[i].width + ", length: " + rectangleArray[i].length);
        }
        rectangleArray[0] = new Rectangle();
        rectangleArray[0].length = 110;
        rectangleArray[0].width = 30;

        rectangleArray[1] = new Rectangle();
        rectangleArray[1].length = 80;
        rectangleArray[1].width = 40;

        rectangleArray[2] = new Rectangle();
        rectangleArray[2].length = 100;
        rectangleArray[2].width = 20;

        System.out.println("First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        System.out.println("Second rectangle, width: " + rectangleArray[1].width + ", length: " + rectangleArray[1].length);
        System.out.println("Third rectangle, width: " + rectangleArray[2].width + ", length: " + rectangleArray[2].length);
    }
}
