package lk.ijse.notecollector.dao;

import lk.ijse.notecollector.entity.impl.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository <UserEntity,String>{
    UserEntity saveUser(UserEntity userEntity);
}
