package fr.cmi.member.domain;

import java.util.EnumSet;

public enum Status {
    ACTIF(1, "Actif"), INACTIF(0, "Inactif");

    private final Integer id;
    private final String label;

    Status(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Integer getId() {
        return id;
    }

    public static Status getById(Integer value) {
        return EnumSet.allOf(Status.class)
            .stream()
            .filter(status -> status.id.equals(value))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported Status type %s.", value)));
    }
}
