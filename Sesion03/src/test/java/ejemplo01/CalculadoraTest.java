package ejemplo01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    private Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("Prueba suma")
    void suma() {
        int esperado = 5;

        assertEquals(esperado, calculadora.suma(3,2));

    }

    @Test
    @DisplayName("Prueba resta")
    void resta() {
        int esperado = 1;

        assertEquals(esperado, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba multiplicacion")
    void multiplicacion() {
        int esperado = 6;

        assertEquals(esperado, calculadora.multiplicacion(3,2));
    }

    @Test
    @DisplayName("Prueba Division Error")
    void divicionErrorTest() {
        Throwable exception = assertThrows(IllegalAccessException.class, () -> calculadora.divide(5,0));

        assertEquals("No es posible dividir un valor entre 0", exception.getMessage());
    }

    @Test
    @DisplayName("Prueba Division")
    void divicionTest() throws IllegalAccessException {
        int esperado = 2;
        assertEquals(esperado, calculadora.divide(10.0f,5.0f));
    }


}