package co.jmurillo.sobrecarga;

// Importación estática de todos los métodos de la clase Calculadora
import static co.jmurillo.sobrecarga.Caculadora.*;

/**
 * Clase EjemploSobrecarga
 * Esta clase demuestra el uso de sobrecarga de métodos en Java.
 */
public class EjemploSobrecarga {
    public static void main(String[] args) {

        // Ejemplos de llamadas a diferentes versiones sobrecargadas del método suma

        // Suma de dos enteros
        System.out.println("sumar int : " + suma(12, 24));

        // Suma de un entero y un float
        System.out.println("sumar int-float : " + suma(12, 24.5F));

        // Suma de dos float
        System.out.println("sumar float : " + suma(12F, 23F));

        // Suma de un double, un int y un float
        System.out.println("sumar double-int-float : " + suma(20D, 30, 100F));

        // Suma de dos String (probablemente convirtiendo a números)
        System.out.println("sumar String : " + suma("28", "30"));

        // Suma de múltiples enteros usando varargs
        System.out.println("sumar utilizando argumentos int : " + suma(12, 23, 55, 89));

        // Suma de múltiples números (int y float) usando varargs
        System.out.println("sumar utilizando argumentos float : " + suma(12F, 23, 55, 89, 100));

        // Suma de múltiples números double usando varargs
        System.out.println("sumar varargs double : " + suma(23.3, 3.2, 4.5, 8D));
    }
}
