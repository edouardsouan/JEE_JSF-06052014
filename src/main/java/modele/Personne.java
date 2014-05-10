package modele;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.*;

/**
 * Created by edouard alexandre on 10/05/14.
 *
 */
//package fr.epsi;


@Named
@RequestScoped
public class Personne {
    @Size(min = 1, message = "Le nom est obligatoire !")
    private String nom;

    @Min(value=1, message = "L'âge doit être un nombre positif !")
    @Max(value=99, message = "L'âge ne peut pas dépasser 99 ans !")

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