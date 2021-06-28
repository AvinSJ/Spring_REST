package com.restapi.user.service;

import com.restapi.user.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
