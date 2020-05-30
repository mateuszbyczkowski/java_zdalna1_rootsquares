package pl.sda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App1 {
    public static final Currency PLN = Currency.PLN;


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("1995-11-16",
                DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(localDate); // 2880

    }

    public boolean isOurCurrency(Currency currency) {
        if (currency.equals(PLN)) {
            //vat 23%
            return true;
        } else {
            //vat 15%
            return false;
        }
    }
}
