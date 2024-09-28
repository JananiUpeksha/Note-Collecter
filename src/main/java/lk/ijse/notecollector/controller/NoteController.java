package lk.ijse.notecollector.controller;

import lk.ijse.notecollector.dto.impl.NoteDTO;
import lk.ijse.notecollector.service.NoteService;
import lk.ijse.notecollector.service.NoteServiceImpl;
import lk.ijse.notecollector.utill.AppUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//api end point ekak kiyla
@RequestMapping("api/v1/notes")//api/-api end point ekak kiyla      v1/ - version maru weddi wens krnwa      /note - url eka resolve wena class eke name
public class NoteController  {
    @Autowired /*Interface ekak inject kranna*/
    private NoteService noteService;/*run time ekedi impl class eka provid krnwa*/
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)/*json ob eka java ob ekakata map krnna one*/
    public NoteDTO saveNote(@RequestBody NoteDTO noteDTO){
        /*var noteServiceImpl = new NoteServiceImpl(); Methnadi gththe impl eka end point athule hduwama eka endpoint eken ekata ai hdnna ne*/
        /*noteServiceImpl.saveNote(noteDTO);argument eka meka methna thma me welawe pass krna actual valu eka thiyenne*/
        return noteService.saveNote(noteDTO);
    }
    public NoteDTO getSelectedNote(){
        return null;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<NoteDTO> getAllNote(){
        return noteService.getAllNotes();
    }
    public void deleteNote(String noteId){

    }
    public void updateNote(String noteId,NoteDTO noteDTO){

    }
}
