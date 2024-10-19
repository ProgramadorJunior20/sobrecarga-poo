package co.jmurillo.sobrecarga;


/**
 * Clase Calculadora
 * Esta clase proporciona varios métodos estáticos sobrecargados para realizar sumas.
 * Demuestra el concepto de sobrecarga de métodos en Java.
 */
public class Caculadora {

    /**
     * Constructor privado para prevenir la instanciación de esta clase de utilidad.
     */
    private Caculadora() {
    }

    /**
     * Suma dos números enteros.
     * @param a Primer número entero
     * @param b Segundo número entero
     * @return La suma de a y b
     */
    public static int suma (int a, int b) {
        return a + b;
    }

    /**
     * Suma un número variable de enteros.
     * @param argumentos Array de enteros a sumar
     * @return La suma de todos los argumentos
     */
    public static int suma(int... argumentos) {
        int total = 0;
        for (int i: argumentos){
            total += i;
        }
        return total;
    }

    /**
     * Suma un float inicial y un número variable de enteros.
     * @param a Número float inicial
     * @param argumentos Array de enteros a sumar
     * @return La suma de a y todos los argumentos
     */
    public static float suma(float a, int... argumentos) {
        float total = a;
        for (int i: argumentos){
            total += i;
        }
        return total;
    }

    /**
     * Suma un número variable de doubles.
     * @param varargs Array de doubles a sumar
     * @return La suma de todos los argumentos
     */
    public static double suma (double... varargs) {
        double total = 0.0;
        for (double i : varargs){
            total += i;
        }
        return total;
    }

    /**
     * Suma un entero y un float.
     * @param a Número entero
     * @param b Número float
     * @return La suma de a y b como float
     */
    public static float suma (int a, float b){
        return a + b;
    }

    /**
     * Suma dos números float.
     * @param a Primer número float
     * @param b Segundo número float
     * @return La suma de a y b
     */
    public static float suma (float a, float b){
        return a + b;
    }

    /**
     * Suma un double, un entero y un float.
     * @param a Número double
     * @param b Número entero
     * @param c Número float
     * @return La suma de a, b y c como double
     */
    public static double suma (double a, int b, float c){
        return a + b + c;
    }

    /**
     * Suma dos números representados como strings.
     * Si los strings no son números válidos, retorna 0.
     * @param a Primer número como string
     * @param b Segundo número como string
     * @return La suma de a y b, o 0 si no son números válidos
     */
    public static int suma (String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
}
