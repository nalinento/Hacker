package com.exm.model.user.modeluser.UserController;

import com.exm.model.user.modeluser.UserService.UserService;
import com.exm.model.user.modeluser.VO.ResponseTemplate;
import com.exm.model.user.modeluser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User saveUser = userService.saveUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("saveUser").build(user.getUserId());
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(saveUser);
    }
    @GetMapping("/userId/{id}")
    public User findUserById(@PathVariable("id") long userId){
        return userService.findUserById(userId);
    }


    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable("userId") long userId){
        userService.deleteUser(userId);

        return "successfully deteted";
    }
    @GetMapping("userAndDepartment/{userId}")
    public ResponseTemplate getUserAndDepartmentById(@PathVariable("userId") long userId){

        return userService.getUserAndDepartment(userId);
    }
}
