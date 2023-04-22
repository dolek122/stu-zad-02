public class complexNumber {

    private double real;
    private double imaginary;

    public complexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public complexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        return this.real + " + i" + this.imaginary;
    }

    public complexNumber add(complexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new complexNumber(newReal, newImaginary);
    }

    public complexNumber subtract(complexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new complexNumber(newReal, newImaginary);
    }

    public complexNumber multiply(complexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new complexNumber(newReal, newImaginary);
    }

}
