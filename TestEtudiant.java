/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class TestEtudiant {
    public static void main(String args[]){
        
        Etudiant e1 =new Etudiant();
        e1.setPrenom("Ingrid");
        e1.setNom("PIDI");
        e1.setAge(21);
        e1.setAdresse("MEDINA");
        e1.setTelephone("78 536 51 15");
        e1.setEmail("JHBPIF");
        
        
        Etudiant e2 = new Etudiant("Didier","MAKANY","MEDINA",22,"hjkHJU","hFRFRjk");
        Etudiant e3 = new Etudiant("Matthieu", "OSLO");
        
        System.out.println(e1.afficher());
        System.out.println(e2.afficher());
        System.out.println(e3.afficher());
    }
    
}
