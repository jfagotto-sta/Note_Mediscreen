package com.projet9.Note.Domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

public class NoteDTO {

    private long idPatient;

    private String message;

    public NoteDTO() {
    }

    public NoteDTO(long idPatient, String message) {
        this.idPatient = idPatient;
        this.message = message;
    }

    public long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(long idPatient) {
        this.idPatient = idPatient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
