package Pratication;

import java.util.Locale;
import java.util.Scanner;

public class Class07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double width = sc.nextDouble();
		double length = sc.nextDouble();
		double squareMetre = sc.nextDouble();

		double area = width * length;
		double price = area * squareMetre;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Price R$ = %.2f%n", price);

		sc.close();
	}

}
