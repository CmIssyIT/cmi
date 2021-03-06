/*
 * This file is generated by jOOQ.
*/
package fr.cmi.jooq;


import fr.cmi.jooq.tables.EnsTAdresse;
import fr.cmi.jooq.tables.EnsTAnneeScolaire;
import fr.cmi.jooq.tables.EnsTBulletin;
import fr.cmi.jooq.tables.EnsTClasse;
import fr.cmi.jooq.tables.EnsTClasseEleve;
import fr.cmi.jooq.tables.EnsTClasseMatiere;
import fr.cmi.jooq.tables.EnsTClasseTrimestre;
import fr.cmi.jooq.tables.EnsTFacture;
import fr.cmi.jooq.tables.EnsTInscription;
import fr.cmi.jooq.tables.EnsTInscriptionEleve;
import fr.cmi.jooq.tables.EnsTMatiere;
import fr.cmi.jooq.tables.EnsTModePaiement;
import fr.cmi.jooq.tables.EnsTNotes;
import fr.cmi.jooq.tables.EnsTPaiement;
import fr.cmi.jooq.tables.EnsTPersonne;
import fr.cmi.jooq.tables.EnsTResponsableEleve;
import fr.cmi.jooq.tables.EnsTTrimestre;
import fr.cmi.jooq.tables.EnsVAgePersonne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Enseignement extends SchemaImpl {

    private static final long serialVersionUID = -406712310;

    /**
     * The reference instance of <code>enseignement</code>
     */
    public static final Enseignement ENSEIGNEMENT = new Enseignement();

    /**
     * The table <code>enseignement.ens_t_adresse</code>.
     */
    public final EnsTAdresse ENS_T_ADRESSE = fr.cmi.jooq.tables.EnsTAdresse.ENS_T_ADRESSE;

    /**
     * The table <code>enseignement.ens_t_annee_scolaire</code>.
     */
    public final EnsTAnneeScolaire ENS_T_ANNEE_SCOLAIRE = fr.cmi.jooq.tables.EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE;

    /**
     * The table <code>enseignement.ens_t_bulletin</code>.
     */
    public final EnsTBulletin ENS_T_BULLETIN = fr.cmi.jooq.tables.EnsTBulletin.ENS_T_BULLETIN;

    /**
     * The table <code>enseignement.ens_t_classe</code>.
     */
    public final EnsTClasse ENS_T_CLASSE = fr.cmi.jooq.tables.EnsTClasse.ENS_T_CLASSE;

    /**
     * The table <code>enseignement.ens_t_classe_eleve</code>.
     */
    public final EnsTClasseEleve ENS_T_CLASSE_ELEVE = fr.cmi.jooq.tables.EnsTClasseEleve.ENS_T_CLASSE_ELEVE;

    /**
     * The table <code>enseignement.ens_t_classe_matiere</code>.
     */
    public final EnsTClasseMatiere ENS_T_CLASSE_MATIERE = fr.cmi.jooq.tables.EnsTClasseMatiere.ENS_T_CLASSE_MATIERE;

    /**
     * The table <code>enseignement.ens_t_classe_trimestre</code>.
     */
    public final EnsTClasseTrimestre ENS_T_CLASSE_TRIMESTRE = fr.cmi.jooq.tables.EnsTClasseTrimestre.ENS_T_CLASSE_TRIMESTRE;

    /**
     * The table <code>enseignement.ens_t_facture</code>.
     */
    public final EnsTFacture ENS_T_FACTURE = fr.cmi.jooq.tables.EnsTFacture.ENS_T_FACTURE;

    /**
     * The table <code>enseignement.ens_t_inscription</code>.
     */
    public final EnsTInscription ENS_T_INSCRIPTION = fr.cmi.jooq.tables.EnsTInscription.ENS_T_INSCRIPTION;

    /**
     * The table <code>enseignement.ens_t_inscription_eleve</code>.
     */
    public final EnsTInscriptionEleve ENS_T_INSCRIPTION_ELEVE = fr.cmi.jooq.tables.EnsTInscriptionEleve.ENS_T_INSCRIPTION_ELEVE;

    /**
     * The table <code>enseignement.ens_t_matiere</code>.
     */
    public final EnsTMatiere ENS_T_MATIERE = fr.cmi.jooq.tables.EnsTMatiere.ENS_T_MATIERE;

    /**
     * The table <code>enseignement.ens_t_mode_paiement</code>.
     */
    public final EnsTModePaiement ENS_T_MODE_PAIEMENT = fr.cmi.jooq.tables.EnsTModePaiement.ENS_T_MODE_PAIEMENT;

    /**
     * The table <code>enseignement.ens_t_notes</code>.
     */
    public final EnsTNotes ENS_T_NOTES = fr.cmi.jooq.tables.EnsTNotes.ENS_T_NOTES;

    /**
     * The table <code>enseignement.ens_t_paiement</code>.
     */
    public final EnsTPaiement ENS_T_PAIEMENT = fr.cmi.jooq.tables.EnsTPaiement.ENS_T_PAIEMENT;

    /**
     * The table <code>enseignement.ens_t_personne</code>.
     */
    public final EnsTPersonne ENS_T_PERSONNE = fr.cmi.jooq.tables.EnsTPersonne.ENS_T_PERSONNE;

    /**
     * The table <code>enseignement.ens_t_responsable_eleve</code>.
     */
    public final EnsTResponsableEleve ENS_T_RESPONSABLE_ELEVE = fr.cmi.jooq.tables.EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE;

    /**
     * The table <code>enseignement.ens_t_trimestre</code>.
     */
    public final EnsTTrimestre ENS_T_TRIMESTRE = fr.cmi.jooq.tables.EnsTTrimestre.ENS_T_TRIMESTRE;

    /**
     * The table <code>enseignement.ens_v_age_personne</code>.
     */
    public final EnsVAgePersonne ENS_V_AGE_PERSONNE = fr.cmi.jooq.tables.EnsVAgePersonne.ENS_V_AGE_PERSONNE;

    /**
     * No further instances allowed
     */
    private Enseignement() {
        super("enseignement", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ENS_T_ADRESSE_ID_ADRESSE_SEQ,
            Sequences.ENS_T_ANNEE_SCOLAIRE_ID_ANNEE_SEQ,
            Sequences.ENS_T_BULLETIN_ID_BULLETIN_SEQ,
            Sequences.ENS_T_CLASSE_ELEVE_ID_CLAS_ELEV_SEQ,
            Sequences.ENS_T_CLASSE_ID_CLASSE_SEQ,
            Sequences.ENS_T_CLASSE_MATIERE_ID_CLAS_MAT_SEQ,
            Sequences.ENS_T_CLASSE_TRIMESTRE_ID_CLA_TRI_SEQ,
            Sequences.ENS_T_FACTURE_ID_FACTURE_SEQ,
            Sequences.ENS_T_INSCRIPTION_ELEVE_ID_INSC_ELE_SEQ,
            Sequences.ENS_T_INSCRIPTION_ID_ENSEIGNEMENT_SEQ,
            Sequences.ENS_T_MATIERE_ID_MATIERE_SEQ,
            Sequences.ENS_T_MODE_PAIEMENT_ID_MODE_SEQ,
            Sequences.ENS_T_NOTES_ID_NOTE_SEQ,
            Sequences.ENS_T_PAIEMENT_ID_PAIEMENT_SEQ,
            Sequences.ENS_T_PERSONNE_ID_PERSONNE_SEQ,
            Sequences.ENS_T_RESPONSABLE_ELEVE_ID_RES_ELE_SEQ,
            Sequences.ENS_T_TRIMESTRE_ID_TRIMESTRE_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            EnsTAdresse.ENS_T_ADRESSE,
            EnsTAnneeScolaire.ENS_T_ANNEE_SCOLAIRE,
            EnsTBulletin.ENS_T_BULLETIN,
            EnsTClasse.ENS_T_CLASSE,
            EnsTClasseEleve.ENS_T_CLASSE_ELEVE,
            EnsTClasseMatiere.ENS_T_CLASSE_MATIERE,
            EnsTClasseTrimestre.ENS_T_CLASSE_TRIMESTRE,
            EnsTFacture.ENS_T_FACTURE,
            EnsTInscription.ENS_T_INSCRIPTION,
            EnsTInscriptionEleve.ENS_T_INSCRIPTION_ELEVE,
            EnsTMatiere.ENS_T_MATIERE,
            EnsTModePaiement.ENS_T_MODE_PAIEMENT,
            EnsTNotes.ENS_T_NOTES,
            EnsTPaiement.ENS_T_PAIEMENT,
            EnsTPersonne.ENS_T_PERSONNE,
            EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE,
            EnsTTrimestre.ENS_T_TRIMESTRE,
            EnsVAgePersonne.ENS_V_AGE_PERSONNE);
    }
}
