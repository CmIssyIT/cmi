package fr.cmi.inscription.web;

import fr.cmi.inscription.domain.Inscription;
import fr.cmi.inscription.domain.InscriptionRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/inscriptions")
@Validated
public class InscriptionController {

    private final InscriptionRepository inscriptionRepository;

    public InscriptionController(InscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    @GetMapping
    public Iterable<Inscription> findAll() {
        return inscriptionRepository.findAll();
    }

    @PostMapping
    public Inscription createInscription(@Valid @RequestBody Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @GetMapping("/{id}")
    public Inscription getInscriptionById(@PathVariable UUID id) {
        return this.inscriptionRepository.findByUuid(id).orElseThrow(() -> new InscriptionNotFoundException(id.toString()));
    }

    private void validateInscription(UUID inscriptionUUID) {
        this.inscriptionRepository.findByUuid(inscriptionUUID).orElseThrow(
            () -> new InscriptionNotFoundException(inscriptionUUID.toString()));
    }
}
