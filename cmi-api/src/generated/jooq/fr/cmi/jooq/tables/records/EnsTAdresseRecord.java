/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables.records;


import fr.cmi.jooq.tables.EnsTAdresse;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EnsTAdresseRecord extends UpdatableRecordImpl<EnsTAdresseRecord> implements Record12<Integer, Integer, Integer, String, String, String, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -280097713;

    /**
     * Setter for <code>enseignement.ens_t_adresse.id_adresse</code>.
     */
    public EnsTAdresseRecord setIdAdresse(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.id_adresse</code>.
     */
    public Integer getIdAdresse() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.id_personne</code>.
     */
    public EnsTAdresseRecord setIdPersonne(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.id_personne</code>.
     */
    public Integer getIdPersonne() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.type</code>.
     */
    public EnsTAdresseRecord setType(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.type</code>.
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.adresse</code>.
     */
    public EnsTAdresseRecord setAdresse(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.adresse</code>.
     */
    public String getAdresse() {
        return (String) get(3);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.code_postal</code>.
     */
    public EnsTAdresseRecord setCodePostal(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.code_postal</code>.
     */
    public String getCodePostal() {
        return (String) get(4);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.ville</code>.
     */
    public EnsTAdresseRecord setVille(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.ville</code>.
     */
    public String getVille() {
        return (String) get(5);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.telephone</code>.
     */
    public EnsTAdresseRecord setTelephone(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.telephone</code>.
     */
    public String getTelephone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.mobile</code>.
     */
    public EnsTAdresseRecord setMobile(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.mobile</code>.
     */
    public String getMobile() {
        return (String) get(7);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.email</code>.
     */
    public EnsTAdresseRecord setEmail(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.email</code>.
     */
    public String getEmail() {
        return (String) get(8);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.dernier_utilisateur</code>.
     */
    public EnsTAdresseRecord setDernierUtilisateur(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.dernier_utilisateur</code>.
     */
    public Integer getDernierUtilisateur() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.date_crea</code>.
     */
    public EnsTAdresseRecord setDateCrea(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.date_crea</code>.
     */
    public Timestamp getDateCrea() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>enseignement.ens_t_adresse.date_maj</code>.
     */
    public EnsTAdresseRecord setDateMaj(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>enseignement.ens_t_adresse.date_maj</code>.
     */
    public Timestamp getDateMaj() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, String, String, String, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, String, String, String, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return EnsTAdresse.ENS_T_ADRESSE.ID_ADRESSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return EnsTAdresse.ENS_T_ADRESSE.ID_PERSONNE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return EnsTAdresse.ENS_T_ADRESSE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EnsTAdresse.ENS_T_ADRESSE.ADRESSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EnsTAdresse.ENS_T_ADRESSE.CODE_POSTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return EnsTAdresse.ENS_T_ADRESSE.VILLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return EnsTAdresse.ENS_T_ADRESSE.TELEPHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return EnsTAdresse.ENS_T_ADRESSE.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return EnsTAdresse.ENS_T_ADRESSE.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return EnsTAdresse.ENS_T_ADRESSE.DERNIER_UTILISATEUR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return EnsTAdresse.ENS_T_ADRESSE.DATE_CREA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return EnsTAdresse.ENS_T_ADRESSE.DATE_MAJ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdAdresse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getIdPersonne();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAdresse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCodePostal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getVille();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getDernierUtilisateur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getDateCrea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getDateMaj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdAdresse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIdPersonne();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAdresse();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCodePostal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getVille();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTelephone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getDernierUtilisateur();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getDateCrea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getDateMaj();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value1(Integer value) {
        setIdAdresse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value2(Integer value) {
        setIdPersonne(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value4(String value) {
        setAdresse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value5(String value) {
        setCodePostal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value6(String value) {
        setVille(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value7(String value) {
        setTelephone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value8(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value9(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value10(Integer value) {
        setDernierUtilisateur(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value11(Timestamp value) {
        setDateCrea(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord value12(Timestamp value) {
        setDateMaj(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTAdresseRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9, Integer value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EnsTAdresseRecord
     */
    public EnsTAdresseRecord() {
        super(EnsTAdresse.ENS_T_ADRESSE);
    }

    /**
     * Create a detached, initialised EnsTAdresseRecord
     */
    public EnsTAdresseRecord(Integer idAdresse, Integer idPersonne, Integer type, String adresse, String codePostal, String ville, String telephone, String mobile, String email, Integer dernierUtilisateur, Timestamp dateCrea, Timestamp dateMaj) {
        super(EnsTAdresse.ENS_T_ADRESSE);

        set(0, idAdresse);
        set(1, idPersonne);
        set(2, type);
        set(3, adresse);
        set(4, codePostal);
        set(5, ville);
        set(6, telephone);
        set(7, mobile);
        set(8, email);
        set(9, dernierUtilisateur);
        set(10, dateCrea);
        set(11, dateMaj);
    }
}