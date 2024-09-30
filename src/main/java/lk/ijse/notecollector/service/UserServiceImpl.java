package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dao.UserDAO;
import lk.ijse.notecollector.dto.impl.UserDTO;
import lk.ijse.notecollector.entity.impl.UserEntity;
import lk.ijse.notecollector.exception.DataPersistException;
import lk.ijse.notecollector.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private Mapping mapping;
    @Override
    public void saveUser(UserDTO userDTO) {
        /*UserEntity savedName = userDAO.save(mapping.toUserEntity(userDTO));*//*JPA repo eke <entity,..> e nisa methna entity*//*
         return mapping.toUserDTO(savedName);*/
        /*return mapping.toUserDTO(userDAO.save(mapping.toUserEntity(userDTO)));*/
        UserEntity savedUser =
                userDAO.save(mapping.toUserEntity(userDTO));
        if (savedUser == null) {
            throw new DataPersistException("User not saved");
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> allUsers = userDAO.findAll();
        return mapping.asUserDTOList(allUsers);
    }

    @Override
    public UserDTO getUser(String userId) {
        UserEntity selectedUser = userDAO.getReferenceById(userId);
        return mapping.toUserDTO(selectedUser);

    }

    @Override
    public void deleteUser(String userID) {
        userDAO.deleteById(userID);
    }

    @Override
    public void updateUser(String userId, UserDTO userDTO) {
        Optional<UserEntity> tmpUser = userDAO.findById(userId);
        if (tmpUser.isPresent()) {
            UserEntity userEntity = tmpUser.get();
            userEntity.setFirstName(userDTO.getFirstName());
            userEntity.setLastName(userDTO.getLastName());
            userEntity.setEmail(userDTO.getEmail());
            userEntity.setPassword(userDTO.getPassword());
            userEntity.setProfilePic(userDTO.getProfilePic());
        }
    }

}
