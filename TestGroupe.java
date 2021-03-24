/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestGroupe {
    public static void main(String args[]){
        
        Groupe g1 =new Groupe();
        g1.setNom (" PR310");
        g1.setDateCreation ( "jjli");
        
        
        Groupe g2 = new Groupe(" 214", " hjk");
        
          System.out.println(g1.afficher());
          System.out.println(g2.afficher());
    }
    
}
