/**
 * Created by kate on 1/12/16.
 */

public class Calculator {

    public static void main(String[] args) {
    }

    public int add(int a, int b) {

        return a + b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    //TODO
    //add methods for multiply, division, subtraction, square root, x^2

    public double division(int a, int b) {
        if(b == 0) return (double) (a / b);
        else return (double) a / b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double squareRoot(double a) {

        return Math.sqrt(a);
    }

    public double squaredNumber(double a) {

        return Math.pow(a, 2);
    }
}







