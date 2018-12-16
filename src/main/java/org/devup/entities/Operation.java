package org.devup.entities;

import sun.security.util.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 1)
public class Operation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long numeroOperation ;

    private Date DateOperation ;
    private double montant ;
    @ManyToOne
    @JoinColumn(name = "COD_COMPT")
    private Compt compt ;
    @ManyToOne
    @JoinColumn(name = "COD_EMPLOYE")
    private Employe employe ;


    public Operation(Long numeroOperation, Date dateOperation, double montant) {
        this.numeroOperation = numeroOperation;
        DateOperation = dateOperation;
        this.montant = montant;
    }

    public Operation() {
    }

    public Long getNumeroOperation() {
        return numeroOperation;
    }

    public void setNumeroOperation(Long numeroOperation) {
        this.numeroOperation = numeroOperation;
    }

    public Date getDateOperation() {
        return DateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        DateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Compt getCompt() {
        return compt;
    }

    public void setCompt(Compt compt) {
        this.compt = compt;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
