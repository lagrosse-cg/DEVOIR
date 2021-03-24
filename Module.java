/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Module {
    private String nom;
    private int volumeH;
    private int coef;
    private String description;

    public Module (){    
    }
    
    public Module(String nom, int volumeH, int coef, String description){
        this.nom = nom;
        this.volumeH= volumeH;
        this.coef= coef;
        this.description= description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVolumeH() {
        return volumeH;
    }

    public void setVolumeH(int volumeH) {
        this.volumeH = volumeH;
    }

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String afficher(){
        return ("\nnom" + nom + "\nvolumeH" + volumeH + "\ncoef" + coef + "\ndescription" + description );
    }
}
