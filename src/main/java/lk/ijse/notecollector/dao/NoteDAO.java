package lk.ijse.notecollector.dao;

import lk.ijse.notecollector.entity.impl.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteDAO extends JpaRepository<NoteEntity,String> {
}
