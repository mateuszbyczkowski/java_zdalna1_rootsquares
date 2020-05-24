package pl.sda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //14 / 1, 2, 7
        //13 / 1, 13
        //12 / 1, 2, 3, 4, 6, 12
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią (typu int) najlepiej naturlaną");

        try {
            int boundaryNumber = scanner.nextInt();
            printPrimeNumbers(boundaryNumber);
        } catch (InputMismatchException ex) {
            System.out.println("Miales podac inta");
        } catch (ThisNumberIsACrimeException ex) {
            System.out.println("Liczba ujemna to przestepstwo");
        }
    }

    public static void printPrimeNumbers(int boundary) throws ThisNumberIsACrimeException {
        if (boundary < 0) {
            throw new ThisNumberIsACrimeException();
        }

        for (int i = 2; i < boundary; i++) {
            boolean isPrime = checkIsPrime(i);

            if (isPrime) {
                System.out.println(i + " jest liczbą pierwszą");
            }
        }
    }

    private static boolean checkIsPrime(int primeCandidate) {
        for (int j = 2; j < primeCandidate; j++) {
            if (primeCandidate % j == 0) {
                return false;
            }
        }
        return true;
    }

}
