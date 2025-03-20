/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package humbert.huom;

/**
 *< > [ ]
 * @author HumbertoHuom
 */
public class oola {
          public static void main(String[] args) {
        int opcion = 3; // Valor fijo asignado
        int re= 10,su=10; 
        // Evaluamos la opción con switch
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma: "+(re+su));
                break;
            case 2:
                System.out.println("El resultado de la resta es: "+(re-su));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: ."+(re*su));
                break;
            case 4:
                System.out.println("El resultado de la division es: "+(re/su));
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }

}
