package week8;
import java.util.Scanner;
import java.util.Random;

public class BookMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        StackBook st = new StackBook(8);
        Random r = new Random();

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
                        int numbers = st.top;
                                r.nextInt(5000);
                        System.out.println("Added random book " + (numbers + 1));
                        numbers++;
                        System.out.println("Do you want to add another book?");
                        choose = sc.next().charAt(0);
                    } while (choose == 'y');
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
            }
        } while (stack != 5);
    }
}
