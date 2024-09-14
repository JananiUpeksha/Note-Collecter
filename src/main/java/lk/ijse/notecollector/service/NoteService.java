package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dto.impl.NoteDTO;

import java.util.List;

public interface NoteService {
    NoteDTO saveNote(NoteDTO noteDTO);
    List<NoteDTO> getAllNotes();
    NoteDTO getNote(String noteId);
    boolean deleteNote(String noteID);
    boolean updateNote(String noteId, NoteDTO noteDTO);

}
