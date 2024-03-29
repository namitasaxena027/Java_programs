package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.UserDto;
import javax.transaction.Transactional;

import java.util.List;

public interface UserService {
    @Transactional
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);
}
