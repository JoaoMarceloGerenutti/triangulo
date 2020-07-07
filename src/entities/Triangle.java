package entities;

public class Triangle {

	public double ladoA;
	public double ladoB;
	public double ladoC;

	public double area() {
		
		double P = (ladoA + ladoB + ladoC) / 2.0;
		double resultado =  Math.sqrt(P * (P - ladoA) * (P - ladoB) * (P - ladoC));
		
		return resultado;
	}
	
}
