package pl.sda;

public class RootsCalculator {
    public static RootsOfSquareEquation calculateRootsOfSquareEquation(double a, double b, double c) throws NegativeDeltaException {
        //policzymy najpierw delte, a potem policzymy pierwiastki
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Delta ujemna smuci!");
            throw new NegativeDeltaException();
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new RootsOfSquareEquation(x1, x2);
    }
}
