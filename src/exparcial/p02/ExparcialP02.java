/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exparcial.p02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author franconoel
 */
public class ExparcialP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner reader = new Scanner(System.in);
        
        int numero01 = new Random().nextInt(26);
        int numero02 = new Random().nextInt(26);
        int numero03 = new Random().nextInt(26);
        int numero04 = new Random().nextInt(26);
        int numero05 = new Random().nextInt(26);
        
        ArrayList<Integer> numerosGenerados = new ArrayList<>();
        numerosGenerados.add(numero01);
        numerosGenerados.add(numero02);
        numerosGenerados.add(numero03);
        numerosGenerados.add(numero04);
        numerosGenerados.add(numero05);
        
        System.out.println("numero01 = " + numero01);
        System.out.println("numero02 = " + numero02);
        System.out.println("numero03 = " + numero03);
        System.out.println("numero04 = " + numero04);
        System.out.println("numero05 = " + numero05);
        
        System.out.println("¡NUMEROS GENERADOS SATISFACTORIAMENTE!");
        
        ArrayList<Integer> numerosJugada01 = new ArrayList<>();
        ArrayList<Integer> numerosJugada02 = new ArrayList<>();
        ArrayList<Integer> numerosJugada03 = new ArrayList<>();
        
        System.out.println("");
        System.out.println("JUGADA 01");
        System.out.println("---------");                
        System.out.print("N01: ");
        numerosJugada01.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N02: ");
        numerosJugada01.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N03: ");
        numerosJugada01.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N04: ");
        numerosJugada01.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N05: ");
        numerosJugada01.add(Integer.parseInt(reader.nextLine()));
        
        System.out.println("");
        System.out.println("JUGADA 02");
        System.out.println("---------");                
        System.out.print("N01: ");
        numerosJugada02.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N02: ");
        numerosJugada02.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N03: ");
        numerosJugada02.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N04: ");
        numerosJugada02.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N05: ");
        numerosJugada02.add(Integer.parseInt(reader.nextLine()));
        
        System.out.println("");
        System.out.println("JUGADA 03");
        System.out.println("---------");                
        System.out.print("N01: ");
        numerosJugada03.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N02: ");
        numerosJugada03.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N03: ");
        numerosJugada03.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N04: ");
        numerosJugada03.add(Integer.parseInt(reader.nextLine()));
        System.out.print("N05: ");
        numerosJugada03.add(Integer.parseInt(reader.nextLine()));
        
        int aciertosJ01 = 0;
        int aciertosJ02 = 0;
        int aciertosJ03 = 0;
        
        for (Integer numero : numerosJugada01) {
            if (numerosGenerados.contains(numero)) {
                aciertosJ01 += 1;
            }
        }
        
        for (Integer numero : numerosJugada02) {
            if (numerosGenerados.contains(numero)) {
                aciertosJ02 += 1;
            }
        }
        
        for (Integer numero : numerosJugada03) {
            if (numerosGenerados.contains(numero)) {
                aciertosJ03 += 1;
            }
        }
        
        System.out.println("aciertosJ01 = " + aciertosJ01);
        System.out.println("aciertosJ02 = " + aciertosJ02);
        System.out.println("aciertosJ03 = " + aciertosJ03);
        
    }
    
    
}
