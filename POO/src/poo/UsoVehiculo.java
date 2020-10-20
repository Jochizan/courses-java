package poo;

import java.util.*;

public class UsoVehiculo {

    public static void main(String[] args) {
        Coches micoche = new Coches();
        Furgoneta mifurgoneta = new Furgoneta(7, 580);
        Scanner entrada = new Scanner(System.in);
        String colorCoche;
        System.out.print("Ingrese el el color del coche: ");
        colorCoche = entrada.nextLine();
        micoche.estableceColor(colorCoche);
        mifurgoneta.estableceColor(colorCoche);
        mifurgoneta.ConfigAsientos("Si");
        mifurgoneta.ConfigClimatizador("Si");
        System.out.println(micoche.DatosGenerales() + "\n" + micoche.DimeColor());
        System.out.println(mifurgoneta.DatosGenerales() + "\n" + mifurgoneta.dimeDatosFurgoneta());
    }
}