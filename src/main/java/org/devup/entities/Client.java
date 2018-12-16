package org.devup.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodeClient ;

    private String NomClient ;

    @OneToMany(mappedBy = "client" , fetch = FetchType.LAZY)
    private Collection<Compt> compts ;


    public Client() {
    }

    public Client(String nomClient) {
        NomClient = nomClient;
    }

    public Long getCodeClient() {
        return CodeClient;
    }

    public void setCodeClient(Long codeClient) {
        CodeClient = codeClient;
    }

    public String getNomClient() {
        return this.NomClient;
    }

    public void setNomClient(String nomClient) {
        this.NomClient = nomClient;
    }

    public Collection<Compt> getCompts() {
        return compts;
    }

    public void setCompts(Collection<Compt> compts) {
        this.compts = compts;
    }
}
