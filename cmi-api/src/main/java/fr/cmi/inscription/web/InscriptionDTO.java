package fr.cmi.inscription.web;

import java.time.LocalDate;

public class InscriptionDTO {

    private String fullName;
    private String code;
    private LocalDate schoolYear;
    private String status;
    private String type;
    private LocalDate inscriptionDate;

    public InscriptionDTO(String fullName, String code, LocalDate schoolYear, String status, String type, LocalDate inscriptionDate) {
        this.fullName = fullName;
        this.code = code;
        this.schoolYear = schoolYear;
        this.status = status;
        this.type = type;
        this.inscriptionDate = inscriptionDate;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCode() {
        return code;
    }

    public LocalDate getSchoolYear() {
        return schoolYear;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }
}
