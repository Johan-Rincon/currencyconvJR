package com.currencyconverterjr.models;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class checkExchangeRate {

    public Rate exchangeRate(String valueFrom, String valueTo){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a4ab227c8164e1efeb561a49/pair/"
                + valueFrom + "/" + valueTo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Rate.class);
        }
        catch (Exception e){
            throw new RuntimeException("No se encontró esa tasa de cambio.");
        }

    }

}
