package código;

public class Triângulo {
	private double A,B,C;
	
	public double getA() {
		return A;
	}

	public void setA(double a) {
		if(a < 0) A = 0;
		else A = a;
	}

	public double getB() {
		return B;
	}

	public void setB(double b) {
		if(b < 0) B = 0;
		else B = b;
	}

	public double getC() {
		return C;
	}

	public void setC(double c) {
		if(c < 0) C = 0;
		else C = c;
	}

	public double calculaPerímetro() {
		double perimetro = 0.0;
		perimetro = A + B + C;
		return perimetro;
	}
	
	public String tipo() {
		
		if(A==B && B==C) return "Equilátero";
		else if(A==B || A==C || B==C) return "Isósceles";
		else return "Escaleno";
	}

}
