package com.potoware.lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("Andres");
        System.out.println(resultado);

        Function<String, String> f2 = param -> param.toUpperCase();
        System.out.println("andres");

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toLowerCase());
        String r2 = f3.apply("Andres", "JOSE");
        System.out.println(r2);

        BiFunction<String,String, Integer>f4 = (a,b)-> a.compareTo(b);
        System.out.println(f4.apply("andres", "andres"));

        BiFunction<String,String, String>f5 = String::concat;
        System.out.println(f5.apply("andres", "andres"));

    }
}
