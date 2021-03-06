/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTResponsableEleveRecord;

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
public class EnsTResponsableEleve extends TableImpl<EnsTResponsableEleveRecord> {

    private static final long serialVersionUID = -2124905760;

    /**
     * The reference instance of <code>enseignement.ens_t_responsable_eleve</code>
     */
    public static final EnsTResponsableEleve ENS_T_RESPONSABLE_ELEVE = new EnsTResponsableEleve();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTResponsableEleveRecord> getRecordType() {
        return EnsTResponsableEleveRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.id_res_ele</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Integer> ID_RES_ELE = createField("id_res_ele", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_responsable_eleve_id_res_ele_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.id_responsable</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Integer> ID_RESPONSABLE = createField("id_responsable", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.id_eleve</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Integer> ID_ELEVE = createField("id_eleve", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.flag</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Integer> FLAG = createField("flag", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.dernier_utilisateur</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.date_crea</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Timestamp> DATE_CREA = createField("date_crea", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_responsable_eleve.date_maj</code>.
     */
    public final TableField<EnsTResponsableEleveRecord, Timestamp> DATE_MAJ = createField("date_maj", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>enseignement.ens_t_responsable_eleve</code> table reference
     */
    public EnsTResponsableEleve() {
        this(DSL.name("ens_t_responsable_eleve"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_responsable_eleve</code> table reference
     */
    public EnsTResponsableEleve(String alias) {
        this(DSL.name(alias), ENS_T_RESPONSABLE_ELEVE);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_responsable_eleve</code> table reference
     */
    public EnsTResponsableEleve(Name alias) {
        this(alias, ENS_T_RESPONSABLE_ELEVE);
    }

    private EnsTResponsableEleve(Name alias, Table<EnsTResponsableEleveRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTResponsableEleve(Name alias, Table<EnsTResponsableEleveRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ENS_T_RESPONSABLE_ELEVE_PKEY, Indexes.FK__T_PERSONNE, Indexes.FK__T_PERSONNE_2, Indexes.RESPONSABLE_UNIQUE_ACTIF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTResponsableEleveRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_RESPONSABLE_ELEVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTResponsableEleveRecord> getPrimaryKey() {
        return Keys.ENS_T_RESPONSABLE_ELEVE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTResponsableEleveRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTResponsableEleveRecord>>asList(Keys.ENS_T_RESPONSABLE_ELEVE_PKEY, Keys.RESPONSABLE_UNIQUE_ACTIF);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EnsTResponsableEleveRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EnsTResponsableEleveRecord, ?>>asList(Keys.ENS_T_RESPONSABLE_ELEVE__FK__T_PERSONNE, Keys.ENS_T_RESPONSABLE_ELEVE__FK__T_PERSONNE_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTResponsableEleve as(String alias) {
        return new EnsTResponsableEleve(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTResponsableEleve as(Name alias) {
        return new EnsTResponsableEleve(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTResponsableEleve rename(String name) {
        return new EnsTResponsableEleve(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTResponsableEleve rename(Name name) {
        return new EnsTResponsableEleve(name, null);
    }
}
