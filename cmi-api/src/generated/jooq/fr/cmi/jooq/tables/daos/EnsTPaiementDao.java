/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTPaiement;
import fr.cmi.jooq.tables.records.EnsTPaiementRecord;

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
public class EnsTPaiementDao extends DAOImpl<EnsTPaiementRecord, fr.cmi.jooq.tables.pojos.EnsTPaiement, Integer> {

    /**
     * Create a new EnsTPaiementDao without any configuration
     */
    public EnsTPaiementDao() {
        super(EnsTPaiement.ENS_T_PAIEMENT, fr.cmi.jooq.tables.pojos.EnsTPaiement.class);
    }

    /**
     * Create a new EnsTPaiementDao with an attached configuration
     */
    public EnsTPaiementDao(Configuration configuration) {
        super(EnsTPaiement.ENS_T_PAIEMENT, fr.cmi.jooq.tables.pojos.EnsTPaiement.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTPaiement object) {
        return object.getIdPaiement();
    }

    /**
     * Fetch records that have <code>id_paiement IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByIdPaiement(Integer... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.ID_PAIEMENT, values);
    }

    /**
     * Fetch a unique record that has <code>id_paiement = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTPaiement fetchOneByIdPaiement(Integer value) {
        return fetchOne(EnsTPaiement.ENS_T_PAIEMENT.ID_PAIEMENT, value);
    }

    /**
     * Fetch records that have <code>id_facture IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByIdFacture(Integer... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.ID_FACTURE, values);
    }

    /**
     * Fetch records that have <code>montant IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByMontant(Double... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.MONTANT, values);
    }

    /**
     * Fetch records that have <code>date_paiement IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByDatePaiement(Timestamp... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.DATE_PAIEMENT, values);
    }

    /**
     * Fetch records that have <code>mode_paiement IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByModePaiement(Integer... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.MODE_PAIEMENT, values);
    }

    /**
     * Fetch records that have <code>commentaire IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByCommentaire(String... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.COMMENTAIRE, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTPaiement> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTPaiement.ENS_T_PAIEMENT.DATE_MAJ, values);
    }
}