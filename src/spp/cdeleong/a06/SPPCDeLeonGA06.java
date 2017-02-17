/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cdeleong.a06;
import java.util.Scanner;
/**
 *
 * @author Carlos Miguel De Leon Garcia A01410399 IMA
 */
public class SPPCDeLeonGA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int numero;
        numero = solicitarNumero();
        calcularFactorial(numero);
    }
    
    public static int solicitarNumero(){
        int numero;
        System.out.println(" Bienvenido ");
        System.out.println(" Introduce un numero del cual desea calcular su factorial ");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        if (numero < 1 || numero > 10){
            System.out.println(" ERROR - ESTE NUMERO SE ENCUENTRA FUERA DE RANGO");
            solicitarNumero();
        } else {
            
        }
        return numero;
    }
    
    public static void calcularFactorial(int numero){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (numero));
        System.out.println("El factorial del numero que ingreso es: " + factorial);
    }
    

    }
    

