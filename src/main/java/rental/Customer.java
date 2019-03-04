package rental;

import java.util.ArrayList;
import java.util.List;

class Customer {
    String name;
    List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental rental) {
        rentals.add(rental);
    }

    String name() {
        return name;
    }

    List<Rental> rentals() {
        return rentals;
    }
}
