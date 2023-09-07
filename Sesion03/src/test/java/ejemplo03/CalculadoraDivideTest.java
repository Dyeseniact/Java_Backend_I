package ejemplo03;

import ejemplo01.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDivideTest {
    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba division")
    void divideTest() throws IllegalAccessException {
        int esperado = 9;
        assertEquals(esperado, calculadora.divide(18.0f, 2.0f));
    }
}