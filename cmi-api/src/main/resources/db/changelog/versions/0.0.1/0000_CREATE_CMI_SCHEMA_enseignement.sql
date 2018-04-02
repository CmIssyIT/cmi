SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = ON;
SET check_function_bodies = FALSE;
SET client_min_messages = WARNING;
SET default_with_oids = FALSE;

DROP SCHEMA IF EXISTS enseignement CASCADE;
CREATE SCHEMA enseignement;
-- ddl-end --
ALTER SCHEMA enseignement OWNER TO cmi;
-- ddl-end --
COMMENT ON SCHEMA enseignement IS 'CM Issy';
-- ddl-end --

SET search_path TO enseignement, public;


--USE `CMI`;

-- Export de la structure de la procédure CMI. ENS_PS_Personne_Select
/*DELIMITER //
CREATE DEFINER=`root`@`192.168.20.19` PROCEDURE `ENS_PS_Personne_Select`(
	IN `nom_ou_prenom` VARCHAR(50)

)
BEGIN

 select CONCAT(a.nom ,' ' , a.prenom) nom_prenom,date_naissance,b.age,
 case when type=1 then 'Elève'
 when type=2 then 'Enseignant'
 when type=3 then 'Résponsable élève'
 else 'Autre'
 end role,
 case when sexe=1 then 'M'
 when sexe= 2 then 'F'
 else
 ''
 end sexe
 ,d.nom_classe
 ,case when a.statut=1 then 'Actif' else 'Inactif' end statut
 from ENS_T_Personne a left join ENS_V_Age_Personne b on a.id_personne=b.id_personne
 left join ENS_T_Classe_Eleve c on a.id_personne=c.id_eleve and c.statut=1
 left join ENS_T_Classe d on c.id_classe=d.id_classe and d.statut=1
 where (a.nom LIKE concat('%',nom_ou_prenom,'%') OR a.prenom LIKE concat('%',nom_ou_prenom,'%' ));


END//
DELIMITER ;
**/

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Personne

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Personne (
    id_personne serial NOT NULL,
    type int default '1' ,
    nom varchar(50) default NULL,
    prenom varchar(50) default NULL,
    date_naissance date default NULL,
    sexe int default '1' ,
    dernier_utilisateur int default NULL ,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    statut int default '1' ,
    PRIMARY KEY  (id_personne)
)   ;
-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Matiere

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Matiere (
    id_matiere serial NOT NULL,
    code_matiere varchar(50) default NULL ,
    nom varchar(50) default NULL,
    coef int default '1' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_matiere)
)   ;

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Trimestre

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Trimestre (
    id_trimestre serial NOT NULL,
    libelle varchar(50) default NULL,
    date_debut timestamp(0) default NULL,
    date_fin timestamp(0) default NULL,
    dernier_utilisateur int default NULL,
    PRIMARY KEY  (id_trimestre)
)   ;

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la vue CMI. ENS_V_Age_Personne
-- Création d'une table temporaire pour palier aux erreurs de dépendances de VIEW
CREATE TABLE enseignement.ENS_V_Age_Personne (
    id_personne INT NOT NULL,
    age DECIMAL(7,0) NULL
) ;

-- Export de la structure de la table CMI. ENS_T_Adresse
CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Adresse (
    id_adresse serial NOT NULL,
    id_personne int default NULL,
    type int default '1' ,
    adresse varchar(200) default NULL,
    code_postal varchar(5) default NULL,
    ville varchar(50) default NULL,
    telephone varchar(20) default NULL,
    mobile varchar(20) default NULL,
    email varchar(50) default NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_adresse),
    CONSTRAINT FK_T_Adresse_T_Personne FOREIGN KEY (id_personne) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK_T_Adresse_T_Personne ON enseignement.ENS_T_Adresse (id_personne);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Annee_Scolaire

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Annee_Scolaire (
    id_annee serial NOT NULL,
    libelle varchar(50) default NULL,
    date_debut timestamp(0) default NULL,
    date_fin timestamp(0) default NULL,
    dernier_utilisateur timestamp(0) default NULL,
    PRIMARY KEY  (id_annee)
)   ;

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Bulletin

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Bulletin (
    id_bulletin serial NOT NULL,
    id_eleve int default NULL,
    id_annee_sco int default NULL,
    id_trimestre int default NULL,
    moyenne double precision default NULL,
    mention varchar(50) default NULL,
    statut int default '0' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_bulletin)
    ,
    CONSTRAINT FK_T_Bulletin_T_Annee_Scolaire FOREIGN KEY (id_annee_sco) REFERENCES enseignement.ENS_T_Annee_Scolaire (id_annee),
    CONSTRAINT FK_T_Bulletin_T_Personne FOREIGN KEY (id_eleve) REFERENCES enseignement.ENS_T_Personne (id_personne),
    CONSTRAINT FK_T_Bulletin_T_Trimestre FOREIGN KEY (id_trimestre) REFERENCES enseignement.ENS_T_Trimestre (id_trimestre)
)  ;

