package org.example;

/**
 * 3. Necesitamos calcular el iva de una venta, para esto es necesario que usted cree un método
 * Tendremos dos escenarios posibles, en el primero se le pasará únicamente el valor al cual se le debe
 * aplicar el iva, sin especificar el porcentaje, en este caso se debe aplicar un 21% siempre.
 * En el segundo escenario se le pasará tanto el precio de la venta como el porcentaje de iva.
 * Cree una sola función que pueda lograr estos dos propósitos
 * */

public interface IIva {

    static double getIva (double total) {
        return total * 0.21;
    };

    double getIva (double total, double iva);

}
