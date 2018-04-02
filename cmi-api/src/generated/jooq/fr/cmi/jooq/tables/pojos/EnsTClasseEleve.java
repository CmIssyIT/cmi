/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnsTClasseEleve implements Serializable {

    private static final long serialVersionUID = 1479517506;

    private final Integer   idClasElev;
    private final Integer   idClasse;
    private final Integer   idEleve;
    private final Integer   statut;
    private final Integer   dernierUtilisateur;
    private final Timestamp dateCrea;
    private final Timestamp dateMaj;

    public EnsTClasseEleve(EnsTClasseEleve value) {
        this.idClasElev = value.idClasElev;
        this.idClasse = value.idClasse;
        this.idEleve = value.idEleve;
        this.statut = value.statut;
        this.dernierUtilisateur = value.dernierUtilisateur;
        this.dateCrea = value.dateCrea;
        this.dateMaj = value.dateMaj;
    }

    public EnsTClasseEleve(
        Integer   idClasElev,
        Integer   idClasse,
        Integer   idEleve,
        Integer   statut,
        Integer   dernierUtilisateur,
        Timestamp dateCrea,
        Timestamp dateMaj
    ) {
        this.idClasElev = idClasElev;
        this.idClasse = idClasse;
        this.idEleve = idEleve;
        this.statut = statut;
        this.dernierUtilisateur = dernierUtilisateur;
        this.dateCrea = dateCrea;
        this.dateMaj = dateMaj;
    }

    public Integer getIdClasElev() {
        return this.idClasElev;
    }

    public Integer getIdClasse() {
        return this.idClasse;
    }

    public Integer getIdEleve() {
        return this.idEleve;
    }

    public Integer getStatut() {
        return this.statut;
    }

    public Integer getDernierUtilisateur() {
        return this.dernierUtilisateur;
    }

    public Timestamp getDateCrea() {
        return this.dateCrea;
    }

    public Timestamp getDateMaj() {
        return this.dateMaj;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EnsTClasseEleve other = (EnsTClasseEleve) obj;
        if (idClasElev == null) {
            if (other.idClasElev != null)
                return false;
        }
        else if (!idClasElev.equals(other.idClasElev))
            return false;
        if (idClasse == null) {
            if (other.idClasse != null)
                return false;
        }
        else if (!idClasse.equals(other.idClasse))
            return false;
        if (idEleve == null) {
            if (other.idEleve != null)
                return false;
        }
        else if (!idEleve.equals(other.idEleve))
            return false;
        if (statut == null) {
            if (other.statut != null)
                return false;
        }
        else if (!statut.equals(other.statut))
            return false;
        if (dernierUtilisateur == null) {
            if (other.dernierUtilisateur != null)
                return false;
        }
        else if (!dernierUtilisateur.equals(other.dernierUtilisateur))
            return false;
        if (dateCrea == null) {
            if (other.dateCrea != null)
                return false;
        }
        else if (!dateCrea.equals(other.dateCrea))
            return false;
        if (dateMaj == null) {
            if (other.dateMaj != null)
                return false;
        }
        else if (!dateMaj.equals(other.dateMaj))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.idClasElev == null) ? 0 : this.idClasElev.hashCode());
        result = prime * result + ((this.idClasse == null) ? 0 : this.idClasse.hashCode());
        result = prime * result + ((this.idEleve == null) ? 0 : this.idEleve.hashCode());
        result = prime * result + ((this.statut == null) ? 0 : this.statut.hashCode());
        result = prime * result + ((this.dernierUtilisateur == null) ? 0 : this.dernierUtilisateur.hashCode());
        result = prime * result + ((this.dateCrea == null) ? 0 : this.dateCrea.hashCode());
        result = prime * result + ((this.dateMaj == null) ? 0 : this.dateMaj.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnsTClasseEleve (");

        sb.append(idClasElev);
        sb.append(", ").append(idClasse);
        sb.append(", ").append(idEleve);
        sb.append(", ").append(statut);
        sb.append(", ").append(dernierUtilisateur);
        sb.append(", ").append(dateCrea);
        sb.append(", ").append(dateMaj);

        sb.append(")");
        return sb.toString();
    }
}
