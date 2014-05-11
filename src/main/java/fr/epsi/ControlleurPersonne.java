package fr.epsi;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControlleurPersonne {

    private String resultat;

    public String getResultat() {
        return resultat;
    }

    public void traiter(Personne personne){
        resultat = "Bravo"+personne.getNom()+", vous avez fait une requête Ajax !";
    }
}
