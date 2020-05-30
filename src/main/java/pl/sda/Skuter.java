package pl.sda;

public class Skuter {

    public Skuter(String line) {
        String[] split = line.split(",");
        this.name = split[0];
        this.kolor = split[1];
        this.numerRejestracyjny = split[2];
        this.status = split[3];
    }

    String name;
    String kolor;
    String numerRejestracyjny;
    String status;
}
