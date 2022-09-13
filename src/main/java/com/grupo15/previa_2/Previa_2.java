/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupo15.previa_2;

import com.grupo15.Exceptions.HandledException;
import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * @author tecnologia7
 */
public class Previa_2 {
    private static final String OUT_OF_RANGE_EXCEPTION = "EXCEPCIÓN FUERA DE RANGO";
    private static final double porcentajeAumento=10.0;
    private static final double porcentajeRebaja=10.0;
    private static int valorP;
    
    public static void main(String[] args) throws HandledException {
        int valor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el valor de la libra a las 11:00AM (p)");
        try {
            valor=leer.nextInt();
            double valoralas9 = regresarAumento(valor);
            double valorala1 = rebajar(valor);
            System.out.println(MessageFormat.format("Cuando a las 11:00 la carne vale {0} a las 9:00AM valía {1}",valor,valoralas9));
            System.out.println(MessageFormat.format("Cuando a las 11:00 la carne vale {0} a la 1:00PM valdrá {1}",valor, valorala1));
        
        } catch (HandledException e) {
            System.out.println("Code: "+e.getCode()+" Exception Message : "+e.getMessage());
        }
    }
    
    private static double regresarAumento(int valor) throws HandledException{
        if(valor < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("El año {0} no puede ser negativo",valor));
        }
        return valor/((100 + porcentajeAumento)/100);
    }
    private static double aumentar(int valor) throws HandledException{
        if(valor < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("El valor {0} no puede ser negativo",valor));
        }
        return valor * porcentajeAumento;
    }
    private static double rebajar(int valor) throws HandledException{
        if(valor < 0 ) {
            throw new HandledException(OUT_OF_RANGE_EXCEPTION,MessageFormat.format("El valor {0} no puede ser negativo",valor));
        }
        return valor * (100 - porcentajeRebaja)/100;
    }
    
}

