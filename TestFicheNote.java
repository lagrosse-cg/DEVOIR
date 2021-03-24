/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestFicheNote {
    public static void main(String args[]){
        
        FicheNote f1 =new FicheNote();
        f1.setNum (12);
        f1.setDateCreation ( "jjli");
        
        
        FicheNote f2 = new FicheNote(15, " hjk");
        
          System.out.println(f1.afficher());
          System.out.println(f2.afficher());
    }
    
}
