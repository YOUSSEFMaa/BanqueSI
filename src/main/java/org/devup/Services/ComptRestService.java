package org.devup.Services;

import org.devup.entities.Compt;
import org.devup.Metier.ComptMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ComptRestService {


    @Autowired
    public ComptMetier comptMetier ;

    @RequestMapping(value = "/comptes" , method = RequestMethod.POST)
    public Compt saveCompt( @RequestBody  Compt cp) {
        return comptMetier.saveCompt(cp);
    }

    @RequestMapping(value = "/comptes/{code}" , method = RequestMethod.GET)
    public Compt getCompte( @PathVariable  String code) {
        return comptMetier.getCompte(code);
    }


}
