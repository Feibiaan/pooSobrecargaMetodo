package org.fabianr.poosobrecarga;
import static org.fabianr.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {


        System.out.println("sumar int: " + sumar(5, 5));
        System.out.println("sumar float: " + sumar(10.0F, 5F));
        System.out.println("sumar float-int: " + sumar(10f, 5));
        System.out.println("sumar int-float: " + sumar(10, 5.0F));
        System.out.println("sumar double: " + sumar(5D, 5D));
        System.out.println("sumar string: " + sumar("10", "5"));
        System.out.println("sumar tres int: " + sumar(10, 5, 3));

        System.out.println();
        System.out.println("sumar long: " + sumar(10L, 5L));
        System.out.println("sumar int: " + sumar(10, '@'));
        System.out.println("sumar float-int: " + sumar(10F, '@'));

        System.out.println();
        System.out.println("sumar cuatro int: " + sumar(10, 5, 3, 4));
        System.out.println("sumar cinco int: " + sumar(10, 5, 3, 4, 2));
        System.out.println("sumar float + n int: " + sumar(10.5F, 5, 9, 4, 2));
        System.out.println("sumar cuatro double: " + sumar(10.5, 5.0, 1.9));

    }
}
