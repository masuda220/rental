package rental;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatementTest {

    static String expectedResult =
            "山田様のレンタル明細\n" +
                "\tスターウォーズ／最後のジェダイ\t900円\n" +
                "\tシン・ゴジラ\t500円\n" +
                "\tドラエモン／のびたの宝島\t550円\n" +
                "合計金額 1950円\n" +
                "獲得ポイント 4p";

    @Test
    @DisplayName("ステートメント出力")
    void report() {
        Statement statement = new Statement(customer);
        assertEquals(expectedResult, statement.report());
    }

    // 計算と出力の準備

    Customer customer;

    Movie newRelease = new Movie("スターウォーズ／最後のジェダイ", Movie.MovieType.新作);
    Movie regular = new Movie("シン・ゴジラ", Movie.MovieType.一般);
    Movie children = new Movie("ドラエモン／のびたの宝島", Movie.MovieType.子供);

    @BeforeEach
    void fact() {
        customer = new Customer("山田");

        Rental newReleaseRental = new Rental(newRelease, 3);
        Rental regularRental = new Rental(regular, 4);
        Rental childrenRental = new Rental(children, 6);

        customer.addRental(newReleaseRental);
        customer.addRental(regularRental);
        customer.addRental(childrenRental);
    }
}