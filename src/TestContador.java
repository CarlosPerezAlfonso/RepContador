package src;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestContador {

    @Test
    //Test: los valores son los correctos
    public void TestValorCorrecto() {
        Contador contador1 = new Contador(0, 2, 10);

        aassertEquals(10, contador1.getValorFinal());
    }
    
}



