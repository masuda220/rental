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
                case 一般:
                    thisAmount += 200;
                    if (each.daysRented() > 2) thisAmount += (each.daysRented() - 2) * 150;
                    break;
                case 新作:
                    thisAmount += each.daysRented() * 300;
                    break;
                case 子供:
                    thisAmount += 100;
                    if (each.daysRented() > 3) thisAmount += (each.daysRented() - 3) * 150;
                    break;
            }

            points++;
            if (each.movie().type() == Movie.MovieType.新作 && each.daysRented() > 1)
                points++;

            result += "\t" + each.movie().title() + "\t" + thisAmount + "円\n";

            totalAmount += thisAmount;
        }

        result += "合計金額 " + totalAmount + "円\n";
        result += "獲得ポイント " + points + "p";
        return result;
    }
}
