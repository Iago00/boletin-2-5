/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg5;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        float sueldo;
        System.out.println("Dime el sueldo que recibes: ");
        sueldo=sc.nextInt();
        
        float sueldoBruto;
        float sueldoLiquido;
        float desplazamiento;
        float dietas;
        float comision;
        
        System.out.println("Dime los quilometros diarios que haces: ");
        desplazamiento=sc.nextInt();
        
        System.out.println("Dime cuantos días trabajas: ");
        dietas=sc.nextInt();
        
        System.out.println("Dime el importe total de tus ventas: ");
        comision=sc.nextInt();
        
        sueldoBruto=sueldo+(dietas*30)+(desplazamiento*2)+((comision*5)/100);
        System.out.println("El sueldo bruto es de: "+sueldoBruto+"€");
        
        sueldoLiquido=sueldoBruto-(sueldoBruto*18/100)-36;
        System.out.println("El sueldo líquido es de: "+sueldoLiquido+"€");
    }
    
}
