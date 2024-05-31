package com.currencyconverterjr.main;

import com.currencyconverterjr.calculations.currencyCalculations;
import com.currencyconverterjr.models.Rate;
import com.currencyconverterjr.models.checkExchangeRate;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner userOpt = new Scanner(System.in);
        currencyCalculations result = new currencyCalculations();
        //checkExchangeRate search = new checkExchangeRate();

        int exit = 0;
        //double valueToC;
        //double convertedV;
        String menu = """
                *************************************************
                Sea bienvenido/a al Conversor de Moneda!
                
                1) Dólar a Peso Argentino
                2) Peso Argentino a Dólar
                
                3) Dólar a Real Brasileño
                4) Real Brasileño a Dólar
                
                5) Dólar a Peso Colombiano
                6) Peso Colombiano a Dólar
                
                7) Salir
                
                Elija una opción válida:
                *************************************************
                """;

        //System.out.println(menu);
        //exit = userOpt.nextInt();

        //System.out.println("Ingrese el valor que desea convertir: ");

        while (exit !=7){
            System.out.println(menu);
            exit = userOpt.nextInt();

            if (exit == 1){

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("USD", "ARS");
                //Funciones
                //convertedV = valueToC * rate.conversion_rate();
                //System.out.println("El valor de " + valueToC + "[USD] equivale a " + convertedV + "[ARS]\n" );

                result.calculateConversion("USD", "ARS");

            }
            else if (exit == 2) {

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("ARS", "USD");

                //convertedV = valueToC * rate.conversion_rate();
                //System.out.println("El valor de " + valueToC + "[ARS] equivale a " + convertedV + "[USD]\n" );

                result.calculateConversion("ARS", "USD");

            }
            else if (exit == 3) {

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("USD", "BRL");

                //convertedV = valueToC * rate.conversion_rate();
                //System.out.println("El valor de " + valueToC + "[USD] equivale a " + convertedV + "[BRL]\n" );

                result.calculateConversion("USD", "BRL");

            }
            else if (exit == 4) {

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("BRL", "USD");

                //convertedV = valueToC * rate.conversion_rate();
               // System.out.println("El valor de " + valueToC + "[BRL] equivale a " + convertedV + "[USD]\n" );

                result.calculateConversion("BRL", "USD");

            }
            else if (exit == 5) {

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("USD", "COP");

                //convertedV = valueToC * rate.conversion_rate();
                //System.out.println("El valor de " + valueToC + "[USD] equivale a " + convertedV + "[COP]\n" );

                result.calculateConversion("USD", "COP");

            }
            else if (exit == 6) {

                //System.out.println("Ingrese el valor que desea convertir: ");

                //valueToC = userOpt.nextDouble();

                //Rate rate = search.exchangeRate("COP", "USD");

                //convertedV = valueToC * rate.conversion_rate();
                //System.out.println("El valor de " + valueToC + "[COP] equivale a " + convertedV + "[USD]\n" );

                result.calculateConversion("COP", "USD");

            }
            else if (exit == 7) {

                System.out.println("Aplicación finalizada!\n");

            }
            else {

                System.out.println("Opción no válida!\n");

            }
        }
    }
}
