package com.ota.coding.challenge.service;

import com.ota.coding.challenge.model.request.CreateNoteRequestDto;
import com.ota.coding.challenge.model.request.UpdateNoteRequestDto;
import com.ota.coding.challenge.model.response.*;

public interface NoteService {

    CreateNoteResponseDto createNote(CreateNoteRequestDto note);
    UpdateNoteResponseDto updateNote(String id, UpdateNoteRequestDto note);
    DeleteNoteResponseDto deleteNote(String id);
    GetNoteResponseDto getNote(String id);
    GetAllNoteResponseDto getAllNotes();
}
