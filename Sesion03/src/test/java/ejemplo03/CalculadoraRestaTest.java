package ejemplo03;

import ejemplo01.Calculadora;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraRestaTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();

    }

    @Test
    @DisplayName("Prueba resta")
    void restaTest() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3, 2));
    }
}