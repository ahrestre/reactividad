package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Primera practica curso reactividad.");
    }

    /**
     * Haciendo uso de lo aprendido(Expresiones lambda, referencias a métodos y funciones puras) resuelva:
     * */

    /**
     * 1. Con la intención de encontrar el número mayor en una lista y a su vez el número menor, cree un método que le permita
     * estas dos funciones, siguiendo los principios de las funciones puras.
     */

    public void numeroMayorYMenor() {

        INumeroMayorYMenor iNumeroMayorYMenor = (numeros) -> {

            int[] menorYMayor = new int[2];
            Arrays.sort(numeros);
            menorYMayor[0] = numeros[0];
            menorYMayor[1] = numeros[numeros.length - 1];

            return menorYMayor;
        };

    }

    /**
     * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
     * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
     * y devuelva el nuevo precio total.
     * */

    public void descuento (){

        IDescuento iDescuento = (total, descuento) -> (total - (total * descuento / 100));

    }

    /**
     * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
     * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
     * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
     * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
     * Cree una sola función que pueda lograr estos dos propósitos
     * */

    public void iva (){

        IIva iIva = (total, iva) -> (total * iva / 100);

    }

}