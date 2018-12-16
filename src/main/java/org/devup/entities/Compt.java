package org.devup.entities;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Description;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CPTE" , discriminatorType = DiscriminatorType.STRING , length = 2)


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME , include = JsonTypeInfo.As.PROPERTY  , property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "Cc" , value = CompteCourant.class),
        @JsonSubTypes.Type(name = "CE" , value = CompteCourant.class)

})

public abstract class Compt  implements Serializable{

        @Id

        private String CodeCompt ;
        private Date DateCreation ;
        private double Sold ;
        @ManyToOne
        @JoinColumn(name = "Cod_CLient")
        private Client client ;
        @ManyToOne
        @JoinColumn(name = "Cod_Employe")
        private Employe employe ;
        @OneToMany(mappedBy = "compt")
        private Collection<Operation> operations ;


    public Compt(String codeCompt, Date dateCreation, double sold) {

        CodeCompt = codeCompt;
        DateCreation = dateCreation;
        Sold = sold;
    }

    public Compt() {
    }

    public String getCodeCompt() {
        return CodeCompt;
    }

    public void setCodeCompt(String codeCompt) {
        CodeCompt = codeCompt;
    }

    public Date getDateCreation() {
        return DateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        DateCreation = dateCreation;
    }

    public double getSold() {
        return Sold;
    }

    public void setSold(double sold) {
        Sold = sold;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Collection<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Collection<Operation> operations) {
        this.operations = operations;
    }
}
