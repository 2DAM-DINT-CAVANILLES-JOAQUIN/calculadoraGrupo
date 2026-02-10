/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoregrupo;


/**
 *
 * @author USUARIO
 */
public class CalculadoreGrupo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int rsMultiplicacion = Multiplicacion.multiplicar(4, 9);
        int rsSuma = Suma.suma(2, 5);
        int rsResta = Resta.restar(8, 2);
        
        
        System.out.println("Multiplicacion: " + rsMultiplicacion); //4*9
        System.out.println("Suma: " + rsSuma); //2+5
        System.out.println("resta: " + rsResta); //8-2
    }
}
