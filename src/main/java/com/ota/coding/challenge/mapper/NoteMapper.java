package com.ota.coding.challenge.mapper;

import com.ota.coding.challenge.model.domain.Note;
import com.ota.coding.challenge.model.request.CreateNoteRequestDto;
import com.ota.coding.challenge.model.request.UpdateNoteRequestDto;
import com.ota.coding.challenge.model.response.CreateNoteResponseDto;
import com.ota.coding.challenge.model.response.GetAllNoteResponseDto;
import com.ota.coding.challenge.model.response.GetNoteResponseDto;
import com.ota.coding.challenge.model.response.UpdateNoteResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    Note toNote(CreateNoteRequestDto requestDto);
    Note toNote(UpdateNoteRequestDto requestDto);

    CreateNoteResponseDto toCreateNoteResponse(Note note);
    UpdateNoteResponseDto toUpdateNoteResponse(Note note);
    GetNoteResponseDto toGetNoteResponse(Note note);
    List<GetAllNoteResponseDto.NoteResponse> toGetAllNoteResponse(List<Note> notes);
}
