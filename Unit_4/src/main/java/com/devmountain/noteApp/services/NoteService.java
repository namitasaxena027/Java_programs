package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    List<NoteDto> getAllNotesByUserId(Long userId);

    @Transactional
    void addNote(NoteDto noteDto, Long UserId);

    @Transactional
    void deleteNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    @Transactional
    Optional<NoteDto> getNoteById(Long noteId);
}