/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestModule {
    public static void main(String args[]){
        
        Module m1 =new Module();
        m1.setNom (" JAVA");
        m1.setVolumeH ( 10);
        m1.setCoef ( 10);
        m1.setDescription (" HJK");
        
        
        Module m2 = new Module(" PHP", 15, 2, " hjk");
        
          System.out.println(m1.afficher());
          System.out.println(m2.afficher());
    }
}
