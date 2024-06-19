
import java.util.Scanner;
public class Maincustomer {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    SingleLinkedListCustomer list = new SingleLinkedListCustomer();
        
        
        Customer c1 = new Customer("Hammam", "JL.dinoyo", "009");
        Customer c2 = new Customer("Ahmed", "JL.bandulan", "007");
       

        System.out.println("Available data : ");
        list.addFirst(c1);
        list.addLast(c2);
        list.print();
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add first");
            System.out.println("2. Add last");
            System.out.println("3. Insert after");
            System.out.println("4. Insert before");
            System.out.println("5. Remove");
            System.out.println("6. Print list");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    list.addFirst(inputCustomer(scan));
                    break;
                case 2:
                    list.addLast(inputCustomer(scan));
                    break;
                case 3:
                    System.out.print("Enter the name of the customer to insert after: ");
                    String afterName = scan.nextLine();
                    Customer afterCustomer = findCustomerByName(list, afterName);
                    if (afterCustomer != null) {
                        list.insertAfter(afterCustomer, inputCustomer(scan));
                    } else {
                        System.out.println("Customer not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter the name of the customer to insert before: ");
                    String beforeName = scan.nextLine();
                    Customer beforeCustomer = findCustomerByName(list, beforeName);
                    if (beforeCustomer != null) {
                        list.insertBefore(beforeCustomer, inputCustomer(scan));
                    } else {
                        System.out.println("Customer not found");
                    }
                    break;
                case 5:
                    System.out.print("Enter the name of the customer to remove: ");
                    String removeName = scan.nextLine();
                    Customer removeCustomer = findCustomerByName(list, removeName);
                    if (removeCustomer != null) {
                        list.remove(removeCustomer);
                    } else {
                        System.out.println("Customer not found");
                    }
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Customer inputCustomer(Scanner scan) {
        System.out.print("Enter customer name: ");
        String name = scan.nextLine();
        System.out.print("Enter customer address: ");
        String address = scan.nextLine();
        System.out.print("Enter customer account number: ");
        String accountNumber = scan.nextLine();
        return new Customer(name, address, accountNumber);
    }

    private static Customer findCustomerByName(SingleLinkedListCustomer list, String name) {
        Nodecustomer temp = list.head;
        while (temp != null) {
            if (temp.data.name.equals(name)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }
}

