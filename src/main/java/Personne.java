
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 * Created by edouard alexandre on 10/05/14.
 *
 */
//package fr.epsi;
@Named
@RequestScoped
public class Personne {
    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}