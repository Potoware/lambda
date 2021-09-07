package com.potoware.lambda;

import com.potoware.lambda.models.Usuario;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> System.out.println("Saludo");

    consumidor.accept(new String());

        BiConsumer<String, Integer> consumerBi = (nombre,edad)-> System.out.println("Hola, tengo "+ edad+" y me llamo "+nombre);

        consumerBi.accept("Pepe",23);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hola mundo lambda");

        List<String> nombres = Arrays.asList("Alejo", "Juan", "Daniel", "Nathaly","Carol");
        nombres.forEach(consumer2);

        Supplier<Usuario> crearUsuario = Usuario::new;
        Usuario usuario = new Usuario();
        BiConsumer<Usuario, String> asignarNombre = (a,b)->a.setNombre(b);

        asignarNombre.accept(usuario,"Alejandro");
        System.out.println(usuario.getNombre());

        Supplier<String> proveedor = ()-> "hola mundo proveedor";

        System.out.println(proveedor.get());
    }
}
