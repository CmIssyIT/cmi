/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTMatiereRecord;

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
public class EnsTMatiere extends TableImpl<EnsTMatiereRecord> {

    private static final long serialVersionUID = 1231995031;

    /**
     * The reference instance of <code>enseignement.ens_t_matiere</code>
     */
    public static final EnsTMatiere ENS_T_MATIERE = new EnsTMatiere();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTMatiereRecord> getRecordType() {
        return EnsTMatiereRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_matiere.id_matiere</code>.
     */
    public final TableField<EnsTMatiereRecord, Integer> ID_MATIERE = createField("id_matiere", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_matiere_id_matiere_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.code_matiere</code>.
     */
    public final TableField<EnsTMatiereRecord, String> CODE_MATIERE = createField("code_matiere", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.nom</code>.
     */
    public final TableField<EnsTMatiereRecord, String> NOM = createField("nom", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.coef</code>.
     */
    public final TableField<EnsTMatiereRecord, Integer> COEF = createField("coef", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.dernier_utilisateur</code>.
     */
    public final TableField<EnsTMatiereRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.date_crea</code>.
     */
    public final TableField<EnsTMatiereRecord, Timestamp> DATE_CREA = createField("date_crea", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_matiere.date_maj</code>.
     */
    public final TableField<EnsTMatiereRecord, Timestamp> DATE_MAJ = createField("date_maj", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>enseignement.ens_t_matiere</code> table reference
     */
    public EnsTMatiere() {
        this(DSL.name("ens_t_matiere"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_matiere</code> table reference
     */
    public EnsTMatiere(String alias) {
        this(DSL.name(alias), ENS_T_MATIERE);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_matiere</code> table reference
     */
    public EnsTMatiere(Name alias) {
        this(alias, ENS_T_MATIERE);
    }

    private EnsTMatiere(Name alias, Table<EnsTMatiereRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTMatiere(Name alias, Table<EnsTMatiereRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ENS_T_MATIERE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTMatiereRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_MATIERE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTMatiereRecord> getPrimaryKey() {
        return Keys.ENS_T_MATIERE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTMatiereRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTMatiereRecord>>asList(Keys.ENS_T_MATIERE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTMatiere as(String alias) {
        return new EnsTMatiere(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTMatiere as(Name alias) {
        return new EnsTMatiere(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTMatiere rename(String name) {
        return new EnsTMatiere(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTMatiere rename(Name name) {
        return new EnsTMatiere(name, null);
    }
}