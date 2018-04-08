package fr.cmi.member.domain;

import java.util.EnumSet;

public enum Gender {
    MALE(1, "M"), FEMALE(2, "F");

    private final Integer id;
    private final String label;

    Gender(Integer id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public Integer getId() {
        return id;
    }

    public static Gender getById(Integer value) {
        return EnumSet.allOf(Gender.class)
            .stream()
            .filter(gender -> gender.id.equals(value))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(String.format("Unsupported Gender type %s.", value)));
    }
}
