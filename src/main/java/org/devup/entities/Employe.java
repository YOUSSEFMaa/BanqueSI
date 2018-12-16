package org.devup.entities;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Employe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CodeEmploye ;
    private String NomEmploye ;
    @ManyToOne
    @JoinColumn(name = "COD_EM_SUP")
    private Employe employeSup ;

    @ManyToMany
    @JoinTable(name = "EMP_GR")
    private Collection<Group> groupes ;


    public Employe() {
    }

    public Employe(String nomEmploye) {
        NomEmploye = nomEmploye;
    }

    public Long getCodeEmploye() {
        return CodeEmploye;
    }

    public void setCodeEmploye(Long codeEmploye) {
        CodeEmploye = codeEmploye;
    }

    public String getNomEmploye() {
        return this.NomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.NomEmploye = nomEmploye;
    }
    @JsonIgnore
    public Employe getEmployeSup() {
        return employeSup;
    }

    @JsonSetter
    public void setEmployeSup(Employe employeSup) {
        this.employeSup = employeSup;
    }

    public Collection<Group> getGroups() {
        return groupes;
    }

    public void setGroups(Collection<Group> groupes) {
        this.groupes = groupes;
    }
}
