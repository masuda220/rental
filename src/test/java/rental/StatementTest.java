package rental;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatementTest {

    static String expectedResult =
            "山田様のレンタル明細\n" +
                "\t新作\t900円\n" +
                "\t子供\t150円\n" +
                "\t一般\t200円\n" +
                "合計金額 1250円\n" +
                "獲得ポイント 4p";

    @Test
    @DisplayName("ステートメント出力")
    void report() {
        Statement statement = new Statement(customer);
        assertEquals(expectedResult, statement.report());
    }

    // 計算と出力の準備

    Customer customer;

    Movie newReleaseMovie = new Movie("新作", Movie.MovieType.NEW_RELEASE);
    Movie childrenMovie = new Movie("子供", Movie.MovieType.CHILDREN);
    Movie regularMovie = new Movie("一般", Movie.MovieType.REGULAR);

    @BeforeEach
    void prepareFactDate() {
        Rental newReleaseRental = new Rental(newReleaseMovie, 3);
        Rental childrenRental = new Rental(childrenMovie, 2);
        Rental regularRental = new Rental(regularMovie, 1);

        customer = new Customer("山田");
        customer.addRental(newReleaseRental);
        customer.addRental(childrenRental);
        customer.addRental(regularRental);
    }
}