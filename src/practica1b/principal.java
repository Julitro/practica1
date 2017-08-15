/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1b;

import java.util.Scanner;

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
        Scanner d= new Scanner(System.in);
        v=lector.nextInt();
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
    public void nivelPrincipiante(){
}
    public void nivelIntermedio(){
}
    public void nivelExperto(){
}
    
    }