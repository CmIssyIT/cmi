package fr.cmi.inscription.domain;

import fr.cmi.inscription.domain.Inscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {

}
