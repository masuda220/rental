package rental;

class Statement {
    Customer customer;

    Statement(Customer customer) {
        this.customer = customer;
    }

    String report() {
        int totalAmount = 0;
        int points = 0;

        String result = customer.name() + "様のレンタル明細\n";

        for (Rental each : customer.rentals()) {
            int thisAmount = 0;
            switch (each.movie().type()) {
                case REGULAR:
                    thisAmount += 200;
                    if (each.daysRented() > 2) thisAmount += (each.daysRented() - 2) * 150;
                    break;
                case NEW_RELEASE:
                    thisAmount += each.daysRented() * 300;
                    break;
                case CHILDREN:
                    thisAmount += 100;
                    if (each.daysRented() > 3) thisAmount += (each.daysRented() - 3) * 150;
                    break;
            }

            points++;
            if (each.movie().type() == Movie.MovieType.NEW_RELEASE && each.daysRented() > 1)
                points++;

            result += "\t" + each.movie().title() + "\t" + thisAmount + "円\n";

            totalAmount += thisAmount;
        }

        result += "合計金額 " + totalAmount + "円\n";
        result += "獲得ポイント " + points + "p";
        return result;
    }
}
