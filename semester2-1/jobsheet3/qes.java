package jobsheet3;

public class qes {
    public static void main(String[] args) {
        Rectangle[][] rectangleArray = new Rectangle[2][3]; 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                rectangleArray[i][j] = new Rectangle();
                rectangleArray[i][j].length = i * 10 + j * 5; 
                rectangleArray[i][j].width = i * 5 + j * 2; 
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Rectangle at position [" + i + "][" + j + "]: width - " + rectangleArray[i][j].width + ", length - " + rectangleArray[i][j].length);
            }
        }
    }
}