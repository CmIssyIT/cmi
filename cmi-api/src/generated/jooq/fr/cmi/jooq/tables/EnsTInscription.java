/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq.tables;


import fr.cmi.jooq.Enseignement;
import fr.cmi.jooq.Indexes;
import fr.cmi.jooq.Keys;
import fr.cmi.jooq.tables.records.EnsTInscriptionRecord;

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
public class EnsTInscription extends TableImpl<EnsTInscriptionRecord> {

    private static final long serialVersionUID = -1656964865;

    /**
     * The reference instance of <code>enseignement.ens_t_inscription</code>
     */
    public static final EnsTInscription ENS_T_INSCRIPTION = new EnsTInscription();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnsTInscriptionRecord> getRecordType() {
        return EnsTInscriptionRecord.class;
    }

    /**
     * The column <code>enseignement.ens_t_inscription.id_enseignement</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> ID_ENSEIGNEMENT = createField("id_enseignement", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('enseignement.ens_t_inscription_id_enseignement_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.code_enseignement</code>.
     */
    public final TableField<EnsTInscriptionRecord, String> CODE_ENSEIGNEMENT = createField("code_enseignement", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.id_responsable</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> ID_RESPONSABLE = createField("id_responsable", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.libelle</code>.
     */
    public final TableField<EnsTInscriptionRecord, String> LIBELLE = createField("libelle", org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.type</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.id_ann_sco</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> ID_ANN_SCO = createField("id_ann_sco", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_enseignement</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_ENSEIGNEMENT = createField("date_enseignement", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.statut</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> STATUT = createField("statut", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_validation</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_VALIDATION = createField("date_validation", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.id_facture</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> ID_FACTURE = createField("id_facture", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_debut</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_DEBUT = createField("date_debut", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_fin</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_FIN = createField("date_fin", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.commentaire</code>.
     */
    public final TableField<EnsTInscriptionRecord, String> COMMENTAIRE = createField("commentaire", org.jooq.impl.SQLDataType.VARCHAR(300).defaultValue(org.jooq.impl.DSL.field("NULL::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.dernier_utilisateur</code>.
     */
    public final TableField<EnsTInscriptionRecord, Integer> DERNIER_UTILISATEUR = createField("dernier_utilisateur", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_crea</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_CREA = createField("date_crea", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>enseignement.ens_t_inscription.date_maj</code>.
     */
    public final TableField<EnsTInscriptionRecord, Timestamp> DATE_MAJ = createField("date_maj", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL::timestamp without time zone", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>enseignement.ens_t_inscription</code> table reference
     */
    public EnsTInscription() {
        this(DSL.name("ens_t_inscription"), null);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_inscription</code> table reference
     */
    public EnsTInscription(String alias) {
        this(DSL.name(alias), ENS_T_INSCRIPTION);
    }

    /**
     * Create an aliased <code>enseignement.ens_t_inscription</code> table reference
     */
    public EnsTInscription(Name alias) {
        this(alias, ENS_T_INSCRIPTION);
    }

    private EnsTInscription(Name alias, Table<EnsTInscriptionRecord> aliased) {
        this(alias, aliased, null);
    }

    private EnsTInscription(Name alias, Table<EnsTInscriptionRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ENS_T_INSCRIPTION_PKEY, Indexes.FK_T_ENSEIGNEMENT_T_ANNEE_SCOLAIRE, Indexes.FK_T_ENSEIGNEMENT_T_PERSONNE, Indexes.FK_T_INSCRIPTION_T_FACTURE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EnsTInscriptionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENS_T_INSCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnsTInscriptionRecord> getPrimaryKey() {
        return Keys.ENS_T_INSCRIPTION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnsTInscriptionRecord>> getKeys() {
        return Arrays.<UniqueKey<EnsTInscriptionRecord>>asList(Keys.ENS_T_INSCRIPTION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EnsTInscriptionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EnsTInscriptionRecord, ?>>asList(Keys.ENS_T_INSCRIPTION__FK_T_ENSEIGNEMENT_T_PERSONNE, Keys.ENS_T_INSCRIPTION__FK_T_ENSEIGNEMENT_T_ANNEE_SCOLAIRE, Keys.ENS_T_INSCRIPTION__FK_T_INSCRIPTION_T_FACTURE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTInscription as(String alias) {
        return new EnsTInscription(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EnsTInscription as(Name alias) {
        return new EnsTInscription(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTInscription rename(String name) {
        return new EnsTInscription(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EnsTInscription rename(Name name) {
        return new EnsTInscription(name, null);
    }
}
