package fr.cmi.inscription.web;

import fr.cmi.inscription.domain.Inscription;
import fr.cmi.inscription.domain.InscriptionRepository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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

}
