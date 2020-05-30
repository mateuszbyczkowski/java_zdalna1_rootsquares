package pl.sda;

public enum Currency {
    PLN,
    USD,
    GBP,
    NKA,
    EUR,
    AUD,
    YEN,
    RUB,
    CHK,
    CHF;

    Currency() {

    }

    public Currency fromString(String cur) {
        if(cur.equals("PLN")) {
            return PLN;
        }
        return EUR;
    }

}
