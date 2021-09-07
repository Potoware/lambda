package com.potoware.lambda;

import com.potoware.lambda.aritmetica.Calculadora;
import com.potoware.lambda.aritmetica.IAritmetica;

public class EjemploInterfazFuncional {

    public static void main(String[] args) {
        IAritmetica suma = Double::sum;

        IAritmetica resta = (a,b) ->a-b;

        Calculadora cal = new Calculadora();
        System.out.println(cal.computar(10,6,suma));
        System.out.println(cal.computar(10,5,resta));

        System.out.println(cal.computarConBiFunction(10,5, Double::sum));
    }
}
