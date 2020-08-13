import java.util.Scanner;

public class Parábola2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double coef_x, p, m, a, b, c, a1, b1, c1, x1, x2, y1, y2, D;

        System.out.print("Ingrese el coefciente de x: ");
        coef_x = entrada.nextDouble();
        
        System.out.println("Ingrese los coefciente de la recta: ");
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        p = coef_x/4;
        m = -a/b;

        a1 = c-(c-1);
        b1 = -coef_x*m;
        c1 = -coef_x*p;

        x1 = (-b1+Math.sqrt(Math.pow(b1, 2)-4*a1*c1))/2*a1;
        x2 = (-b1-Math.sqrt(Math.pow(b1, 2)-4*a1*c1))/2*a1;
        y1 = m*x1;
        y2 = m*x2;

        System.out.println("Los valores de 'x' son: \n" + x1 +  ", " +x2 + "\n y de 'y' son: \n" + y1 + ", " + y2);

        D = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));

        System.out.println("La distancia es: " + D);
    }
}