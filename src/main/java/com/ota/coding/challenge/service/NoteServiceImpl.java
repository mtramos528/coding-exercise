package com.ota.coding.challenge.service;

import com.ota.coding.challenge.gateway.NoteGateway;
import com.ota.coding.challenge.mapper.NoteMapper;
import com.ota.coding.challenge.model.domain.Note;
import com.ota.coding.challenge.model.request.CreateNoteRequestDto;
import com.ota.coding.challenge.model.request.UpdateNoteRequestDto;
import com.ota.coding.challenge.model.response.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteGateway noteGateway;
    private final NoteMapper noteMapper;

    @Override
    public CreateNoteResponseDto createNote(CreateNoteRequestDto requestDto) {
        Note note = noteGateway.createNote(noteMapper.toNote(requestDto));
        return noteMapper.toCreateNoteResponse(note);
    }

    @Override
    public UpdateNoteResponseDto updateNote(String id, UpdateNoteRequestDto requestDto) {
        Note note = noteMapper.toNote(requestDto);
        note.setId(id);
        note = noteGateway.updateNote(note);
        return noteMapper.toUpdateNoteResponse(note);
    }

    @Override
    public DeleteNoteResponseDto deleteNote(String id) {
        noteGateway.deleteNote(id);
        return new DeleteNoteResponseDto("Successfully deleted record");
    }

    @Override
    public GetNoteResponseDto getNote(String id) {
        return noteMapper.toGetNoteResponse(noteGateway.getNote(id));
    }

    @Override
    public GetAllNoteResponseDto getAllNotes() {
        return new GetAllNoteResponseDto(noteMapper.toGetAllNoteResponse(noteGateway.getAllNotes()));
    }
}
