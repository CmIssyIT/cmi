/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTAnneeScolaire;
import fr.cmi.jooq.tables.records.EnsTAnneeScolaireRecord;

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
public class EnsTAnneeScolaireDao extends DAOImpl<EnsTAnneeScolaireRecord, fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire, Integer> {

    /**
     * Create a new EnsTAnneeScolaireDao without any configuration
     */
    public EnsTAnneeScolaireDao() {
        super(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE, fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire.class);
    }

    /**
     * Create a new EnsTAnneeScolaireDao with an attached configuration
     */
    public EnsTAnneeScolaireDao(Configuration configuration) {
        super(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE, fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire object) {
        return object.getIdAnnee();
    }

    /**
     * Fetch records that have <code>id_annee IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire> fetchByIdAnnee(Integer... values) {
        return fetch(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.ID_ANNEE, values);
    }

    /**
     * Fetch a unique record that has <code>id_annee = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire fetchOneByIdAnnee(Integer value) {
        return fetchOne(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.ID_ANNEE, value);
    }

    /**
     * Fetch records that have <code>libelle IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire> fetchByLibelle(String... values) {
        return fetch(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.LIBELLE, values);
    }

    /**
     * Fetch records that have <code>date_debut IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire> fetchByDateDebut(Timestamp... values) {
        return fetch(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.DATE_DEBUT, values);
    }

    /**
     * Fetch records that have <code>date_fin IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire> fetchByDateFin(Timestamp... values) {
        return fetch(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.DATE_FIN, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAnneeScolaire> fetchByDernierUtilisateur(Timestamp... values) {
        return fetch(EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE.DERNIER_UTILISATEUR, values);
    }
}
