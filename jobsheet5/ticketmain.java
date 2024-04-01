package jobsheet5;
import java.util.Scanner;

public class ticketmain {

public static void main(String[] args) {
    ticketserve ticketService = new ticketserve();
    ticketService.add(new ticket("garuda", "Jakarta", "bali", 1500000));
    ticketService.add(new ticket("Lion Air", "Jakarta", "Surabaya", 800000));
    ticketService.add(new ticket("Citilink", "Jakarta", "Yogyakarta", 1200000));

    System.out.println("Tickets before sorting");
    ticketService.displayAll();

    ticketService.bubbleSort(true);
    System.out.println(" \n tickets after sorting by price (ascending)");
    ticketService.displayAll();

    ticketService.selectionSort(false);
    System.out.println("\n Tickets after sorting by price (descending)");
    ticketService.displayAll();
   
}
}
