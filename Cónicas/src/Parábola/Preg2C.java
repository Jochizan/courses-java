import java.util.*;

public class Preg2C {

	public static String DistanMin(double cox, double coy, double Pa1, double Pa2) {

		double a1 = Math.pow(Pa1, 2);
		double b1 = -2 * Pa1;
		double c1 = coy;

		double a2 = Math.pow(Pa2, 2);
		double b2 = -2 * Pa2;
		double c2 = c1;

		double a3 = c2;
		double b3 = b1 + b2 + cox;
		double c3 = a1 + a2;

		double coDx = a3 * 2;
		double coD = b3;

		double Po1 = -coD / coDx;
		double Po2 = -coD / coDx;
		double Np1 = Math.sqrt(cox * Po1);
		double Mp2 = -Math.sqrt(cox * Po1);

		return "P1 = (" + Po1 + ", " + Np1 + ")" + "\nP2 = (" + Po2 + ", " + Mp2 + ")";
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double p, coX, coY, pa1, pa2, Po1, Po2, Np1, Np2;

		System.out.println("Ingrese los coeficientes de la ecuacion de la parabola");
		coY = entrada.nextDouble();
		coX = entrada.nextDouble();
		System.out.println("Ingrese el punto A");
		pa1 = entrada.nextDouble();
		pa2 = entrada.nextDouble();

		System.out.println("Los puntos que tienen una distancia minima al punto P son:");
		System.out.println(DistanMin(coX, coY, pa1, pa2));
	}
}