CREATE INDEX FK_T_Bulletin_T_Personne ON enseignement.ENS_T_Bulletin (id_eleve);
CREATE INDEX FK_T_Bulletin_T_Annee_Scolaire ON enseignement.ENS_T_Bulletin (id_annee_sco);
CREATE INDEX FK_T_Bulletin_T_Trimestre ON enseignement.ENS_T_Bulletin (id_trimestre);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Classe

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Classe (
    id_classe serial NOT NULL,
    code_classe varchar(50) default NULL ,
    nom_classe varchar(50) default NULL,
    id_annee_scolaire int default NULL,
    id_niveau int default NULL,
    id_responsable int default NULL,
    statut int default '1' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_classe)
    ,
    CONSTRAINT FK_T_Classe_T_Annee_Scolaire FOREIGN KEY (id_annee_scolaire) REFERENCES enseignement.ENS_T_Annee_Scolaire (id_annee),
    CONSTRAINT FK_T_Classe_T_Personne FOREIGN KEY (id_responsable) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK_T_Classe_T_Personne ON enseignement.ENS_T_Classe (id_responsable);
CREATE INDEX FK_T_Classe_T_Annee_Scolaire ON enseignement.ENS_T_Classe (id_annee_scolaire);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Classe_Eleve

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Classe_Eleve (
    id_clas_elev serial NOT NULL,
    id_classe int default NULL,
    id_eleve int default NULL,
    statut int default '1' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_clas_elev)
    ,
    CONSTRAINT FK_T_Classe_Eleve_T_Classe FOREIGN KEY (id_classe) REFERENCES enseignement.ENS_T_Classe (id_classe),
    CONSTRAINT FK_T_Classe_Eleve_T_Personne FOREIGN KEY (id_eleve) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK_T_Classe_Eleve_T_Classe ON enseignement.ENS_T_Classe_Eleve (id_classe);
CREATE INDEX FK_T_Classe_Eleve_T_Personne ON enseignement.ENS_T_Classe_Eleve (id_eleve);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Classe_Matiere

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Classe_Matiere (
    id_clas_mat serial NOT NULL,
    id_classe int default NULL,
    id_matiere int default NULL,
    flag int default NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_clas_mat)
    ,
    CONSTRAINT FK_T_Classe_Matiere_T_Classe FOREIGN KEY (id_classe) REFERENCES enseignement.ENS_T_Classe (id_classe),
    CONSTRAINT FK_T_Classe_Matiere_T_Matiere FOREIGN KEY (id_matiere) REFERENCES enseignement.ENS_T_Matiere (id_matiere)
)   ;


CREATE INDEX FK_T_Classe_Matiere_T_Classe ON enseignement.ENS_T_Classe_Matiere (id_classe);
CREATE INDEX FK_T_Classe_Matiere_T_Matiere ON enseignement.ENS_T_Classe_Matiere (id_matiere);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Classe_Trimestre

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Classe_Trimestre (
    id_cla_tri serial NOT NULL,
    id_classe int default NULL,
    id_trimestre int default NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_cla_tri)
    ,
    CONSTRAINT FK_T_Classe_Trimestre_T_Classe FOREIGN KEY (id_classe) REFERENCES enseignement.ENS_T_Classe (id_classe),
    CONSTRAINT FK_T_Classe_Trimestre_T_Trimestre FOREIGN KEY (id_trimestre) REFERENCES enseignement.ENS_T_Trimestre (id_trimestre)
)  ;

