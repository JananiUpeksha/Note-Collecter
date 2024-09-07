package lk.ijse.notecollector.controller;

import lk.ijse.notecollector.dto.impl.NoteDTO;
import lk.ijse.notecollector.utill.AppUtill;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//api end point ekak kiyla
@RequestMapping("api/v1/notes")//api/-api end point ekak kiyla      v1/ - version maru weddi wens krnwa      /note - url eka resolve wena class eke name
public class NoteController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)/*json ob eka java ob ekakata map krnna one*/
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO){
        noteDTO.setNoteId(AppUtill.generateNoteId());
        return noteDTO;
    }
    public NoteDTO getSelectedNote(){
        return null;
    }
    public List<NoteDTO> getAllNote(){
        return null;
    }
    public void deleteNote(String noteId){

    }
    public void updateNote(String noteId,NoteDTO noteDTO){

    }
}
