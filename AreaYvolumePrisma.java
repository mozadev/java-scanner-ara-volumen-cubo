/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areayvolumeprisma;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class AreaYvolumePrisma {

   public static void main(String[] args) {
        
        //entrada
     
        Scanner leer = new Scanner(System.in);
        double a, acara, acubo, vcubo;
       System.out.println(" ingrese longitud de la arista : ");
        a=leer.nextDouble();
        
        //proceso 
        acara= a*a;
        acubo=6*a*a;
        vcubo= a*a*a;
        //salida
        System.out.println("el área de cubo es : " +acubo+" cms2");
          System.out.println("el volumen del cubo  es : " +vcubo+" cms3");
    }
    
}
