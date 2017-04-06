package Wyjątek1;

public class Number {
    public static double divide(double a, double b) throws DivideZeroException {
        if (b == 0)
            throw new DivideZeroException();
        else
            return a / b;
    }
}