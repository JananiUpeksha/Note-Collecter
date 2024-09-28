package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dto.impl.NoteDTO;
import lk.ijse.notecollector.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUser(String userId);
    boolean deleteUser(String userID);
    boolean updateUser(String userId, UserDTO userDTO);
}
