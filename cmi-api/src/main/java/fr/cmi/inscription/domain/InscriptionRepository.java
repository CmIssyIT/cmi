package fr.cmi.inscription.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface InscriptionRepository extends CrudRepository<Inscription, Long> {

    Optional<Inscription> findByUuid(UUID uuid);
}
