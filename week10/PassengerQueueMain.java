package week10;
import java.util.Random;
import java.util.Scanner;

public class PassengerQueueMain {
    static void menu() {
        System.out.println("Choose menu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue ");
        System.out.println("4. Check last queue ");
        System.out.println("5. Check all queue ");
        System.out.println("====================");
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random r = new Random();

        System.out.print("Enter max size: ");
        int max = sc.nextInt();
        PassengerQueue Q = new PassengerQueue(max);
        
        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter city of origin: ");
                    String cityOrigin = sc.nextLine();
                    System.out.print("Enter city of destination: ");
                    String cityDestination = sc.nextLine();
                    System.out.print("Enter ticket amount: ");
                    int ticketAmount = sc.nextInt();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();

                    Passenger p = new Passenger(name, cityOrigin, cityDestination, ticketAmount, price);
                    Q.Enqueue(p);
                    break;
                case 2:
                    Passenger data = Q.Dequeue();
                    System.out.println("Data removed: " + data.name + " " + data.cityOrigin + " " + data.cityDestination
                            + " " + data.ticketAmount + " " + data.price);
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peekRear();
                    break;
                case 5:
                    Q.print();
                    break;
                case 6:
                    Q.clear();
                    break;
            }
        } while (choose != 6);
    }
}
