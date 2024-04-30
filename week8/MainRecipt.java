package week8;
import java.util.Scanner;
import java.util.Random;

public class MainRecipt {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();

        ReceiptStack rstack = new ReceiptStack(8);

        char choose = 't';

        int stack = 0;

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            stack = sc.nextInt();

            switch (stack) {
                case 1:
                    do {
                        int numbers = rstack.top;

                        System.out.println("Do you want to add another receipt?");
                        choose = sc.next().charAt(0);
                    } while (choose == 'y');
                    break;
                case 2:
                    rstack.pop();
                    break;
                case 3:
                    rstack.peek();
                    break;
                case 4:
                    rstack.print();
                    break;
            }
        } while (stack != 5);
    }
}