/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTMatiere;
import fr.cmi.jooq.tables.records.EnsTMatiereRecord;

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
public class EnsTMatiereDao extends DAOImpl<EnsTMatiereRecord, fr.cmi.jooq.tables.pojos.EnsTMatiere, Integer> {

    /**
     * Create a new EnsTMatiereDao without any configuration
     */
    public EnsTMatiereDao() {
        super(EnsTMatiere.ENS_T_MATIERE, fr.cmi.jooq.tables.pojos.EnsTMatiere.class);
    }

    /**
     * Create a new EnsTMatiereDao with an attached configuration
     */
    public EnsTMatiereDao(Configuration configuration) {
        super(EnsTMatiere.ENS_T_MATIERE, fr.cmi.jooq.tables.pojos.EnsTMatiere.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTMatiere object) {
        return object.getIdMatiere();
    }

    /**
     * Fetch records that have <code>id_matiere IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByIdMatiere(Integer... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.ID_MATIERE, values);
    }

    /**
     * Fetch a unique record that has <code>id_matiere = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTMatiere fetchOneByIdMatiere(Integer value) {
        return fetchOne(EnsTMatiere.ENS_T_MATIERE.ID_MATIERE, value);
    }

    /**
     * Fetch records that have <code>code_matiere IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByCodeMatiere(String... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.CODE_MATIERE, values);
    }

    /**
     * Fetch records that have <code>nom IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByNom(String... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.NOM, values);
    }

    /**
     * Fetch records that have <code>coef IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByCoef(Integer... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.COEF, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTMatiere> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTMatiere.ENS_T_MATIERE.DATE_MAJ, values);
    }
}
