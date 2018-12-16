package org.devup.Metier;

import org.devup.entities.Compt;

import java.util.List;

public interface ComptMetier {

    public Compt saveCompt(Compt cp) ;
    public Compt  getCompte(String code);
    
}
