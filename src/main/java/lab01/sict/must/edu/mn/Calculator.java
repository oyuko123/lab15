package lab01.sict.must.edu.mn;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }
//change for release
    public double subtract(double a, double b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
