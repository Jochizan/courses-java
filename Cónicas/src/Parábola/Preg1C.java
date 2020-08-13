import java.util.*;

public class Preg1C {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double a, b, c, x, y;
        System.out.println("Ingrese el punto M");
        x = entrada.nextDouble();
        y = entrada.nextDouble();

        System.out.println("Ingrese la ecuacion de la parabola:");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        double sumax = 2 * x;
        double sumay = 2 * y;
        double resultb = 1;
        double pendiente = a / ((sumay + b) * -1);
        double resulta = -1 * pendiente;
        double resultc = -1 * ((pendiente * (-1 * x)) + y);

        System.out.println("La ecuacion de la cuerda es:\n" + resulta + "x + " + resultb + "y + " + resultc + " = 0");
    }
}
