package com.exm.model.user.modeluser.UserService;

import com.exm.model.user.modeluser.UserRepository.UserRepository;
import com.exm.model.user.modeluser.model.Department;
import com.exm.model.user.modeluser.VO.ResponseTemplate;
import com.exm.model.user.modeluser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService implements UserServiceImp{


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(long userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public void deleteUser(long userId) {
         userRepository.deleteById(userId);
    }

    @Override
    public ResponseTemplate getUserAndDepartment(long userId) {
        User user= userRepository.findUserById(userId);
        Department department= restTemplate.getForObject("http://localhost:9091/department/"+user.getUserId(),Department.class);
        ResponseTemplate vo = new ResponseTemplate();
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
