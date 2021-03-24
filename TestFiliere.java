/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestFiliere {
    public static void main(String args[]){
        
        Filiere f1 =new Filiere();
        f1.setNom ("Programmation");
        f1.setDescription ( "jjli");
        
        
        Filiere f2 = new Filiere("GRH", " hjk");
        
          System.out.println(f1.afficher());
          System.out.println(f2.afficher());
    }
    
}
