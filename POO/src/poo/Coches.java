package poo;

public class Coches {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int pesoPlataforma;
    private String color;
    private int pesoTotal;
    private boolean asientos_cuero, climatizador;

    public Coches() {
        ruedas = 4;
        largo = 2000;
        ancho = 2000;
        motor = 1600;
        pesoPlataforma = 500;
    }

    public String DimeLargo() { // Método Getter
        return "El largo del coche es: " + largo;
    }

    public void estableceColor(String color) {// Método setter
        this.color = color;
    }

    public String DimeColor() {
        return "El color del coche es: " + color;
    }

    public String DatosGenerales() {
        return "\nLa plataforma del vehículo tiene " + ruedas + " ruedas. " + "\nMide " + largo / 1000
                + " metros con un ancho de " + ancho + " cm \nUn peso de platforma de " + pesoPlataforma + " Kg.";
    }

    public void ConfigAsientos(String asientos_cuero) {
        if (asientos_cuero == "si") {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String DimeAsientos() {
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public void ConfigClimatizador(String climatizador) { // Setter
        if (climatizador == "si") {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String DameClimatizador() { // Getter
        if (climatizador == true) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche lleva aire acodicionado";
        }
    }

    public String DamePesoCoche() { // Getter + Setter
        int pesoCarroseria = 500;
        pesoTotal = pesoPlataforma + pesoCarroseria;
        if (asientos_cuero == true) {
            pesoTotal = pesoTotal + 50;
        }
        if (climatizador == true) {
            pesoTotal = pesoTotal + 20;
        }
        return "El peso del coche es: " + pesoTotal;
    }

    public int PrecioCoche() { // Getter
        int PrecioFinal = 10000;
        if (asientos_cuero == true) {
            PrecioFinal += 200;
        }
        if (climatizador == true) {
            PrecioFinal += 1500;
        }
        return PrecioFinal;
    }
}