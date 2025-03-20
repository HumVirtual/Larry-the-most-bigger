/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package humbert.huom;

/**
 *< > [ ]
 * @author HumbertoHuom
 */
public class Condisionalmultinivel {

    public static void main(String[] args) {
        
        int n1=10,n2=20,n3=3;
        
        if ( n1 > n2 && n1 > n3) {
            System.out.println("El número mayo es: "+n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("El número mayo es: "+n2);
        }else 
            System.out.println("El número mayo es: "+n3);
     
    }
}
