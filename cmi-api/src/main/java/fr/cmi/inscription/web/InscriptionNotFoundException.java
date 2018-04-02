package fr.cmi.inscription.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
class InscriptionNotFoundException extends RuntimeException {

    public InscriptionNotFoundException(String inscriptionId) {
        super("could not find inscription '" + inscriptionId + "'.");
    }
}
