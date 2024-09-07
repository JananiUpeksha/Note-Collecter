package lk.ijse.notecollector.utill;

import java.util.UUID;

public class AppUtill {
    public static String generateNoteId(){
        return "NOTE-"+ UUID.randomUUID();
    }
}
