package org.devup.Services;

import org.devup.entities.Client;
import org.devup.Metier.ClientMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class  ClientRestService {

    @Autowired
    private ClientMetier clientMetier;

    @RequestMapping(value = "/clients" , method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)

    public  Client saveClient(@RequestBody Client c) {
        return clientMetier.saveClient(c);
    }

    @RequestMapping(value = "/clients" , method = RequestMethod.GET)
    public List<Client> listClient() { return clientMetier.listClient(); }

}
