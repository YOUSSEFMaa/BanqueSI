package org.devup.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("CE")
public class ComptEpergne extends Compt{

    private double taux ;

    public ComptEpergne(){

    }

    public ComptEpergne(String codeCompt, Date dateCreation, double sold, double taux) {
        super(codeCompt, dateCreation, sold);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
