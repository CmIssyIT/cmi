/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTModePaiementRecord;

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
public class EnsTModePaiement extends TableImpl<EnsTModePaiementRecord> {

    private static final long serialVersionUID = 869229230;

    /**
     * The reference instance of <code>enseignement.ens_t_mode_paiement</code>
     */
    public static final EnsTModePaiement ENS_T_MODE_PAIEMENT = new EnsTModePaiement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTModePaiementRecord> getRecordType() {
        return EnsTModePaiementRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_mode_paiement.id_mode</code>.
     */
    public final TableField<EnsTModePaiementRecord, Integer> ID_MODE = createField("id_mode", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_mode_paiement_id_mode_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_mode_paiement.libelle</code>.
     */
    public final TableField<EnsTModePaiementRecord, String> LIBELLE = createField("libelle", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_mode_paiement.statut</code>.
     */
    public final TableField<EnsTModePaiementRecord, Integer> STATUT = createField("statut", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_mode_paiement.dernier_utilisateur</code>.
     */
    public final TableField<EnsTModePaiementRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>enseignement.ens_t_mode_paiement</code> table reference
     */
    public EnsTModePaiement() {
        this(DSL.name("ens_t_mode_paiement"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_mode_paiement</code> table reference
     */
    public EnsTModePaiement(String alias) {
        this(DSL.name(alias), ENS_T_MODE_PAIEMENT);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_mode_paiement</code> table reference
     */
    public EnsTModePaiement(Name alias) {
        this(alias, ENS_T_MODE_PAIEMENT);
    }

    private EnsTModePaiement(Name alias, Table<EnsTModePaiementRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTModePaiement(Name alias, Table<EnsTModePaiementRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ENS_T_MODE_PAIEMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTModePaiementRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_MODE_PAIEMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTModePaiementRecord> getPrimaryKey() {
        return Keys.ENS_T_MODE_PAIEMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTModePaiementRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTModePaiementRecord>>asList(Keys.ENS_T_MODE_PAIEMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTModePaiement as(String alias) {
        return new EnsTModePaiement(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTModePaiement as(Name alias) {
        return new EnsTModePaiement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTModePaiement rename(String name) {
        return new EnsTModePaiement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTModePaiement rename(Name name) {
        return new EnsTModePaiement(name, null);
    }
}
