/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTPersonneRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class EnsTPersonne extends TableImpl<EnsTPersonneRecord> {

    private static final long serialVersionUID = -1520247051;

    /**
     * The reference instance of <code>enseignement.ens_t_personne</code>
     */
    public static final EnsTPersonne ENS_T_PERSONNE = new EnsTPersonne();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTPersonneRecord> getRecordType() {
        return EnsTPersonneRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_personne.id_personne</code>.
     */
    public final TableField<EnsTPersonneRecord, Integer> ID_PERSONNE = createField("id_personne", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_personne_id_personne_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.type</code>.
     */
    public final TableField<EnsTPersonneRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.nom</code>.
     */
    public final TableField<EnsTPersonneRecord, String> NOM = createField("nom", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.prenom</code>.
     */
    public final TableField<EnsTPersonneRecord, String> PRENOM = createField("prenom", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.date_naissance</code>.
     */
    public final TableField<EnsTPersonneRecord, Date> DATE_NAISSANCE = createField("date_naissance", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>enseignement.ens_t_personne.sexe</code>.
     */
    public final TableField<EnsTPersonneRecord, Integer> SEXE = createField("sexe", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.dernier_utilisateur</code>.
     */
    public final TableField<EnsTPersonneRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_personne.date_crea</code>.
     */
    public final TableField<EnsTPersonneRecord, Timestamp> DATE_CREA = createField("date_crea", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.date_maj</code>.
     */
    public final TableField<EnsTPersonneRecord, Timestamp> DATE_MAJ = createField("date_maj", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_personne.statut</code>.
     */
    public final TableField<EnsTPersonneRecord, Integer> STATUT = createField("statut", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>enseignement.ens_t_personne</code> table reference
     */
    public EnsTPersonne() {
        this(DSL.name("ens_t_personne"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_personne</code> table reference
     */
    public EnsTPersonne(String alias) {
        this(DSL.name(alias), ENS_T_PERSONNE);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_personne</code> table reference
     */
    public EnsTPersonne(Name alias) {
        this(alias, ENS_T_PERSONNE);
    }

    private EnsTPersonne(Name alias, Table<EnsTPersonneRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTPersonne(Name alias, Table<EnsTPersonneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Enseignement.ENSEIGNEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ENS_T_PERSONNE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTPersonneRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_PERSONNE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTPersonneRecord> getPrimaryKey() {
        return Keys.ENS_T_PERSONNE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTPersonneRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTPersonneRecord>>asList(Keys.ENS_T_PERSONNE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTPersonne as(String alias) {
        return new EnsTPersonne(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTPersonne as(Name alias) {
        return new EnsTPersonne(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTPersonne rename(String name) {
        return new EnsTPersonne(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTPersonne rename(Name name) {
        return new EnsTPersonne(name, null);
    }
}
