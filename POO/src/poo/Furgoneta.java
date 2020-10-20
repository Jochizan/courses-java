package poo;

public class Furgoneta extends Coches {

    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super(); // Llamar al constructor de la clase padre;
        this.capacidadCarga = capacidadCarga;
        this.plazasExtra = plazasExtra;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadCarga + " Y las plazas son: " + plazasExtra;
    }
}