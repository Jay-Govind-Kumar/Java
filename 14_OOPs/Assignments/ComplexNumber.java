import java.util.*;

public class ComplexNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex(5, 6);
        Complex c2 = new Complex(7, 8);
        c1.printComplex();
        c2.printComplex();

        System.out.println("After addition:");
        Complex resAdd = c1.add(c2);
        resAdd.printComplex();

        System.out.println("After subtraction:");
        Complex resSub = c1.subtract(c2);
        resSub.printComplex();

        System.out.println("After multiplication:");
        Complex resMul = c1.multiply(c2);
        resMul.printComplex();

        System.out.println("After division:");
        Complex resDiv = c1.divide(c2);
        resDiv.printComplex();

        sc.close();
    }
}

class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplex() {
        if (this.imaginary != 0) {
            System.out.println(this.real + " + " + this.imaginary + "i");
        } else {
            System.out.println(this.real);
        }
    }

    public Complex add(Complex other) {
        int realPart = this.real + other.real;
        int imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        int realPart = this.real - other.real;
        int imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        int realPart = this.real * other.real - this.imaginary * other.imaginary;
        int imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        int denominator = other.real * other.real + other.imaginary * other.imaginary;
        int realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        int imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

}