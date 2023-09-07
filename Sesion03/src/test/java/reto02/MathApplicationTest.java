package reto02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MathApplicationTest {

    @Mock
    CalculadoraService calcService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    void add() {
        when(calcService.add(10.0, 20.0)).thenReturn(30.0); //si es de la intefaz
        assertEquals( 30, mathApplication.add(10.0, 20.0)); //si es de la clase
        verify(calcService).add(10.0, 20.0); //se comprueba que estan vinculado con las pruebas
    }

    @Test
    void subtract() {
        when(calcService.subtract(20.0, 10.0)).thenReturn(10.0);
        assertEquals(10, mathApplication.subtract(20.0, 10.0));
        verify(calcService).subtract(20.0, 10.0);
    }

    @Test
    void multiply() {
        when(calcService.multiply(20.0, 10.0)).thenReturn(200.0);
        assertEquals(200.0, mathApplication.multiply(20.0, 10.0));
        verify(calcService).multiply(20.0, 10.0);
    }

    @Test
    void divide() {
        when(calcService.divide(20.0, 10.0)).thenReturn(2.0);
        assertEquals(2.0, mathApplication.divide(20.0, 10.0));
        verify(calcService).divide(20.0, 10.0);
    }
}