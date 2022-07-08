package com.exm.model.user.modeluser.UserService;

import com.exm.model.user.modeluser.VO.ResponseTemplate;
import com.exm.model.user.modeluser.model.User;

public interface UserServiceImp {
    public User saveUser(User user);

    public User findUserById(long userId);

    public void deleteUser(long userId);

    ResponseTemplate getUserAndDepartment(long userId);
}
