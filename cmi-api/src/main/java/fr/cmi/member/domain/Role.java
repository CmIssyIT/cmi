package fr.cmi.member.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.EnumSet;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Role {
    ELEVE(0, "Elève"), ENSEIGNANT(1, "Enseignant"), RESPONSABLE_ELEVE(2, "Responsable d'élève");

    private final Integer id;

    private final String label;

    Role(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public static Role getById(Integer value) {
        return EnumSet.allOf(Role.class)
            .stream()
            .filter(role -> role.id.equals(value))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported Role type %s.", value)));
    }
}
