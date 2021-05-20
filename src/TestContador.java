package src;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestContador {

    @Test
    //Test: los valores son los correctos
    public void TestValorCorrecto() {
        ClassContador contador1 = new ClassContador(0, 2, 10);

        assertEquals(10, contador1.getValorLimite());
    }

    @Test
    //Test: inicial e incremento con valor 0 y 1 respectivamente por defecto
    public void TestValoresPorDefecto() {
        ClassContador contador1 = new ClassContador(10);

        assertEquals(0, contador1.getValorInicial());
        assertEquals(1, contador1.getValorIncremento());
    }
    
}



