import java.util.Scanner;

public class Parábola3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double VerFoco, PFoco, QProy, Área, RQ;

        System.out.print("Ingrese la distancia del vertice al foco: ");
        VerFoco = entrada.nextDouble();

        System.out.print("Ingrese la distancia del punto al foco: ");
        PFoco = entrada.nextDouble();

        QProy = PFoco;
        VerFoco = 2 * VerFoco;
        RQ = Math.sqrt(Math.pow(PFoco, 2) - Math.pow(QProy - VerFoco, 2));
        Área = (VerFoco + QProy) / 2 * RQ;

        System.out.println("El área es: " + Área);

    }
}