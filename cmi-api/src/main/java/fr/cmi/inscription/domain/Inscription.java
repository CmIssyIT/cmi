package fr.cmi.inscription.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Inscription extends AbstractPersistable<Long> {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    public Inscription() {
        // Keep for JPA
    }

    public Inscription(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
