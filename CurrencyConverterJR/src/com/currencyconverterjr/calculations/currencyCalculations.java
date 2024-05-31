package com.currencyconverterjr.calculations;

import com.currencyconverterjr.models.Rate;
import com.currencyconverterjr.models.checkExchangeRate;

import java.util.Scanner;

public class currencyCalculations {

    Scanner userOpt = new Scanner(System.in);
    checkExchangeRate search = new checkExchangeRate();

    double valueToC;
    double convertedV;

    public void calculateConversion(String currencyFrom, String currencyTo){

        System.out.println("Ingrese el valor que desea convertir: ");

        valueToC = userOpt.nextDouble();

        Rate rate = search.exchangeRate(currencyFrom, currencyTo);
        convertedV = valueToC * rate.conversion_rate();

        System.out.println("El valor de " + valueToC + " [" + currencyFrom + "] " +
                "equivale a " + convertedV + " [" + currencyTo + "]\n" );

    }
}
