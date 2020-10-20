package Electrostática;

import java.util.*;

public class ProcesosElec {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String coeficiente;
        double carga, d;
        int bandera = 1;

        do {
            System.out.print("Ingrese la carga: ");
            carga = entrada.nextDouble();

            System.out.print("Ingrese el coeficiente de la carga esta en: ");
            coeficiente = entrada.next();

            if (coeficiente.equalsIgnoreCase("mC") | coeficiente.equalsIgnoreCase("uC")
                    | coeficiente.equalsIgnoreCase("nC")) {

                object1.IngresoDeC(carga, coeficiente);
                bandera = 0;

            } else {
                System.out.println("Ingrese uno de los valores antes contemplados.");
                bandera = 1;
            }
        } while (bandera != 0);
        carga = object1.cargaAnt;

        System.out.print("Ahora procederemos al càlculo del campo electrico de la carga");

        do {
            System.out.println("Introduzca la distancia: ");
            d = entrada.nextDouble();
            System.out.print("La distancia en que coeficiente esta: ");
            coeficiente = entrada.next();
            if (coeficiente.equalsIgnoreCase("mm") | coeficiente.equalsIgnoreCase("um")
                    | coeficiente.equalsIgnoreCase("nm")) {
                object1.IngresoDeC2(d, coeficiente);
                bandera = 1;
            } else {
                bandera = 0;
            }
            d = object1.distanciaAnt;
        } while (bandera != 1);
        System.out.println("El campo electrico a esa distancia es: " + object1.CalculoDelCampo(carga, d) + "C");
    }
}
