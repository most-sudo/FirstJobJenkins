package ma.SupMTI.TP1.dev;

/**
 * Classe Calculatrice permettant d'effectuer des opérations simples (+, -, *, /)
 * entre deux entiers
 */
public class Calculatrice {

    private String ecran;
    private int premierNombre;
    private char operateur;
    private boolean nouveauNombre;

    /**
     * Initialise la calculatrice
     */
    public void initialize() {
        ecran = "0";
        premierNombre = 0;
        operateur = '\0';
        nouveauNombre = true;
    }

    /**
     * Retourne le contenu affiché dans l'écran de la calculatrice
     * @return le contenu de l'écran
     */
    public String getContenuEcran() {
        return ecran;
    }

    /**
     * Méthode appelée lorsque un bouton de la calculatrice est pressé
     * @param touche la valeur du bouton pressé
     */
    public void taperTouche(char touche) {
        if (touche >= '0' && touche <= '9') {
            // C'est un chiffre
            if (nouveauNombre) {
                ecran = String.valueOf(touche);
                nouveauNombre = false;
            } else {
                ecran += touche;
            }
        } else if (touche == '+' || touche == '-' || touche == '*' || touche == '/') {
            // C'est un opérateur
            if (operateur == '\0') {
                // Pas d'opérateur précédent, stocker le premier nombre
                premierNombre = Integer.parseInt(ecran);
                operateur = touche;
                ecran = String.valueOf(touche);
                nouveauNombre = true;
            } else {
                // Si un opérateur est déjà défini, on calcule d'abord seulement si on n'a pas déjà un opérateur à l'écran
                if (!nouveauNombre) {
                    calculer();
                }
                operateur = touche;
                ecran = String.valueOf(touche);
                nouveauNombre = true;
            }
        } else if (touche == '=') {
            // C'est le bouton égal
            if (operateur != '\0' && !nouveauNombre) {
                calculer();
                operateur = '\0';
            }
        }
    }

    /**
     * Effectue le calcul avec le premier nombre, l'opérateur et le nombre actuel à l'écran
     */
    private void calculer() {
        if (operateur == '\0') {
            return;
        }

        int deuxiemeNombre = Integer.parseInt(ecran);

        try {
            switch (operateur) {
                case '+':
                    premierNombre = premierNombre + deuxiemeNombre;
                    break;
                case '-':
                    premierNombre = premierNombre - deuxiemeNombre;
                    break;
                case '*':
                    premierNombre = premierNombre * deuxiemeNombre;
                    break;
                case '/':
                    if (deuxiemeNombre == 0) {
                        ecran = "Erreur: division par Zero !!";
                        premierNombre = 0;
                        operateur = '\0';
                        nouveauNombre = true;
                        return;
                    }
                    premierNombre = premierNombre / deuxiemeNombre;
                    break;
            }
            ecran = String.valueOf(premierNombre);
            nouveauNombre = true;
        } catch (Exception e) {
            ecran = "Erreur: division par Zero !!";
            premierNombre = 0;
            operateur = '\0';
            nouveauNombre = true;
        }
    }
}
