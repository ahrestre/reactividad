package org.example;

/**
 * 2. En una tienda de ropa necesitamos aplicar un descuento a las ventas que se hacen, este descuento
 * es variable por lo que necesitamos que usted cree un método que reciba el total de la venta y el porcentaje a descontar
 * y devuelva el nuevo precio total.
 * */

public interface IDescuento {

    double getNuevoTotal (double total, double descuento);

}
