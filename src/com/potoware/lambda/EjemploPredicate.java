package com.potoware.lambda;

import com.potoware.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num>10;
        boolean resultado = test.test(11);
        System.out.println(resultado);

        Predicate<String> p2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(p2.test("ROLE_ADMIN"));

        BiPredicate<String,String> t3 = String::equals;

        System.out.println(t3.test("Andres" ,"Andres"));

        System.out.println("====");

        BiPredicate<Integer,Integer>t4 = (i,j) -> j>i;
        System.out.println(t4.test(6,4));
        System.out.println("====");
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("maria");
        b.setNombre("maria");
        BiPredicate<Usuario, Usuario> t5 = (i,j)->i.getNombre().equals(j.getNombre());
        System.out.println(t5.test(a,b));
    }
}
