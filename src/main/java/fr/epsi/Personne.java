package fr.epsi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

/**
 * Created by edouard on 11/05/14.
 */

@Named
@RequestScoped
public class Personne {

    @Size(min = 1, message = "Le login est obligatoire !")
    private String login;


    @Size(min=1, message ="L'email est obligatoire !")
    private String email;

    @AssertTrue(message = "Vous devez accepter les conditions générales du site.")
    private boolean agreed;

    public Personne(){}

    public String getlogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAgreed(boolean agreed){ this.agreed = agreed;}

    public boolean getAgreed(){return agreed;}
}