CREATE INDEX FK_T_Classe_Trimestre_T_Classe ON enseignement.ENS_T_Classe_Trimestre (id_classe);
CREATE INDEX FK_T_Classe_Trimestre_T_Trimestre ON enseignement.ENS_T_Classe_Trimestre (id_trimestre);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Facture

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Facture (
    id_facture serial NOT NULL,
    date_facture date default NULL,
    montant double precision default NULL,
    statut int default '1' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_facture)
)   ;

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Inscription

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Inscription (
    id_enseignement serial NOT NULL,
    code_enseignement varchar(50) default NULL ,
    id_responsable int default NULL ,
    libelle varchar(50) default NULL ,
    type int default '1' ,
    id_ann_sco int default NULL ,
    date_enseignement timestamp(0) default NULL,
    statut int default '0' ,
    date_validation timestamp(0) default NULL,
    id_facture int default NULL ,
    date_debut timestamp(0) default NULL,
    date_fin timestamp(0) default NULL,
    commentaire varchar(300) default NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_enseignement)
    ,
    CONSTRAINT FK_T_enseignement_T_Annee_Scolaire FOREIGN KEY (id_ann_sco) REFERENCES enseignement.ENS_T_Annee_Scolaire (id_annee),
    CONSTRAINT FK_T_Inscription_T_Facture FOREIGN KEY (id_facture) REFERENCES enseignement.ENS_T_Facture (id_facture),
    CONSTRAINT FK_T_enseignement_T_Personne FOREIGN KEY (id_responsable) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK_T_enseignement_T_Personne ON enseignement.ENS_T_Inscription (id_responsable);
CREATE INDEX FK_T_enseignement_T_Annee_Scolaire ON enseignement.ENS_T_Inscription (id_ann_sco);
CREATE INDEX FK_T_Inscription_T_Facture ON enseignement.ENS_T_Inscription (id_facture);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Inscription_eleve

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Inscription_eleve (
    id_insc_ele serial NOT NULL,
    id_eleve int default NULL,
    id_enseignement int default NULL,
    dernier_utilisateur int default NULL,
    date_maj timestamp(0) default NULL,
    date_crea timestamp(0) default NULL,
    PRIMARY KEY  (id_insc_ele)
    ,
    CONSTRAINT FK_T_Inscription_eleve_T_Inscription FOREIGN KEY (id_enseignement) REFERENCES enseignement.ENS_T_Inscription (id_enseignement),
    CONSTRAINT FK_T_Inscription_eleve_T_Personne FOREIGN KEY (id_eleve) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK_T_Inscription_eleve_T_Personne ON enseignement.ENS_T_Inscription_eleve (id_eleve);
CREATE INDEX FK_T_Inscription_eleve_T_Inscription ON enseignement.ENS_T_Inscription_eleve (id_enseignement);


-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Mode_Paiement

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Mode_Paiement (
    id_mode serial NOT NULL,
    libelle varchar(50) default NULL,
    statut int default '1' ,
    dernier_utilisateur int default NULL,
    PRIMARY KEY  (id_mode)
)   ;

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Notes

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Notes (
    id_note serial NOT NULL,
    id_eleve int default NULL,
    id_trimestre int default NULL,
    id_classe int default NULL,
    id_matiere int default NULL,
    valeur double precision default NULL,
    date_note timestamp(0) default NULL,
    remarque varchar(50) default NULL,
    flag int default '0' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_note)
    ,
    CONSTRAINT FK_T_Notes_T_Classe FOREIGN KEY (id_classe) REFERENCES enseignement.ENS_T_Classe (id_classe),
    CONSTRAINT FK_T_Notes_T_Matiere FOREIGN KEY (id_matiere) REFERENCES enseignement.ENS_T_Matiere (id_matiere),
    CONSTRAINT FK_T_Notes_T_Personne FOREIGN KEY (id_eleve) REFERENCES enseignement.ENS_T_Personne (id_personne),
    CONSTRAINT FK_T_Notes_T_Trimestre FOREIGN KEY (id_trimestre) REFERENCES enseignement.ENS_T_Trimestre (id_trimestre)
)  ;

CREATE INDEX FK_T_Notes_T_Personne ON enseignement.ENS_T_Notes (id_eleve);
CREATE INDEX FK_T_Notes_T_Trimestre ON enseignement.ENS_T_Notes (id_trimestre);
CREATE INDEX FK_T_Notes_T_Classe ON enseignement.ENS_T_Notes (id_classe);
CREATE INDEX FK_T_Notes_T_Matiere ON enseignement.ENS_T_Notes (id_matiere);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Paiement

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Paiement (
    id_paiement serial NOT NULL,
    id_facture int default NULL,
    montant double precision default NULL,
    date_paiement timestamp(0) default NULL,
    mode_paiement int default NULL,
    commentaire varchar(300) default NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_paiement)
    ,
    CONSTRAINT FK_T_Paiement_T_Facture FOREIGN KEY (id_facture) REFERENCES enseignement.ENS_T_Facture (id_facture),
    CONSTRAINT FK_T_Paiement_T_Paiement FOREIGN KEY (mode_paiement) REFERENCES enseignement.ENS_T_Mode_Paiement (id_mode)
)   ;

