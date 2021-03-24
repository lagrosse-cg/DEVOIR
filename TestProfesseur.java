/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestProfesseur {
    public static void main(String args[]){
        
        Professeur p1 =new Professeur();
        p1.setPrenom("Mohamed");
        p1.setNom("BAH");
        p1.setAge(46);
        p1.setAdresse("CASTOR");
        p1.setTelephone("78 365 15 51");
        p1.setEmail("JJHIU");
        
        
        Professeur p2 = new Professeur("Landing","DIATTA","DIEUPPEUL",48,"MFDNKH","SDFD");
        Professeur p3 = new Professeur("Matthieu", "OSLO");
        
        System.out.println(p1.afficher());
        System.out.println(p2.afficher());
        System.out.println(p3.afficher());
    }
    
}
