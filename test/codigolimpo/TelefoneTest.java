package codigolimpo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TelefoneTest {

    @Test
    public void testNewTelefone() {
        assertNotNull(Telefone.newTelefone("12345678"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNewTelefoneErrado() {
        Telefone.newTelefone("1234567");
    }

    @Test(expected = NullPointerException.class)
    public void testNewTelefoneNull() {
        Telefone.newTelefone(null);
    }

    @Test
    public void testEquals() {
        Telefone telefone1 = Telefone.newTelefone("12341234");
        Telefone telefone2 = Telefone.newTelefone("12341234");
        assertEquals(telefone1, telefone2);
    }
    
}
