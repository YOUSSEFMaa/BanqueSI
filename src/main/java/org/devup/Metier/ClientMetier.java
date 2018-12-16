package org.devup.Metier;

import org.devup.entities.Client;

import java.util.List;

public interface ClientMetier {


    public Client saveClient(Client c ) ;
    public List<Client> listClient() ;
}
