package org.devup.Metier;


import org.devup.Dao.ComptRepository;

import org.devup.entities.Compt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComptImpl implements ComptMetier {
    @Autowired
    public ComptRepository comptRepository ;

    @Override
    public Compt saveCompt(Compt cp) {
        return  comptRepository.save(cp);
    }

    @Override
    public Compt getCompte(String code) {
    	Long c =Long.valueOf(code);
        return comptRepository.getOne(c);
    }
}
