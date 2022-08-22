import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class MainTest {

    Personagem littleCleber, dona;
    CampoBatalha campo;

    @Before
    public void setup(){
        littleCleber = new Personagem("Programador", 500, 80, 40, true);
        dona = new Personagem("Chefe", 800, 60, 40, false);
        campo = new CampoBatalha();
    }
        
    @Test
    public void testlittleCleberVivo() {
        assertTrue(campo.combate(dona, littleCleber));
    }
}
    