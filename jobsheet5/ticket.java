package jobsheet5;

public class ticket {
    String airlines, destination, origin;
    int price;

    public ticket(String a, String dest, String origin, int price) {
        airlines = a;
        destination = dest;
        this.origin = origin;
        this.price = price;
    }
}