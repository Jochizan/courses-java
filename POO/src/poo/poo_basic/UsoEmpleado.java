package poo;

import java.util.*;

public class UsoEmpleado {

    public static void main(String[] args) {

        // Empleado empleado1 = new Empleado("Joan Roca", 1200, 2020, 8, 1);
        // Empleado empleado2 = new Empleado("Ana Martinez", 2400, 2020, 8, 1);
        // Empleado empleado3 = new Empleado("Maria Martin", 3300, 2020, 8, 1);

        // empleado1.SubeSueldo(5);
        // empleado2.SubeSueldo(5);
        // empleado3.SubeSueldo(5);

        // System.out.println("Nombre :" + empleado1.DameNombre() + "\nSueldo : " +
        // empleado1.DameSueldo()
        // + "\nFecha de alta : " + empleado1.DameFechaContrato());
        // System.out.println("Nombre :" + empleado2.DameNombre() + "\nSueldo : " +
        // empleado2.DameSueldo()
        // + "\nFecha de alta : " + empleado2.DameFechaContrato());
        // System.out.println("Nombre :" + empleado3.DameNombre() + "\nSueldo : " +
        // empleado3.DameSueldo()
        // + "\nFecha de alta : " + empleado3.DameFechaContrato());

        Empleado[] misEmpleados = new Empleado[3];

        misEmpleados[0] = new Empleado("Joan Roca", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 105000, 1990, 12, 17);
        misEmpleados[2] = new Empleado("Paco Gómez", 125000, 1990, 12, 17);

        // for (int i = 0; i < misEmpleados.length; i++) {

        // misEmpleados[i].SubeSueldo(5);
        // }

        for (Empleado e : misEmpleados) {

            e.SubeSueldo(5);
        }

        // for (int i = 0; i < misEmpleados.length; i++) {

        // System.out.println("Nombre :" + misEmpleados[i].DameNombre() + "\nSueldo : "
        // + misEmpleados[i].DameSueldo()
        // + "\nFecha de alta : " + misEmpleados[i].DameFechaContrato());
        // }

        for (Empleado e : misEmpleados) {

            System.out.println("Nombre : " + e.DameNombre() + "\nSueldo : " + e.DameSueldo() + "\nFecha de alta : "
                    + e.DameFechaContrato());
        }
    }
}

/**
 * ClaseEmpleado
 */
class Empleado {

    public Empleado(String nom, double sue, int agno, int mes, int dia) { // Constructor

        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        altaContrato = calendario.getTime();

    }

    public String DameNombre() { // getter

        return nombre;

    }

    public double DameSueldo() { // getter

        return sueldo;

    }

    public Date DameFechaContrato() { // getter

        return altaContrato;

    }

    public void SubeSueldo(double porcentaje) { // setter

        double aumento = sueldo * porcentaje / 10;
        sueldo += aumento;

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
} 