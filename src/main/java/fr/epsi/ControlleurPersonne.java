package fr.epsi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControlleurPersonne {

    private String resultat;

    public String getResultat() {
        return resultat;
    }

    public void traiter(Personne personne){
        resultat = "Bravo "+personne.getNom()+", vous avez "+personne.getAge()+" ans.";
    }
}
