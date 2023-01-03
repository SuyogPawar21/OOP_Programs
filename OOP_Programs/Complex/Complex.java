package OOP_Programs.Complex;

public class Complex {

    private double real;
    private double img;

    public Complex() {
        real = img = 0;
    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void display() {
        String signInMiddle = (this.img > -1) ? " + " : " - ";
        System.out.println(this.real + signInMiddle + Math.abs(this.img) + "i");
    }

    public Complex add(Complex other) {
        double real = this.real + other.real;
        double img = this.img + other.img;
        return new Complex(real, img);
    }

    public Complex subtract(Complex other) {
        double real = this.real - other.real;
        double img = this.img - other.img;
        return new Complex(real, img);
    }

    public Complex multiply(Complex other) {
        double real = (this.real * other.real) - (this.img * other.img);
        double img = (this.real * other.img) + (this.img * other.real);
        return new Complex(real, img);
    }

    public Complex division(Complex other) {
        double divisor = (other.real * other.real) + (other.img * other.img);
        double real = ((this.real * other.real) + (this.img * other.img)) / divisor;
        double img = ((this.img * other.real) - (this.real * other.img)) / divisor;
        return new Complex(real, img); 
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex c3;
        c3 = c1.add(c2);
        c3.display();
        c3 = c1.subtract(c2);
        c3.display();
        c3 = c1.multiply(c2);
        c3.display();
        c3 = c1.division(c2);
        c3.display();
    }
}
