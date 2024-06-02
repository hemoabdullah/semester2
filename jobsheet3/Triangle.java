package jobsheet3;
public class Triangle {
    public int base;
    public int height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }
    public double countArea() {
        return 0.5 * base * height;
    }
    public double countPerimeter() {
        return 2 * base + Math.sqrt(2) * height;
    }
    public static void main(String[] args) {
        Triangle[] trArray = new Triangle[4];
        trArray[0] = new Triangle(10, 4);
        trArray[1] = new Triangle(20, 10);
        trArray[2] = new Triangle(15, 6);
        trArray[3] = new Triangle(25, 10);


        for (int i = 0; i < trArray.length; i++) {
            System.out.println(i + "th trArray base: " + trArray[i].base + ", height: " + trArray[i].height);
            System.out.println("Area: " + trArray[i].countArea());
            System.out.println("Perimeter: " + trArray[i].countPerimeter());
            System.out.println();
        }
    }
}
