/*
1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
variable C.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer n = 10;
        Double a = 5.0;
        Character c = 's';

        System.out.println("n = "+n+"... a = "+a+"... c = "+c);
        System.out.println("La suma de n+a es igual a ... "+(+n+a));
        System.out.println("La suma de n+a es igual a ... "+(+a-n));
        System.out.println("Valor numerico de variable c ... "+c.getNumericValue(c));

        Scanner s = new Scanner(System.in);
        String nombre = s.nextLine();

        System.out.println("Te amo "+ nombre +" =) ");

    }
}
