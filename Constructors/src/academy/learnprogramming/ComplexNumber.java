package academy.learnprogramming;

import java.util.zip.CheckedOutputStream;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = this.real + real;
        temp.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNumber){
        ComplexNumber temp=new ComplexNumber(0,0);
        temp.real=this.real+complexNumber.real;
        temp.imaginary=this.imaginary+complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary){
        ComplexNumber temp=new ComplexNumber(0,0);
        temp.real=this.real-real;
        temp.imaginary=this.imaginary-imaginary;
    }

    public void subtract(ComplexNumber other){
        ComplexNumber temp=new ComplexNumber(0,0);
        temp.real=this.real-other.real;
        temp.imaginary=this.imaginary-other.imaginary;
    }
}
