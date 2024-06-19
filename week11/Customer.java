
public class Customer {
    String name;
    String address;
    String accountNumber;

    public Customer(String name, String address, String accountNumber) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
    }

    public void print() {
        System.out.println("Customer [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + "]");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return accountNumber.equals(customer.accountNumber);
    }
}


