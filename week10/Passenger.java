package week10;

public class Passenger {
    
    String name, cityOrigin, cityDestination;
    int ticketAmount, price;

    Passenger(String name, String cityOrigin, String cityDestination, int ticketAmount, int price) {
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.ticketAmount = ticketAmount;
        this.price = price;
    }
}