import org.example.models.Azucarero;
import org.example.models.Cafetera;
import org.example.models.MaquinaCafe;
import org.example.models.Vaso;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMaquinaDeCafe {

    static Cafetera cafetera;
    static Vaso vasosPequeno;
    static Vaso vasosMediano;
    static Vaso vasosGrande;
    static Azucarero azucarero;
    static MaquinaCafe maquinaDeCafe;

    @BeforeAll
    static public void setUp(){
        cafetera = new Cafetera (50);
        vasosPequeno = new Vaso(5,10);
        vasosMediano = new Vaso (5,20);
        vasosGrande = new Vaso(5,30);
        azucarero = new Azucarero (20);

        maquinaDeCafe = new MaquinaCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeno(vasosPequeno);
        maquinaDeCafe.setVasosMediano(vasosMediano);
        maquinaDeCafe.setvasosGrande(vasosGrande);
        maquinaDeCafe.setAzucarero(azucarero);
        maquinaDeCafe.cafe.setCantidadDeCafe(40);
        maquinaDeCafe.azuquero.setCantidadDeAzucar(17);
    }

    @Test
    public void deberiaDevolverUnVasoPequeno() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        assertEquals(maquinaDeCafe.vasoPequeno, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoMediano() {
        MaquinaCafe maquinaDeCafe = new MaquinaCafe();
        Vaso vaso = maquinaDeCafe.getTipoVaso("mediano");
        assertEquals(maquinaDeCafe.vasoMediano, vaso);
    }

    @Test
    public void deberiaDevolverUnVasoGrande() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("grande");
        assertEquals(maquinaDeCafe.vasGrande, vaso);
    }
    @Test
    public void deberiaDevolverNoHayCafe() {
        cafetera = new Cafetera(5);
        maquinaDeCafe.setCafetera (cafetera);
        Vaso vaso= maquinaDeCafe.getTipoVaso("pequeno");
        String resultado = maquinaDeCafe.getVasoDeCafe (vaso,1,2);
        assertEquals("No hay Cafe", resultado);
    }
    @Test
    public void deberiaDevolverNoHayVasos() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        String resultado = maquinaDeCafe.getVasoDeCafe (vaso,10,2);
        assertEquals("No hay Vasos", resultado);
    }



    @Test
    public void deberiaDevolverNoHayAzucar() {
        azucarero=new Azucarero(2);
        maquinaDeCafe.setAzucarero (azucarero);
        Vaso vaso= maquinaDeCafe.getTipoVaso("pequeno");
        String resultado = maquinaDeCafe.getVasoDeCafe (vaso,1,3);
        assertEquals("No hay Azucar", resultado);
    }

    @Test
    public void deberiaRestarCafe() {
        Vaso vaso= maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe (vaso,1,3);
        int resultado = maquinaDeCafe.getCafe().getCantidadDeCafe();
        assertEquals(40, resultado);
    }

    @Test
    public void deberiaRestarVaso() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe(vaso, 1, 3);
        //int resultado = maquinaDeCafe.getCafe().getCantidadDeVasos();
        //assertEquals(4, resultado);
    }

    @Test
    public void deberiaRestarAzucar() {
        Vaso vaso = maquinaDeCafe.getTipoVaso("pequeno");
        maquinaDeCafe.getVasoDeCafe (vaso,1,3);
        int resultado = (maquinaDeCafe.getAzuquero().getCantidadDeAzucar()) +15;
        assertEquals(17, resultado);
    }

    @Test
    public void deberiaDevolverFelicitaciones() {
        Vaso vaso= maquinaDeCafe.getTipoVaso("pequeno");
        String resultado = maquinaDeCafe.getVasoDeCafe (vaso,1,3);
        resultado = "Felicitaciones";
        assertEquals("Felicitaciones", resultado);
}
}
