/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Evaluation {
    private String type;
    private int duree;
    private String date;

    public Evaluation (){    
    }
    
    public Evaluation(String type, int duree, String date){
        this.type = type;
        this.duree= duree;
        this.date= date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String afficher(){
        return ("\ntype" + type + "\nduree" + duree + "\ndate" + date );
    }
    
}
