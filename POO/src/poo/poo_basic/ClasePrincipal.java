package poo;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {

        Coches micoche = new Coches();
        Scanner entrada = new Scanner(System.in);
        String colorCoche;

        System.out.print("Ingrese el el color del coche: ");
        colorCoche = entrada.nextLine();
        micoche.establece_color(colorCoche);
        System.out.print(micoche.DimeColor());
        System.out.println(micoche.DatosGenerales());
        micoche.ConfigAsientos("si");
        System.out.println(micoche.DimeAsientos());
        micoche.ConfigClimatizador("si");
        System.out.println(micoche.DameClimatizador());
        System.out.println(micoche.DamePesoCoche());
        System.out.println("El precio final del coche es: " + micoche.PrecioCoche());
    }
}