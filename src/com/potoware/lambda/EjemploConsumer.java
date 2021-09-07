package com.potoware.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> System.out.println("Saludo");

    consumidor.accept(new String());

        BiConsumer<String, Integer> consumerBi = (nombre,edad)->{
            System.out.println("Hola, tengo "+ edad+" y me llamo "+nombre);
        };
        consumerBi.accept("Pepe",23);

    }
}
