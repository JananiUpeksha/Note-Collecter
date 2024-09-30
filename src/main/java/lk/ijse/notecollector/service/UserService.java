package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUser(String userId);

    void deleteUser(String userID);
    void updateUser(String userId, UserDTO userDTO);
}
