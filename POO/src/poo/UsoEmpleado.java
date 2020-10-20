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
        Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2000, 9, 25);
        jefeRRHH.setIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Joan", 30000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Ana", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefeRRHH; // Aquí estas viendo el polimorfismo en accción.
        misEmpleados[5] = new Jefatura("María", 95000, 1999, 5, 26); // Aquí estas viendo el polimorfismo en
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];
        jefaFinanzas.setIncentivo(55000);
        // Jefatura jefeCompras = (Jefatura) misEmpleados[1];
        for (Empleado e : misEmpleados) {
            e.SubeSueldo(5);
        }
        // for (int i = 0; i < misEmpleados.length; i++) {
        // System.out.println("Nombre :" + misEmpleados[i].DameNombre() + "\nSueldo : "
        // + misEmpleados[i].DameSueldo()
        // + "\nFecha de alta : " + misEmpleados[i].DameFechaContrato());
        // }
        Arrays.sort(misEmpleados);
        for (Empleado e : misEmpleados) {
            System.out.println("Nombre : " + e.DameNombre() + "\nSueldo : " + e.DameSueldo() + "\nFecha de alta : "
                    + e.DameFechaContrato());
        }
    }
}

/**
 * ClaseEmpleado
 */
class Empleado implements Comparable {

    public Empleado(String nom, double sue, int agno, int mes, int dia) { // Constructor
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        ++IDSiguiente;
        ID = IDSiguiente;
    }

    public Empleado(String nom) {
        this(nom, 30000, 2000, 01, 01);
    }

    public String DameNombre() { // getter
        return nombre + " ID: " + ID;
    }

    public double DameSueldo() { // getter
        return sueldo;
    }

    public Date DameFechaContrato() { // getter
        return altaContrato;
    }

    public void SubeSueldo(double porcentaje) { // setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }
        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }
        return 0;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    public static int IDSiguiente;
    private int ID;
}

/**
 * Jefatura
 *
 */
class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public void setIncentivo(double incen) {
        incentivo = incen;
    }

    public double DameSueldo() {
        double sueldoJefe = super.DameSueldo();
        return sueldoJefe + incentivo;
    }

    private double incentivo;
}