package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;

    @Before
    public void setUp(){
        mate = Matematica.getInstance();
 //       System.out.println("Am vizitat");
    }

    @Test
    public void testSumaCorecta() {
        int rezultatObtinut = mate.suma(7, 5);
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect(){
        double rezultatObtinut = mate.raport(24, 6);
        assertEquals(4, rezultatObtinut,0.001);
    }

    @Test
    public void testRaport2() {
        double rezultat = mate.raport(24, 11);
        assertEquals(2.18, rezultat, 0.005);
    }

    @Test
    public void testRaport3() {
        double rezultat = mate.raport(24, -2);
        assertEquals(-12, rezultat, 0.005);
    }

    //specific junit3
    @Test
    public void testRaportShouldThrowException() {
        try {
            mate.raport(57,0);
            fail("Nu trebuia sa ajunga aici");
        }catch (IllegalArgumentException ert) {

        }
    }

    //specific junit 4
    @Test(expected = IllegalArgumentException.class)
    public void testRaportShoulThrowException2() {
        mate.raport(23, 0);
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(5);
        assertFalse(rezultat);
        assertTrue(mate.estePar(4));
        assertTrue(mate.estePar(8));
        assertFalse(mate.estePar(9));
    }

    @Test
    public void testNumerePare() {
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(5, mate.nNumerePare(5).size());
        assertEquals(1, mate.nNumerePare(1).size());
    }

    @Test
    public void testNumerePare2() {
        assertNull(mate.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException(){
        mate.nNumerePare(-3);
    }

    @Test
    public void testSingleton() {
        assertSame(Matematica.getInstance(), Matematica.getInstance());
    }

    @Test
    public void testRaport() {
        assertEquals(1, mate.raport(5,5), 0.005);
    }
}