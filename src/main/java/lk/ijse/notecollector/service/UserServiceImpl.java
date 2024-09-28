package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dto.impl.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO getUser(String userId) {
        return null;
    }

    @Override
    public boolean deleteUser(String userID) {
        return false;
    }

    @Override
    public boolean updateUser(String userId, UserDTO userDTO) {
        return false;
    }
}
