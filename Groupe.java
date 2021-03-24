/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Groupe {
     private String nom;
    private String dateCreation;

    public Groupe (){    
    }
    
    public Groupe(String nom, String dateCreation){
        this.nom = nom;
        this.dateCreation = dateCreation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
    

    
    
    
    public String afficher(){
        return ("\nnom" + nom + "\ndateCreation" + dateCreation );
    }
}
