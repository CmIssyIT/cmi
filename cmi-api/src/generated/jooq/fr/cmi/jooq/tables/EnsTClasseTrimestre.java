/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTClasseTrimestreRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class EnsTClasseTrimestre extends TableImpl<EnsTClasseTrimestreRecord> {

    private static final long serialVersionUID = 21380014;

    /**
     * The reference instance of <code>enseignement.ens_t_classe_trimestre</code>
     */
    public static final EnsTClasseTrimestre ENS_T_CLASSE_TRIMESTRE = new EnsTClasseTrimestre();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTClasseTrimestreRecord> getRecordType() {
        return EnsTClasseTrimestreRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.id_cla_tri</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Integer> ID_CLA_TRI = createField("id_cla_tri", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_classe_trimestre_id_cla_tri_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.id_classe</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Integer> ID_CLASSE = createField("id_classe", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.id_trimestre</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Integer> ID_TRIMESTRE = createField("id_trimestre", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.dernier_utilisateur</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.date_crea</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Timestamp> DATE_CREA = createField("date_crea", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_classe_trimestre.date_maj</code>.
     */
    public final TableField<EnsTClasseTrimestreRecord, Timestamp> DATE_MAJ = createField("date_maj", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>enseignement.ens_t_classe_trimestre</code> table reference
     */
    public EnsTClasseTrimestre() {
        this(DSL.name("ens_t_classe_trimestre"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_classe_trimestre</code> table reference
     */
    public EnsTClasseTrimestre(String alias) {
        this(DSL.name(alias), ENS_T_CLASSE_TRIMESTRE);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_classe_trimestre</code> table reference
     */
    public EnsTClasseTrimestre(Name alias) {
        this(alias, ENS_T_CLASSE_TRIMESTRE);
    }

    private EnsTClasseTrimestre(Name alias, Table<EnsTClasseTrimestreRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTClasseTrimestre(Name alias, Table<EnsTClasseTrimestreRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ENS_T_CLASSE_TRIMESTRE_PKEY, Indexes.FK_T_CLASSE_TRIMESTRE_T_CLASSE, Indexes.FK_T_CLASSE_TRIMESTRE_T_TRIMESTRE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTClasseTrimestreRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_CLASSE_TRIMESTRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTClasseTrimestreRecord> getPrimaryKey() {
        return Keys.ENS_T_CLASSE_TRIMESTRE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTClasseTrimestreRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTClasseTrimestreRecord>>asList(Keys.ENS_T_CLASSE_TRIMESTRE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EnsTClasseTrimestreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EnsTClasseTrimestreRecord, ?>>asList(Keys.ENS_T_CLASSE_TRIMESTRE__FK_T_CLASSE_TRIMESTRE_T_CLASSE, Keys.ENS_T_CLASSE_TRIMESTRE__FK_T_CLASSE_TRIMESTRE_T_TRIMESTRE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTClasseTrimestre as(String alias) {
        return new EnsTClasseTrimestre(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTClasseTrimestre as(Name alias) {
        return new EnsTClasseTrimestre(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTClasseTrimestre rename(String name) {
        return new EnsTClasseTrimestre(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTClasseTrimestre rename(Name name) {
        return new EnsTClasseTrimestre(name, null);
    }
}
