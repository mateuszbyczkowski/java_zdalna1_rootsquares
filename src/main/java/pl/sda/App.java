package pl.sda;


import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        System.out.println("Proszę podać kolejno trzy liczby calkowite, oddzielone przecinkiem np. 1,2,3");
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();

        double[] abc;

        try {
            abc = cleanAndConvertToDoubleArray(line);
        } catch (NumberFormatException ex) {
            System.out.println("Podales literki zamiast cyferek :)");
            return;
        }

        double aa = 0, bb = 0, cc = 0;

        try {
            aa = abc[0];
            bb = abc[1];
            cc = abc[2];

            RootsOfSquareEquation roots = RootsCalculator.calculateRootsOfSquareEquation(aa, bb, cc);

            System.out.println(roots.toString());
        } catch (NegativeDeltaException e) {
            System.out.println("Parametry a = " + aa + " b = " + bb + " c = " + cc + " spowodowały ujemną deltę :<");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wypadałoby podać trzy argumenty jak tak ładnie proszę :)");
        }

        System.out.println("PROGRAM SIE NIE KONCZY! MOZEMY TUTAJ PROGRAMOWAĆ DALEJ");
    }

    public static double[] cleanAndConvertToDoubleArray(String line) {
        String[] numbersToConvert = line
                .trim()
                .replaceAll(" ", "")
                .split(",");

        double[] abc = new double[numbersToConvert.length];

        for (int i = 0; i < numbersToConvert.length; i++) {
            double value = Double.parseDouble(numbersToConvert[i]);
            abc[i] = value;
        }
        return abc;
    }

}
