package com.ota.coding.challenge.controller;

import com.ota.coding.challenge.model.request.CreateNoteRequestDto;
import com.ota.coding.challenge.model.request.UpdateNoteRequestDto;
import com.ota.coding.challenge.model.response.*;
import com.ota.coding.challenge.service.NoteService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/note")
public class NoteController {

    private NoteService noteService;

    @PostMapping
    public CreateNoteResponseDto createNote(@Valid @RequestBody CreateNoteRequestDto requestDto) {
        return noteService.createNote(requestDto);
    }

    @GetMapping
    public GetAllNoteResponseDto getNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("{id}")
    public GetNoteResponseDto getNote(@PathVariable String id) {
        return noteService.getNote(id);
    }

    @PutMapping("{id}")
    public UpdateNoteResponseDto updateNode(@PathVariable String id, @Valid @RequestBody UpdateNoteRequestDto requestDto) {
        return noteService.updateNote(id, requestDto);
    }

    @DeleteMapping("{id}")
    public DeleteNoteResponseDto deleteNote(@PathVariable String id) {
        return noteService.deleteNote(id);
    }
}
