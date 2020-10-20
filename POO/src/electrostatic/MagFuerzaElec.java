package Electrostática;

public class MagFuerzaElec {

    public static double fuerazElectrica(double Q1, double Q2, double r) {
        double Fe = (Q1 * Q2 * Conversion.K) / (Math.pow(r, 2));
        return Fe;
    }

    public static double CalculoDelCampo(double Q, double r) {
        double CampoElectrico = Conversion.K * Q / Math.pow(r, 2);
        return CampoElectrico;
    }

    public static String hastaPronto(int Bandera) {
        Bandera = 0;
        return "Hasta la proxima";
    }
}