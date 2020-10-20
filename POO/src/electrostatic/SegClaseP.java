package Electrostática;

import java.util.*;

public class SegClaseP {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        MagFuerzaElec obj = new MagFuerzaElec();
        Conversion obj2 = new Conversion();
        int va = 0, opcion, bandera = 1;
        do {
            System.out.println("-------------------------------------------------------------------------"
                    + "\nBienvenido a este programa para el cálculo de preguntas de electróstatica"
                    + "\n-------------------------------------------------------------------------"
                    + "\n\n------------------" + "\nCoeficientes:" + "\nC\tCoulomb" + "\nmC\tMiliCoulomb"
                    + "\nuC\tMicroCoulomb" + "\nnC\tNanoCoulomb" + "\nLa distancia 'r' en:" + "\nm\tMetros"
                    + "\ncm\tCentímetros" + "\nmm\tMilímetros" + "\num\tMicrómetros" + "\nnm\tNanómetros"
                    + "\n------------------" + "\nOpciones:" + "\n1).\tFuerza Electrostática" + "\n2).\tCampo Eléctrico"
                    + "\n3).\tSalir");
            opcion = in.nextInt();
            if (opcion == 1) {
                for (String e : obj2.IngImp1) {
                    System.out.print("Ingrese el valor de " + e + ": ");
                    obj2.IngImp1[va] = in.next();
                    va++;
                }
                for (String e : obj2.IngImp1) {
                    System.out.println(e);
                }
                double Fe = obj.fuerazElectrica(obj2.IngImp2[0], obj2.IngImp2[1], obj2.IngImp2[2]);
                System.out.println("La fuerza electrica es: " + Fe);
            }else if(opcion==2){

            }else if(opcion==3){

            }else{
                System.out.println("Opción no contemplada, porfavor vuelva a intentarlo.");
            }
        } while (bandera != 1);
    }
}