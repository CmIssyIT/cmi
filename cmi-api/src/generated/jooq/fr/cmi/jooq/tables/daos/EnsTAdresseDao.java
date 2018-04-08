/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.daos;


import fr.cmi.jooq.tables.EnsTAdresse;
import fr.cmi.jooq.tables.records.EnsTAdresseRecord;

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
public class EnsTAdresseDao extends DAOImpl<EnsTAdresseRecord, fr.cmi.jooq.tables.pojos.EnsTAdresse, Integer> {

    /**
     * Create a new EnsTAdresseDao without any configuration
     */
    public EnsTAdresseDao() {
        super(EnsTAdresse.ENS_T_ADRESSE, fr.cmi.jooq.tables.pojos.EnsTAdresse.class);
    }

    /**
     * Create a new EnsTAdresseDao with an attached configuration
     */
    public EnsTAdresseDao(Configuration configuration) {
        super(EnsTAdresse.ENS_T_ADRESSE, fr.cmi.jooq.tables.pojos.EnsTAdresse.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(fr.cmi.jooq.tables.pojos.EnsTAdresse object) {
        return object.getIdAdresse();
    }

    /**
     * Fetch records that have <code>id_adresse IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByIdAdresse(Integer... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.ID_ADRESSE, values);
    }

    /**
     * Fetch a unique record that has <code>id_adresse = value</code>
     */
    public fr.cmi.jooq.tables.pojos.EnsTAdresse fetchOneByIdAdresse(Integer value) {
        return fetchOne(EnsTAdresse.ENS_T_ADRESSE.ID_ADRESSE, value);
    }

    /**
     * Fetch records that have <code>id_personne IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByIdPersonne(Integer... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.ID_PERSONNE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByType(Integer... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.TYPE, values);
    }

    /**
     * Fetch records that have <code>adresse IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByAdresse(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.ADRESSE, values);
    }

    /**
     * Fetch records that have <code>code_postal IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByCodePostal(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.CODE_POSTAL, values);
    }

    /**
     * Fetch records that have <code>ville IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByVille(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.VILLE, values);
    }

    /**
     * Fetch records that have <code>telephone IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByTelephone(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.TELEPHONE, values);
    }

    /**
     * Fetch records that have <code>mobile IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByMobile(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.MOBILE, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByEmail(String... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.EMAIL, values);
    }

    /**
     * Fetch records that have <code>dernier_utilisateur IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByDernierUtilisateur(Integer... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.DERNIER_UTILISATEUR, values);
    }

    /**
     * Fetch records that have <code>date_crea IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByDateCrea(Timestamp... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.DATE_CREA, values);
    }

    /**
     * Fetch records that have <code>date_maj IN (values)</code>
     */
    public List<fr.cmi.jooq.tables.pojos.EnsTAdresse> fetchByDateMaj(Timestamp... values) {
        return fetch(EnsTAdresse.ENS_T_ADRESSE.DATE_MAJ, values);
    }
}