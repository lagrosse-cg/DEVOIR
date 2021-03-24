/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class FicheNote {
    private int num;
    private String dateCreation;

    public FicheNote (){    
    }
    
    public FicheNote(int num, String dateCreation){
        this.num = num;
        this.dateCreation = dateCreation;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    
    
    public String afficher(){
        return ("\nnum" + num + "\ndateCreation" + dateCreation );
    }
}
