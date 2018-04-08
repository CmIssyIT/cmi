package fr.cmi.member.domain;

import fr.cmi.jooq.tables.EnsTPersonne;
import org.jooq.DSLContext;
import org.jooq.Record8;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import static fr.cmi.jooq.tables.EnsTClasse.ENS_T_CLASSE;
import static fr.cmi.jooq.tables.EnsTClasseEleve.ENS_T_CLASSE_ELEVE;
import static fr.cmi.jooq.tables.EnsTPersonne.ENS_T_PERSONNE;
import static fr.cmi.jooq.tables.EnsTResponsableEleve.ENS_T_RESPONSABLE_ELEVE;
import static fr.cmi.member.domain.Status.ACTIF;
import static java.util.stream.Collectors.toList;

@Repository
public class MemberRepository {

    @Autowired
    private DSLContext dsl;

    public List<Member> findAllMembers() {
        final EnsTPersonne tPersonne = EnsTPersonne.ENS_T_PERSONNE.as("A");
        final Result<Record8<Integer, String, String, Date, Integer, Integer, Integer, String>> result = dsl.
            select(ENS_T_PERSONNE.ID_PERSONNE,
            ENS_T_PERSONNE.NOM, ENS_T_PERSONNE.PRENOM, ENS_T_PERSONNE.DATE_NAISSANCE, ENS_T_PERSONNE.TYPE,
            ENS_T_PERSONNE.SEXE, ENS_T_PERSONNE.STATUT, ENS_T_CLASSE.NOM_CLASSE)
            .from(ENS_T_PERSONNE)
            //.leftJoin(ENS_T_ADRESSE).on(ENS_T_PERSONNE.ID_PERSONNE.equal(ENS_T_ADRESSE.ID_PERSONNE))
            .leftJoin(ENS_T_CLASSE_ELEVE).on(ENS_T_PERSONNE.ID_PERSONNE.equal(ENS_T_CLASSE_ELEVE.ID_ELEVE).and(ENS_T_CLASSE_ELEVE.STATUT.equal(ACTIF.getId())))
            .leftJoin(ENS_T_CLASSE).on(ENS_T_CLASSE_ELEVE.ID_CLASSE.equal(ENS_T_CLASSE.ID_CLASSE).and(ENS_T_CLASSE.STATUT.equal(ACTIF.getId())))
            .leftJoin(ENS_T_RESPONSABLE_ELEVE).on(ENS_T_PERSONNE.ID_PERSONNE.equal(ENS_T_RESPONSABLE_ELEVE.ID_ELEVE).and
                (ENS_T_RESPONSABLE_ELEVE.FLAG.equal(ACTIF.getId())))
            .leftJoin(tPersonne).on(ENS_T_RESPONSABLE_ELEVE.ID_RESPONSABLE.equal(ENS_T_PERSONNE.ID_PERSONNE).and(ENS_T_PERSONNE
                .STATUT.equal(ACTIF.getId())))
            .fetch();

        return result.stream().map(person -> Member.builder().id(person.get(ENS_T_PERSONNE.ID_PERSONNE, String.class))
            .firstName(person.get(ENS_T_PERSONNE.PRENOM)).lastName(person.get(ENS_T_PERSONNE.NOM)).role(Role.getById(person.get
                (ENS_T_PERSONNE.TYPE))).gender(Gender.getById(person.get(ENS_T_PERSONNE.SEXE))).birthDay(person.get(ENS_T_PERSONNE
                .DATE_NAISSANCE).toLocalDate()).age(ChronoUnit.YEARS.between(person.get(ENS_T_PERSONNE.DATE_NAISSANCE).toLocalDate(), LocalDate.now()))
            .status(Status.getById(person.get(ENS_T_PERSONNE.STATUT)))
            .classe(person.get(ENS_T_CLASSE.NOM_CLASSE))
            .build()).collect
            (toList());
    }
}
