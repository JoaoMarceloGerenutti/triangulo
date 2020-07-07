package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle X, Y;
		X = new Triangle();
		Y = new Triangle();
		
		System.out.println("Entre com as medidas do triangulo X: ");
		X.ladoA = sc.nextDouble();
		X.ladoB = sc.nextDouble();
		X.ladoC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triangulo Y: ");
		Y.ladoA = sc.nextDouble();
		Y.ladoB = sc.nextDouble();
		Y.ladoC = sc.nextDouble();
		
		double areaX = X.area();
		double areaY = Y.area();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();
	}

}
