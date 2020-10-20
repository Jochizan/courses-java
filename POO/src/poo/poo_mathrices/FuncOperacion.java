package poo_mathrices;

import java.util.Scanner;

public class FuncOperacion extends Operaciones {
    private static Scanner ent = new Scanner(System.in);

    public void EjecucionOp2() {
        int band = 0;
        int opcion = 0;
        do {
            System.out.println("Diganos que operaciones quiere realizar" + "\nOpciones: " + "\n1).\tCon una matriz"
                    + "\n2).\tCon dos matrices" + "\n3).\tSalir");
            opcion = ent.nextInt();
            if (opcion == 1) {
                int banda = 2;
                Matrices matriz1 = new Matrices("Matriz 1");
                matriz1.ingresarValores();
                System.out.println(matriz1.darDimen());
                matriz1.imprimirMatriz();
                do {
                    System.out.println("Que operación quiere realizar con la matriz" + "\n1).\tDeterminante"
                            + "\n2).\tTraza" + "\n3).\tTranspuesta" + "\n4).\txEscalar" + "\n5).\tSalir");
                    opcion = ent.nextInt();
                    switch (opcion) {
                        case 1:
                            Determinante(matriz1.arr, matriz1.arr.length - 1);
                            break;
                        case 2:
                            Traza(matriz1.arr);
                            break;
                        case 3:
                            Transpuesta(matriz1.arr);
                            break;
                        case 4:
                            System.out.print("Ingrese el escalar a multiplicar: ");
                            int escalar = ent.nextInt();
                            Escalar(matriz1.arr, escalar);
                        case 5:
                            banda = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esta contemplada...");
                            break;
                    }
                } while (banda == 2);
            } else if (opcion == 2) {
                Matrices matriz1 = new Matrices("Matriz 1");
                Matrices matriz2 = new Matrices("Matriz 2");
                System.out.println(matriz1.darDimen());
                System.out.println(matriz2.darDimen());
                int terminar = 0;
                do {
                    System.out.println("Diganos que operaciones quiere realizar entre estas matrices" + "\n1).\tSuma"
                            + "\n2).\tResta" + "\n3).\tMultiplicación" + "\n4).\tSalir");
                    opcion = ent.nextInt();
                    switch (opcion) {
                        case 1:
                            if (matriz1.x == matriz2.x & matriz1.y == matriz2.y) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                SumaMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                terminar = 1;
                            }
                            break;
                        case 2:
                            if (matriz1.x == matriz2.x & matriz1.y == matriz2.y) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                RestaMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                terminar = 1;
                            }
                            break;
                        case 3:
                            if (matriz1.x == matriz2.x & matriz1.y == matriz2.y) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                MultMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                terminar = 1;
                            }
                            break;
                        case 4:
                            terminar = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esat contemplada...");
                            break;
                    }
                } while (terminar == 0);
            } else if (opcion == 3) {
                System.out.println("Gracias ahora volvera al menu anterior...");
                band = 1;
            } else {
                System.out.println("Esa opción no esta contempla vuelva a intentarlo.");
            }
        } while (band == 0);
    }
}