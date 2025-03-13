import org.example.models.Azucarero;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAzuquero {
    static Azucarero azuquero;

    @BeforeAll
    static public void setUp(){
        azuquero = new Azucarero(10);
    }


    @Test
    public void deberiadevolverVerdaderoSiHaySuficienteAzucarEnE1Azuquero() {
        boolean resultado = azuquero.hasAzucar(5);
        assertEquals(true, resultado);
        resultado= azuquero.hasAzucar(10);
        assertEquals(true, resultado);
    }

    @Test
    public void deberiadevolverfalsoPorqueNoHaySuficienteAzucarEnElAzuquero() {
        boolean resultado= azuquero.hasAzucar (15);
        assertEquals(false, resultado);
    }


    @Test
    public void deberiaRestarAzucarAlAzuquero() {
        azuquero.giveAzucar(5);
        assertEquals(5, azuquero.getCantidadDeAzucar());
        azuquero.giveAzucar(2);
        assertEquals(3, azuquero.getCantidadDeAzucar());
    }
}
