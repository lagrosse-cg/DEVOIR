/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Seance {
     private String date;
    private int heureDebut;
    private int heureFin;
    private int soldeHeure;

    public Seance (){    
    }
    
    public Seance(String date, int heureDebut, int heureFin, int soldeHeure){
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.soldeHeure = soldeHeure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }

    public int getSoldeHeure() {
        return soldeHeure;
    }

    public void setSoldeHeure(int soldeHeure) {
        this.soldeHeure = soldeHeure;
    }
    
    public String afficher(){
        return ("\ndate" + date + "\nheureDebut" + heureDebut + "\nheureFin" + heureFin + "\nsoldeHeure" + soldeHeure );
    }
    
}
