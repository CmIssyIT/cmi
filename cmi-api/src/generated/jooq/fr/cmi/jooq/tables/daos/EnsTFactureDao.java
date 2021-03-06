/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTFacture;
import fr.cmi.jooq.tables.records.EnsTFactureRecord;

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
public class EnsTFactureDao extends DAOImpl<EnsTFactureRecord, fr.cmi.jooq.tables.pojos.EnsTFacture, Integer> {

    /**
     * Create a new EnsTFactureDao without any configuration
     */
    public EnsTFactureDao() {
        super(EnsTFacture.ENS_T_FACTURE, fr.cmi.jooq.tables.pojos.EnsTFacture.class);
    }

    /**
     * Create a new EnsTFactureDao with an attached configuration
     */
    public EnsTFactureDao(Configuration configuration) {
        super(EnsTFacture.ENS_T_FACTURE, fr.cmi.jooq.tables.pojos.EnsTFacture.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTFacture object) {
        return object.getIdFacture();
    }

    /**
     * Fetch records that have <code>id_facture IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByIdFacture(Integer... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.ID_FACTURE, values);
    }

    /**
     * Fetch a unique record that has <code>id_facture = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTFacture fetchOneByIdFacture(Integer value) {
        return fetchOne(EnsTFacture.ENS_T_FACTURE.ID_FACTURE, value);
    }

    /**
     * Fetch records that have <code>date_facture IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByDateFacture(Date... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.DATE_FACTURE, values);
    }

    /**
     * Fetch records that have <code>montant IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByMontant(Double... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.MONTANT, values);
    }

    /**
     * Fetch records that have <code>statut IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByStatut(Integer... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.STATUT, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTFacture> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTFacture.ENS_T_FACTURE.DATE_MAJ, values);
    }
}
