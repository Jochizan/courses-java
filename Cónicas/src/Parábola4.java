import java.util.Scanner;

public class Parábola4 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double anguloM, x1, x2, x, p1, p2, DP1P2, m, LR, SumaPs, SumInicial;

        System.out.print("Ingrese el ángulo que foma la recta P2P1: ");
        anguloM = entrada.nextDouble();

        anguloM = Math.toRadians(anguloM);

        System.out.println("Ingrese los coeficientes de las ecuaciones1: ");
        x1 = entrada.nextDouble();
        p1 = entrada.nextDouble();

        System.out.println("Ingrese los coeficientes de las ecuaciones: ");
        x2 = entrada.nextDouble();
        p2 = entrada.nextDouble();

        m = Math.tan(anguloM);
        x = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
        LR =  m*(2*p1 + 2*p2);
        p1 = -p1;
        SumaPs = -2*p1 + LR;
        SumInicial = SumaPs + 2*p2;
        DP1P2 = SumInicial/LR;
        
        System.out.println("La suma de x1 + x2 es: " + SumaPs + "\nla re lación entre 'l' entre LR nos da: " + DP1P2);
    }
}