/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestSeance {
    public static void main(String args[]){
        
        Seance s1 =new Seance();
        s1.setDate (" FETEG ");
        s1.setHeureDebut ( 10);
        s1.setHeureFin ( 14);
        s1.setSoldeHeure (4);
        
        
        Seance s2 = new Seance(" KIHO ", 15, 20 , 5);
        
          System.out.println(s1.afficher());
          System.out.println(s2.afficher());
    }
    
}
