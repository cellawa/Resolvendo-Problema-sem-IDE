package problemasSemOrienta��oObejeto;

import java.util.Locale;
import java.util.Scanner;

public class SemOrient��oobjeto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double xA, xB, xC, yA, yB, yC;
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the mensures of triangle y: ");
		
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
double p = (xA + xB + xC ) / 2.0;
double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p-xC));

 p = (yA + yB + yC ) / 2.0;
double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p-yC));
System.out.printf("Triangle X area: %4f%n", areaX);
System.out.printf("Triangle y area: %4f%n", areaY);

if (areaX > areaY) {
	System.out.println("Langer area: X");
}

else {
	System.out.println("Langer area: Y");

}

				sc.close();
	}

}
