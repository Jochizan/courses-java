import java.util.Scanner;

public class Parábola1 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double Coef_de_x, rf, p, x1, x2, y1, y2;

        System.out.print("Ingrese el valor del coeficiente de x: ");
        Coef_de_x = entrada.nextDouble();
        
        System.out.print("Ingrese el radio focal: ");
        rf= entrada.nextDouble();

        p = Coef_de_x/4;
        x1 = rf-p;
        x2 = -rf-p;
        if (x1 > 0 && p > 0) {
            y1 = Math.sqrt(4*p*x1);
            y2 = -Math.sqrt(4*p*x1);
            System.out.print("Los valores de 'y' son: \n" + y1 + " y " + y2);
        } else if (x2 > 0 && p > 0) {
            y1 = Math.sqrt(4*p*x1);
            y2 = -Math.sqrt(4*p*x1);
            System.out.print("Los valores de 'y' son: \n" + y1 + " y " + y2);
        } else if (x1 < 0 && p < 0) {
            y1 = Math.sqrt(4*p*x1);
            y2 = -Math.sqrt(4*p*x1);
            System.out.print("Los valores de 'y' son: \n" + y1 + " y " + y2);
        } else if (x2 < 0 && p < 0) {
            y1 = Math.sqrt(4*p*x1);
            y2 = -Math.sqrt(4*p*x1);
            System.out.print("Los valores de 'y' son: \n" + y1 + " y " + y2);
        } else {
            System.out.print("Esto nunca sale xDe");
        }
    }
}
