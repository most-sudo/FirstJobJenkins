package ma.SupMTI.TP1.test;

import junit.framework.TestCase;
import ma.SupMTI.TP1.dev.Calculatrice;

/**
 * Classe de test pour Calculatrice utilisant JUnit 3
 */
public class CalculatriceTest extends TestCase {

    private Calculatrice calculatrice;

    /**
     * Méthode setUp() appelée avant chaque test
     * Réinitialise la calculatrice avant l'exécution de chaque scénario
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        calculatrice = new Calculatrice();
        calculatrice.initialize();
    }

    /**
     * Méthode tearDown() appelée après chaque test
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        calculatrice = null;
    }

    /**
     * Test de la méthode initialize()
     */
    public void testInitialize() {
        calculatrice.initialize();
        assertEquals("0", calculatrice.getContenuEcran());
    }

    /**
     * Scénario 1: Tester l'addition
     * Effectuer l'opération suivante 56 + 2011
     * Résultat attendu: la valeur affichée dans l'écran est 2067
     */
    public void testScenario1() {
        // Saisir 56
        calculatrice.taperTouche('5');
        calculatrice.taperTouche('6');

        // Appuyer sur +
        calculatrice.taperTouche('+');

        // Saisir 2011
        calculatrice.taperTouche('2');
        calculatrice.taperTouche('0');
        calculatrice.taperTouche('1');
        calculatrice.taperTouche('1');

        // Appuyer sur =
        calculatrice.taperTouche('=');

        // Vérifier le résultat
        assertEquals("2067", calculatrice.getContenuEcran());
    }

    /**
     * Scénario 2: Tester la soustraction
     * Effectuer l'opération suivante 3040 - 1020
     * Résultat attendu: la valeur affichée dans l'écran est 2020
     */
    public void testScenario2() {
        // Saisir 3040
        calculatrice.taperTouche('3');
        calculatrice.taperTouche('0');
        calculatrice.taperTouche('4');
        calculatrice.taperTouche('0');

        // Appuyer sur -
        calculatrice.taperTouche('-');

        // Saisir 1020
        calculatrice.taperTouche('1');
        calculatrice.taperTouche('0');
        calculatrice.taperTouche('2');
        calculatrice.taperTouche('0');

        // Appuyer sur =
        calculatrice.taperTouche('=');

        // Vérifier le résultat
        assertEquals("2020", calculatrice.getContenuEcran());
    }

    /**
     * Scénario 3: Tester la multiplication
     * Effectuer l'opération suivante 90*11
     * Résultat attendu: la valeur affichée dans l'écran est 990
     */
    public void testScenario3() {
        // Saisir 90
        calculatrice.taperTouche('9');
        calculatrice.taperTouche('0');

        // Appuyer sur *
        calculatrice.taperTouche('*');

        // Saisir 11
        calculatrice.taperTouche('1');
        calculatrice.taperTouche('1');

        // Appuyer sur =
        calculatrice.taperTouche('=');

        // Vérifier le résultat
        assertEquals("990", calculatrice.getContenuEcran());
    }

    /**
     * Scénario 4: Tester la division
     * Effectuer l'opération suivante 144/3
     * Résultat attendu: la valeur affichée dans l'écran est 48
     */
    public void testScenario4() {
        // Saisir 144
        calculatrice.taperTouche('1');
        calculatrice.taperTouche('4');
        calculatrice.taperTouche('4');

        // Appuyer sur /
        calculatrice.taperTouche('/');

        // Saisir 3
        calculatrice.taperTouche('3');

        // Appuyer sur =
        calculatrice.taperTouche('=');

        // Vérifier le résultat
        assertEquals("48", calculatrice.getContenuEcran());
    }

    /**
     * Scénario 5: Tester la division par zéro
     * Effectuer l'opération suivante 144/0
     * Résultat attendu: l'écran de la calculatrice affiche le message : "Erreur: division par Zero !!"
     */
    public void testScenario5() {
        // Saisir 144
        calculatrice.taperTouche('1');
        calculatrice.taperTouche('4');
        calculatrice.taperTouche('4');

        // Appuyer sur /
        calculatrice.taperTouche('/');

        // Saisir 0
        calculatrice.taperTouche('0');

        // Appuyer sur =
        calculatrice.taperTouche('=');

        // Vérifier le message d'erreur
        assertEquals("Erreur: division par Zero !!", calculatrice.getContenuEcran());
    }
}
