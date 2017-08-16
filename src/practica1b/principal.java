/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1b;

import java.util.Scanner;
import java.util.Random;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class principal {

    String a;

    public principal() {
        menuPrincipal();

    }

    public void menuPrincipal() {
        System.out.println(" Ipc1 A practica 1");
        System.out.println("Julio Edwin Carrera Diaz");
        System.out.println("201602502");
        System.out.println("Buscaminas");

        Scanner lector = new Scanner(System.in);
        a = lector.nextLine();
        switch (a) {
            case "":
                System.out.println("Buscaminas");
                System.out.println("1.principiante");
                System.out.println("2.intermedio");
                System.out.println("3.experto");
                System.out.println("4.salir");
                break;
            default:
                System.out.println(" Caracter invalido presinone enter para avanzar");
                menuPrincipal();
                break;
        }
        int v;
        Scanner d = new Scanner(System.in);
        v = lector.nextInt();
        switch (v) {
            case 1:
                nivelPrincipiante();
            case 2:
                nivelIntermedio();
            case 3:
                nivelExperto();
            case 4:

                System.exit(0);
                  default:
                System.out.println(" Caracter invalido");
                r();
                break;
        }
    }

    public void nivelPrincipiante() {
        int matriz[][] = new int[4][4];

        int n1[] = new int[12];
        int n2[] = new int[12];
        Scanner lector = new Scanner(System.in);
        Random x = new Random();
        int c = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = x.nextInt(2);

            }
        }
        for (int i = 0; i < 12; i++) {

            System.out.println("fila");
            n1[i] = lector.nextInt();
            System.out.println("columna");
            n2[i] = lector.nextInt();

            if (n1[i] == 0 && n2[i] == 0 && matriz[0][0] == 1) {
                System.out.println("aprovado");
                System.out.println("1###");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 0 && n2[i] == 1 && matriz[0][1] == 1) {

                System.out.println("aprovado");
                System.out.println("#1##");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
            } else if (n1[i] == 0 && n2[i] == 2 && matriz[0][2] == 1) {
                System.out.println("aprovado");
                System.out.println("##1#");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                i++;

            } else if (n1[i] == 0 && n2[i] == 3 && matriz[0][3] == 1) {
                System.out.println("aprovado");
                System.out.println("###1");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 1 && n2[i] == 0 && matriz[1][0] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("1###");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 1 && n2[i] == 1 && matriz[1][1] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("#1##");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 1 && n2[i] == 2 && matriz[1][2] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("##1#");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 1 && n2[i] == 3 && matriz[1][3] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("###1");
                System.out.println("####");
                System.out.println("####");
                i++;
            } else if (n1[i] == 2 && n2[i] == 0 && matriz[2][0] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("1###");
                System.out.println("####");
                i++;
            } else if (n1[i] == 2 && n2[i] == 1 && matriz[2][1] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("#1##");
                System.out.println("####");
                i++;
            } else if (n1[i] == 2 && n2[i] == 2 && matriz[2][2] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("##1#");
                System.out.println("####");
                i++;
            } else if (n1[i] == 2 && n2[i] == 3 && matriz[2][3] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("###1");
                System.out.println("####");
                i++;
            } else if (n1[i] == 3 && n2[i] == 0 && matriz[3][0] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                System.out.println("1###");
                i++;
            } else if (n1[i] == 3 && n2[i] == 1 && matriz[3][1] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                System.out.println("#1##");
                i++;
            } else if (n1[i] == 3 && n2[i] == 2 && matriz[3][2] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                System.out.println("##1#");
                i++;
            } else if (n1[i] == 3 && n2[i] == 3 && matriz[3][3] == 1) {
                System.out.println("aprovado");
                System.out.println("####");
                System.out.println("####");
                System.out.println("####");
                System.out.println("###1");
                i++;
            } else {
                contador++;
                    System.out.println("fallaste");
            r();
            }
           
        }
        System.out.println("intentos" + contador++);
        System.out.println("fila 0" + Arrays.toString(matriz[0]));
        System.out.println("fila 1" + Arrays.toString(matriz[1]));
        System.out.println("fila 2" + Arrays.toString(matriz[2]));
        System.out.println("fila 3" + Arrays.toString(matriz[3]));
    }

    public void nivelIntermedio() {
    }

    public void nivelExperto() {
    }

    public void r() {

        System.out.println("Buscaminas");
        System.out.println("1.principiante");
        System.out.println("2.intermedio");
        System.out.println("3.experto");
        System.out.println("4.salir");

        int v;
        Scanner d = new Scanner(System.in);
        v = d.nextInt();
        switch (v) {
            case 1:
                nivelPrincipiante();
            case 2:
                nivelIntermedio();
            case 3:
                nivelExperto();
            case 4:

                System.exit(0);
        }

    }
}
