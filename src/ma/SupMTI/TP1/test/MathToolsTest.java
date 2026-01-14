package ma.SupMTI.TP1.test;

import junit.framework.TestCase;
import ma.SupMTI.TP1.dev.MathTools;

/**
 * Classe de test pour MathTools utilisant JUnit 3
 */
public class MathToolsTest extends TestCase {

    private MathTools mathTools;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mathTools = new MathTools();
    }

    /**
     * Méthode tearDown() appelée après chaque test
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        mathTools = null;
    }

    /**
     * Test de la méthode carre()
     */
    public void testCarre() {
        // Test avec un nombre positif
        double resultat1 = mathTools.carre(5.0);
        assertEquals(25.0, resultat1, 0.0001);

        // Test avec zéro
        double resultat2 = mathTools.carre(0.0);
        assertEquals(0.0, resultat2, 0.0001);

        // Test avec un nombre négatif
        double resultat3 = mathTools.carre(-3.0);
        assertEquals(9.0, resultat3, 0.0001);

        // Test avec un nombre décimal
        double resultat4 = mathTools.carre(2.5);
        assertEquals(6.25, resultat4, 0.0001);
    }
}
