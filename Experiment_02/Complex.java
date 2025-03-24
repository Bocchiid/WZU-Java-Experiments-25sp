import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        Complex A = new Complex(a, b);
        Complex B = new Complex(c, d);
        System.out.printf("Real:%.2f imaginary:%.2f Fabs:%.2f\n",
                           A.getA(), A.getB(), A.calAbs());
        System.out.printf("Real:%.2f imaginary:%.2f Fabs:%.2f\n",
                           B.getA(), B.getB(), B.calAbs());
        Complex C = A.add(B);
        System.out.println(C.toString());
        C = A.substract(B);
        System.out.println(C.toString());
        C  = A.multiply(B);
        System.out.println(C.toString());
        C = A.divide(B);
        System.out.println(C.toString());
    }
}

class Complex {
    double real;
    double imag;

    Complex() {
        this.real = 0;
        this.imag = 0;
    }

    Complex(double real) {
        this.real = real;
        this.imag = 0;
    }

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    double getA() {
        return this.real;
    }

    double getB() {
        return this.imag;
    }

    Complex add(Complex c) {
        return new Complex(this.getA() + c.getA(), this.getB() + c.getB());
    }

    Complex substract(Complex c) {
        return new Complex(this.getA() - c.getA(), this.getB() - c.getB());
    }

    Complex multiply(Complex c) {
        double a = this.getA() * c.getA() - this.getB() * c.getB();
        double b = this.getA() * c.getB() + this.getB() * c.getA();
        return new Complex(a, b);
    }

    Complex divide(Complex c) {
        double divisor = c.getA() * c.getA() + c.getB() * c.getB();
        double a = (this.getA() * c.getA() + this.getB() * c.getB()) / divisor;
        double b = (this.getB() * c.getA() - this.getA() * c.getB()) / divisor;
        return new Complex(a, b);
    }

    double calAbs() {
        return Math.sqrt(this.getA() * this.getA() + this.getB() * this.getB());
    }

    public String toString() {
        if (this.getA() >= 0 && this.getA() < 0.01) {
            if (this.getB() >= 0  && this.getB() < 0.01) {
                return String.format("0.00");
            } else {
                return String.format("%.2fi", this.getB());
            }
        } else {
            if (this.getB() >= 0  && this.getB() < 0.01) {
                return String.format("%.2f", this.getA());
            } else {
                if (this.getB() > 0) {
                    return String.format("%.2f+%.2fi", this.getA(), this.getB());
                } else {
                    return String.format("%.2f%.2fi", this.getA(), this.getB());
                }
            }
        }
    }
}
