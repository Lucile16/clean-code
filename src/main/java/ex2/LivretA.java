package ex2;

public class LivretA extends CompteBancaire {

    public LivretA(typeCompte type, double solde, double tauxRemuneration) {
        super(type, solde, 0, tauxRemuneration);
    }

}
