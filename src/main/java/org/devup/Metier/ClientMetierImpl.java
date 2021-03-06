package org.devup.Metier;

import org.devup.Dao.ClientRepository;
import org.devup.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service
public class ClientMetierImpl  implements ClientMetier{

    @Autowired
    private ClientRepository clientRepository ;

    @Override

    public Client saveClient(Client c) {


        return clientRepository.save(c) ;

    }

    @Override
    public List<Client> listClient() {

        return clientRepository.findAll() ;
    }
}
