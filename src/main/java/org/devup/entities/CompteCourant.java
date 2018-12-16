package org.devup.entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant  extends Compt{


    private double decouvert ;

    public CompteCourant(){

    }


    public CompteCourant(String codeCompt, Date dateCreation, double sold, double decouvert) {
        super(codeCompt, dateCreation, sold);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}