CREATE INDEX FK_T_Paiement_T_Facture ON enseignement.ENS_T_Paiement (id_facture);
CREATE INDEX FK_T_Paiement_T_Paiement ON enseignement.ENS_T_Paiement (mode_paiement);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Presence
CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Presence (
    id_presence serial NOT NULL,
    id_personne int default NULL,
    id_classe_matiere int default NULL ,
    date_debut DATETIME default NULL,
    date_fin DATETIME NULL DEFAULT NULL,
    statut int default '1' ,
    commentaire varchar(300) default NULL,
    date_notification DATETIME NULL DEFAULT NULL,
    type_notification INT NULL DEFAULT NULL,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    type_notification INT NULL,
    PRIMARY KEY  (id_presence)
    ,
    CONSTRAINT FK_T_Presence_T_Classe_Matiere FOREIGN KEY (id_classe_matiere) REFERENCES enseignement.ENS_T_Classe_Matiere (id_clas_mat),
    CONSTRAINT FK_T_Presence_T_Personne FOREIGN KEY (id_personne) REFERENCES enseignement.ENS_T_Personne (id_personne)
)  ;


comment on column enseignement.ENS_T_Presence.type_notification is '1 mail, 2 sms, 3 mail et sms';
CREATE INDEX FK_T_Presence_T_Personne ON enseignement.ENS_T_Presence (id_personne);
CREATE INDEX FK_T_Presence_T_Classe_Matiere ON enseignement.ENS_T_Presence (id_classe_matiere);

-- Les données exportées n'étaient pas sélectionnées.
-- Export de la structure de la table CMI. ENS_T_Responsable_Eleve

CREATE TABLE IF NOT EXISTS enseignement.ENS_T_Responsable_Eleve (
    id_Res_Ele serial NOT NULL,
    id_responsable int default NULL,
    id_eleve int default NULL,
    flag int NOT NULL default '1' ,
    dernier_utilisateur int default NULL,
    date_crea timestamp(0) default NULL,
    date_maj timestamp(0) default NULL,
    PRIMARY KEY  (id_Res_Ele)
    ,
    CONSTRAINT FK__T_Personne FOREIGN KEY (id_responsable) REFERENCES enseignement.ENS_T_Personne (id_personne),
    CONSTRAINT FK__T_Personne_2 FOREIGN KEY (id_eleve) REFERENCES enseignement.ENS_T_Personne (id_personne)
)   ;

CREATE INDEX FK__T_Personne ON enseignement.ENS_T_Responsable_Eleve (id_responsable);
CREATE INDEX FK__T_Personne_2 ON enseignement.ENS_T_Responsable_Eleve (id_eleve);

ALTER TABLE enseignement.ENS_T_Bulletin
    ADD COLUMN id_classe INT NULL,
ADD CONSTRAINT FK_ENS_T_Bulletin_ENS_T_Classe FOREIGN KEY (id_classe) REFERENCES enseignement.ENS_T_Classe (id_classe);

ALTER TABLE enseignement.ENS_T_Classe_Eleve
    ADD CONSTRAINT classe_unique_active UNIQUE  (id_classe, id_eleve );

ALTER TABLE enseignement.ENS_T_Responsable_Eleve
    ADD CONSTRAINT responsable_unique_actif UNIQUE  (id_responsable, id_eleve);

ALTER TABLE enseignement.ENS_T_Adresse
    ADD CONSTRAINT adresse_unique UNIQUE  (id_personne, type);


-- Export de la structure de la vue CMI. ENS_V_Age_Personne
-- Suppression de la table temporaire et création finale de la structure d'une vue
--DROP TABLE IF EXISTS ENS_V_Age_Personne;
--CREATE   VIEW ENS_V_Age_Personne AS select ENS_T_Personne.id_personne AS `id_personne`,round(((to_days(curdate()) - to_days
--(ENS_T_Personne.date_naissance)) / 365),0) AS `age` from ENS_T_Personne;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
