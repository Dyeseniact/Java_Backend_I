package ejemplo01;

public class Calculadora {

    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) throws IllegalAccessException {
        if(b == 0) {
            throw new IllegalAccessException("No es posible dividir un valor entre 0");
        }
        return a / b;
    }

}
