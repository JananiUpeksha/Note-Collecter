package lk.ijse.notecollector.dto.impl;

import lk.ijse.notecollector.dto.SuperDTO;
import lk.ijse.notecollector.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class UserDTO implements UserStatus {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePic;
    private List<NoteDTO> notes;

}
