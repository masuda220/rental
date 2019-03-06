package rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String name() {
        return name;
    }

    public List<Rental> rentals() {
        return rentals;
    }
}
