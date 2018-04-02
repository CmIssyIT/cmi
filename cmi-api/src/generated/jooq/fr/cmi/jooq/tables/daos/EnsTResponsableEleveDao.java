/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTResponsableEleve;
import fr.cmi.jooq.tables.records.EnsTResponsableEleveRecord;

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
public class EnsTResponsableEleveDao extends DAOImpl<EnsTResponsableEleveRecord, fr.cmi.jooq.tables.pojos.EnsTResponsableEleve, Integer> {

    /**
     * Create a new EnsTResponsableEleveDao without any configuration
     */
    public EnsTResponsableEleveDao() {
        super(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE, fr.cmi.jooq.tables.pojos.EnsTResponsableEleve.class);
    }

    /**
     * Create a new EnsTResponsableEleveDao with an attached configuration
     */
    public EnsTResponsableEleveDao(Configuration configuration) {
        super(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE, fr.cmi.jooq.tables.pojos.EnsTResponsableEleve.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTResponsableEleve object) {
        return object.getIdResEle();
    }

    /**
     * Fetch records that have <code>id_res_ele IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByIdResEle(Integer... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.ID_RES_ELE, values);
    }

    /**
     * Fetch a unique record that has <code>id_res_ele = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTResponsableEleve fetchOneByIdResEle(Integer value) {
        return fetchOne(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.ID_RES_ELE, value);
    }

    /**
     * Fetch records that have <code>id_responsable IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByIdResponsable(Integer... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.ID_RESPONSABLE, values);
    }

    /**
     * Fetch records that have <code>id_eleve IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByIdEleve(Integer... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.ID_ELEVE, values);
    }

    /**
     * Fetch records that have <code>flag IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByFlag(Integer... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.FLAG, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTResponsableEleve> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE.DATE_MAJ, values);
    }
}
