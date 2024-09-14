package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dto.impl.NoteDTO;
import lk.ijse.notecollector.utill.AppUtill;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service/*@comonent meta anotate krla thiynwa methnath meke sservice class wla functions thiynwa ethkota thma eya spring wlin mng krnne*/
public class NoteServiceImpl implements NoteService{
    private static List<NoteDTO> noteDTOList = new ArrayList<>();
    public NoteServiceImpl(){
        noteDTOList.add(new NoteDTO("NOTE-b9a081bb-d861-49d6-a655-02a898231cbb","Title1","desc1",
                "date1","level1","userid1"));
        noteDTOList.add(new NoteDTO("NOTE-b9a081bb-d861-49d6-a655-02a898231ccb","Title2","desc2",
                "date","level2","userid2"));
        noteDTOList.add(new NoteDTO("NOTE-b9a081bb-d861-49d6-a655-02a898231cdb","Title3","desc3",
                "date","level3","userid3"));
        noteDTOList.add(new NoteDTO("NOTE-b9a081bb-d861-49d6-a655-02a898231ceb","Title4","desc4",
                "date","level4","userid4"));
    }
    @Override
    public NoteDTO saveNote(NoteDTO noteDTO) {
        noteDTO.setNoteId(AppUtill.generateNoteId());
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAllNotes() {
        return noteDTOList;
    }

    @Override
    public NoteDTO getNote(String noteId) {
        return null;
    }

    @Override
    public boolean deleteNote(String noteID) {
        return false;
    }

    @Override
    public boolean updateNote(String noteId, NoteDTO noteDTO) {
        return false;
    }
}
