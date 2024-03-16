package com.ota.coding.challenge.gateway;

import com.ota.coding.challenge.model.domain.Note;

import java.util.List;

public interface NoteGateway {

    Note createNote(Note note);
    Note updateNote(Note note);
    void deleteNote(String id);
    Note getNote(String id);
    List<Note> getAllNotes();
}
