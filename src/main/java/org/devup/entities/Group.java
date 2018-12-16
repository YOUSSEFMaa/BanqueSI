package org.devup.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;


@Entity
@Table(name = "Groupes")
public class Group implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long CodeGroup ;
    private String NomGroup ;
    @ManyToMany(mappedBy = "groupes")
    private Collection<Employe> employes ;

    public Group() {
    }

    public Group(Long codeGroup, String nomGroup) {
        CodeGroup = codeGroup;
        NomGroup = nomGroup;
    }

    public Long getCodeGroup() {
        return CodeGroup;
    }

    public void setCodeGroup(Long codeGroup) {
        CodeGroup = codeGroup;
    }

    public String getNomGroup() {
        return NomGroup;
    }

    public void setNomGroup(String nomGroup) {
        NomGroup = nomGroup;
    }

    public Collection<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(Collection<Employe> employes) {
        this.employes = employes;
    }
}
