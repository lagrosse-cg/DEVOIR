/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestEvaluation {
    public static void main(String args[]){
        
        Evaluation e1 =new Evaluation();
        e1.setType (" DEVOIR");
        e1.setDuree ( 4 );
        e1.setDate ( "gfh");
        
        
        Evaluation e2 = new Evaluation(" PARTIEL", 3 , " hjk");
        
          System.out.println(e1.afficher());
          System.out.println(e2.afficher());
    }
}
