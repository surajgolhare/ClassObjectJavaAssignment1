import java.util.*;

public class Complex{
	double real;
	double imag;

	public Complex(double real, double imag){
		this.real = real;
		this.imag = imag;
	}
	public static Complex sum(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real + n2.real;
		temp.imag = n2.imag + n2.imag;
		return (temp);
	}

	public static Complex diff(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real - n2.real;
		temp.imag = n1.imag - n2.imag;
		return (temp);
	}
	public static Complex prod(Complex n1, Complex n2){
		Complex temp = new Complex(0.0, 0.0);
		temp.real = n1.real * n2.real;
		temp.imag = n1.imag * n2.imag;
		return (temp);
	}

	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the real number one: ");
		float real = s.nextFloat();
		System.out.print("Enter the imag number one: ");
		float imag = s.nextFloat();
		Complex c1 = new Complex(real, imag);

		System.out.print("Enter the real number two: ");
                real = s.nextFloat();
                System.out.print("Enter the imag number two: ");
                imag = s.nextFloat();
                Complex c2 = new Complex(real, imag);

		Complex temp = sum(c1, c2);
		System.out.println("Sum of real number :" +temp.real+"Imag: " +temp.imag);
		temp = diff(c1, c2);
		System.out.println("Diff of two complex number real : "+temp.real+" imag: "+temp.imag);
		temp = prod(c1, c2);
		System.out.println("Prod of two complex number real: "+temp.real+" imag: "+temp.imag);
	}
}
