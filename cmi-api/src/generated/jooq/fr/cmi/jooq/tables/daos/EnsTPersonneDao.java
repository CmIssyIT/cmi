/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTPersonne;
import fr.cmi.jooq.tables.records.EnsTPersonneRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class EnsTPersonneDao extends DAOImpl<EnsTPersonneRecord, fr.cmi.jooq.tables.pojos.EnsTPersonne, Integer> {

    /**
     * Create a new EnsTPersonneDao without any configuration
     */
    public EnsTPersonneDao() {
        super(EnsTPersonne.ENS_T_PERSONNE, fr.cmi.jooq.tables.pojos.EnsTPersonne.class);
    }

    /**
     * Create a new EnsTPersonneDao with an attached configuration
     */
    public EnsTPersonneDao(Configuration configuration) {
        super(EnsTPersonne.ENS_T_PERSONNE, fr.cmi.jooq.tables.pojos.EnsTPersonne.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTPersonne object) {
        return object.getIdPersonne();
    }

    /**
     * Fetch records that have <code>id_personne IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByIdPersonne(Integer... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.ID_PERSONNE, values);
    }

    /**
     * Fetch a unique record that has <code>id_personne = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTPersonne fetchOneByIdPersonne(Integer value) {
        return fetchOne(EnsTPersonne.ENS_T_PERSONNE.ID_PERSONNE, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByType(Integer... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.TYPE, values);
    }

    /**
     * Fetch records that have <code>nom IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByNom(String... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.NOM, values);
    }

    /**
     * Fetch records that have <code>prenom IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByPrenom(String... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.PRENOM, values);
    }

    /**
     * Fetch records that have <code>date_naissance IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByDateNaissance(Date... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.DATE_NAISSANCE, values);
    }

    /**
     * Fetch records that have <code>sexe IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchBySexe(Integer... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.SEXE, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.DATE_MAJ, values);
    }

    /**
     * Fetch records that have <code>statut IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPersonne> fetchByStatut(Integer... values) {
        return fetch(EnsTPersonne.ENS_T_PERSONNE.STATUT, values);
    }
}
