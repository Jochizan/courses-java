package poo_mathrices;

import java.util.*;

public class Matrices {
    /*
     * Aquí pondremos las caracteristicas y cualidades de nuestra matriz y algunos
     * metodos setters y getters.
     */
    public int x;
    public int y;
    private final String nombre;
    public double arr[][];
    private final Scanner teclado = new Scanner(System.in);
    public String tipo;

    public Matrices(String nom) { // Constructor Setter
        nombre = nom;
        try {
            System.out.printf("Ingrese las filas de la " + nombre + ": ");
            this.x = teclado.nextInt();
            System.out.print("Ingrese las columnas de la " + nombre + ": ");
            this.y = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Error solo ingrese valores enteros.");
            System.exit(0);
        }
        tipo = reconocerTipo(x, y);
        arr = new double[x][y];
    }

    public void ingresarValores() { // Setter
        try {
            System.out.println("\n==========================================================="
                             + "\nEnter the values of the" + nombre + " below: "
                             + "\n===========================================================");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print("Ingrese el valor de la " + nombre + " de la posición[" + i + "][" + j + "]:");
                    arr[i][j] = teclado.nextDouble();
                }
            }
        } catch (Exception e) {
            System.out.println("Error solo ingrese números");
            System.exit(0);
        }
    }

    public void imprimirMatriz() { // Getter
        System.out.println("\nEsta es la " + nombre + ": ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t[ " + arr[i][j] + " ]");
            }
            System.out.print("\n");
        }
    }

    public String darDimen() { // Getter
        return "Su " + nombre + " es " + tipo + ": " + x + "x" + y;
    }

    private static String reconocerTipo(int x, int y) {
        if (x != y) {
            return "RECTANGULAR";
        } else {
            return "cuadrada";
        }
    }
}