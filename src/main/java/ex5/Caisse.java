package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    private String nom;
    private List<Item> items;
    private static final int CAPACITE_MAX_PETITS_OBJETS = 5;
    private static final int CAPACITE_MAX_MOYENS_OBJETS = 20;

    /**
     * Constructeur
     *
     * @param nom
     */
    public Caisse(String nom) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour l'attribut nom
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Setter pour l'attribut items
     *
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * Vérifie si la caisse peut accepter l'objet en fonction de son poids
     *
     * @param item l'objet à vérifier
     * @return true si la caisse peut accepter l'objet, false sinon
     */
    public boolean peutAccepter(Item item) {
        if (this.nom.equals("Petits objets") && item.getPoids() < CAPACITE_MAX_PETITS_OBJETS) {
            return true;
        } else if (this.nom.equals("Moyens objets") && item.getPoids() >= CAPACITE_MAX_PETITS_OBJETS && item.getPoids() <= CAPACITE_MAX_MOYENS_OBJETS) {
            return true;
        } else if (this.nom.equals("Grands objets") && item.getPoids() >= CAPACITE_MAX_MOYENS_OBJETS) {
            return true;
        }
        return false;
    }
}
