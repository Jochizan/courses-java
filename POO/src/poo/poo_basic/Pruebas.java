package poo;

public class Pruebas {
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Joan");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Renato");
        Empleados trabajador4 = new Empleados("Anais");
        trabajador1.cambiaSeccion("RRHH");
        System.out.println(trabajador1.devuelveDato() + "\n" + trabajador2.devuelveDato());
        System.out.println(trabajador3.devuelveDato() + "\n" + trabajador4.devuelveDato());
    }
}

/**
 * clase de empleados
 */
class Empleados {

    public Empleados(String nom) { // constructor
        nombre = nom;
        sección = "Administración";
        ID = IDSiguiente;
        IDSiguiente++;
    }

    public void cambiaSeccion(String seccion) { // setter
        this.sección = seccion;
    }

    public String devuelveDato() { // getter
        return "El nombre es: " + nombre + " la sección es: " + sección + "y su ID es: " + ID;
    }

    private final String nombre;
    private String sección;
    private int ID;
    private static int IDSiguiente = 1;
}