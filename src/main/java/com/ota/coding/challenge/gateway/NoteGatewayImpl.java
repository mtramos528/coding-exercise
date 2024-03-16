package com.ota.coding.challenge.gateway;

import com.ota.coding.challenge.exception.InvalidNoteException;
import com.ota.coding.challenge.model.domain.Note;
import com.ota.coding.challenge.util.IdUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@Component
public class NoteGatewayImpl implements NoteGateway{

    private static final Map<String, Note> notes = new HashMap<>();
    @Override
    public Note createNote(Note note) {
        note.setId(IdUtil.generateId());
        notes.put(note.getId(), note);
        return note;
    }

    @Override
    public Note updateNote(Note note) {
        checkValidNoteId(note.getId());
        notes.put(note.getId(), note);
        return note;
    }

    @Override
    public void deleteNote(String id) {
        checkValidNoteId(id);
        notes.remove(id);
    }

    @Override
    public Note getNote(String id) {
        checkValidNoteId(id);
        return notes.get(id);
    }

    @Override
    public List<Note> getAllNotes() {
        return notes.entrySet().stream().map(
                note -> new Note(note.getKey(), note.getValue().getTitle(), note.getValue().getBody()))
                .collect(Collectors.toList());
    }

    private void checkValidNoteId(String id) {
        if (!notes.containsKey(id)) {
            throw new InvalidNoteException();
        }
    }

}
