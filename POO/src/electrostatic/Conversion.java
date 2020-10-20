package Electrostática;

public class Conversion {
    /*
     * Estas son las variables con las que estaré trabajando en todas las clases de
     * este miniproyecto para aprender Física de electrostática.
     */
    public static final double K = 8.99 * Math.pow(10, 9);
    public static String In1[] = { "mC", "uC", "nC" };
    public static String In2[] = { "mm", "um", "nm" };
    public static String IngImp1[] = { "Q1", "Q2", "R" };
    public static double IngImp2[] = new double[3];

    private static double converCargas(String Q1, String Q2, String R) {
        int a = 0;
        for (int i = 0; i < Q1.length(); i++) {
            if ((Q1.indexOf("c") != -1) || (Q1.indexOf("m") == -1) || (Q1.indexOf("u") == -1)) {
                a++;
            } else {
            }
        }
        a=0;
        for (int i = 0; i < Q2.length(); i++) {
            if ((Q2.indexOf("c") != -1) || (Q2.indexOf("m") == -1) || (Q2.indexOf("u") == -1)) {
                a++;
            } else {
            }
        }
        a=0;
        for (int i = 0; i < R.length(); i++) {
            if ((R.indexOf("c") != -1) || (R.indexOf("m") == -1) || (R.indexOf("u") == -1)) {
                a++;
            } else {
            }
        }
        return;
    }
}