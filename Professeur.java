/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

/**
 *
 * @author lenovo
 */
public class Professeur {
     private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private  String telephone;
    private String email;

    public Professeur (){
        
    }
    
    public Professeur(String prenom, String nom, String adresse,int age, String telephone, String email){
        this.prenom = prenom;
        this.nom= nom;
        this.adresse= adresse;
        this.age= age;
        this.telephone= telephone;
        this.email= email;
    }
    
    public Professeur(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String afficher(){
        return ("\nprenom" + prenom + "\nom" + nom + "\nadresse" + adresse + "\nage" + age+ "\ntelephone" + telephone + "\nemail" +email);
    }
    
}
