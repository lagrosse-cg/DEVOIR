/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Filiere {
    private String nom;
    private String description;

    public Filiere (){    
    }
    
    public Filiere(String nom, String description){
        this.nom = nom;
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String afficher(){
        return ("\nnom" + nom + "\ndescription" + description );
    }
    
}
