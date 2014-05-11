package fr.epsi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by edouard on 11/05/14.
 */

@Named
@RequestScoped
public class Personne {
    private String nom;
    private int age;
    private boolean agreed;

    public Personne(){}

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

    public void setAgreed(boolean agreed){ this.agreed = agreed;}

    public boolean getAgreed(){return agreed;}
}
