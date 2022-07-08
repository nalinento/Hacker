package com.exm.model.user.modeluser.UserRepository;

import com.exm.model.user.modeluser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.userId = ?1")
    public User findUserById(long id);
}
