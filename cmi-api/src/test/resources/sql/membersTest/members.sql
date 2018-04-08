
INSERT INTO enseignement.ens_t_personne (id_personne, type, nom, prenom, date_naissance, sexe, dernier_utilisateur, date_crea, date_maj, statut) VALUES (1, 0, 'lastName1', 'firstName1', '2014-04-02', 1, 1, '2018-04-02 18:17:04.519000', '2018-04-02 18:17:27.865000', 1);
INSERT INTO enseignement.ens_t_personne (id_personne, type, nom, prenom, date_naissance, sexe, dernier_utilisateur, date_crea, date_maj, statut) VALUES (2, 1, 'lastName2', 'firstName2', '1984-04-11', 1, 1, '2018-04-02 18:17:15.314000', '2018-04-02 18:17:33.385000', 1);
INSERT INTO enseignement.ens_t_personne (id_personne, type, nom, prenom, date_naissance, sexe, dernier_utilisateur, date_crea, date_maj, statut) VALUES (3, 2, 'lastName3', 'firstName3', '1981-04-02', 1, 1, '2018-04-02 18:17:19.781000', '2018-04-02 18:17:38.352000', 1);

INSERT INTO enseignement.ens_t_annee_scolaire (id_annee, libelle, date_debut, date_fin, dernier_utilisateur) VALUES (1, '2017-2018', '2018-01-02 17:46:36.641000', '2018-05-02 17:46:49.053000', '2018-04-02 17:46:56.798000');

INSERT INTO enseignement.ens_t_classe (id_classe, code_classe, nom_classe, id_annee_scolaire, id_niveau, id_responsable, statut, dernier_utilisateur, date_crea, date_maj) VALUES (1, 'AA', 'Arabe rawdati', 1, 1, 1, 1, null, '2018-04-02 17:44:33.520000', '2018-04-02 17:44:38.257000');
INSERT INTO enseignement.ens_t_classe (id_classe, code_classe, nom_classe, id_annee_scolaire, id_niveau, id_responsable, statut, dernier_utilisateur, date_crea, date_maj) VALUES (2, 'BB', 'Coran niv1', NULL, 1, 1, 1, NULL, '2018-04-08 14:42:04.315000', '2018-04-08 14:42:08.017000');


INSERT INTO enseignement.ens_t_responsable_eleve (id_res_ele, id_responsable, id_eleve, flag, dernier_utilisateur, date_crea, date_maj) VALUES (1, 3, 1, 1, NULL, '2018-04-08 14:38:02.362000', '2018-04-08 14:38:06.969000');

INSERT INTO enseignement.ens_t_classe_eleve (id_clas_elev, id_classe, id_eleve, statut, dernier_utilisateur, date_crea, date_maj) VALUES
    (1, 1, 1, 1, null, '2018-04-02 17:53:41.146000', '2018-04-02 17:53:44.177000');
