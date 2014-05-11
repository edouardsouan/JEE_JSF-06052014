package fr.epsi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Created by edouard on 11/05/14.
 */

@Named
@RequestScoped
public class Personne {

    @Size(min = 1, message = "Le nom est obligatoire !")
    private String nom;


    @Min(value=1, message = "L'âge doit être un nombre positif !")
    @Max(value=99, message = "L'âge ne peut pas dépasser 99 ans !")
    private int age;

    @AssertTrue(message = "Vous devez accepter les conditions générales du site.")
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
