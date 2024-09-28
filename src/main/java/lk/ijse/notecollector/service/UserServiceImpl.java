package lk.ijse.notecollector.service;

import lk.ijse.notecollector.dao.UserDAO;
import lk.ijse.notecollector.dto.impl.UserDTO;
import lk.ijse.notecollector.entity.impl.UserEntity;
import lk.ijse.notecollector.utill.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private Mapping mapping;
    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        /*UserEntity savedName = userDAO.save(mapping.toUserEntity(userDTO));*//*JPA repo eke <entity,..> e nisa methna entity*//*
         return mapping.toUserDTO(savedName);*/
        return mapping.toUserDTO(userDAO.save(mapping.toUserEntity(userDTO)));
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
