package com.projet9.Note.Domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("noteList")
public class Note {

    @Transient
    public static final String SEQUENCE_NAME = "note_sequence";
    @Id
    private long idNote;
    private Date messageDate;
    private long idPatient;

    private String message;

    public Note() {
    }

    public Note(long idNote, Date messageDate, long idPatient, String message) {
        this.idNote = idNote;
        this.messageDate = messageDate;
        this.idPatient = idPatient;
        this.message = message;
    }

    public long getIdNote() {
        return idNote;
    }

    public void setIdNote(long idNote) {
        this.idNote = idNote;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
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
