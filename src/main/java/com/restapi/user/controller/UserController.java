package com.restapi.user.controller;

import com.restapi.user.dto.UserDto;
import com.restapi.user.request.UserDetailsRequestModel;
import com.restapi.user.response.UserRest;
import com.restapi.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public String getUser() {
        return "Users are ";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }


    @PutMapping
    public String userUpdate(){
        return "Updated User";
    }
    @DeleteMapping
    public String deleteUser(){
        return "Delete User";
    }
}
