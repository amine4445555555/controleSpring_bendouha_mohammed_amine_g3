package com.example.user_project.service;

import com.example.user_project.service.dtos.UserDTO;

public interface UserManager {
    public UserDTO getUserByEmail(String email);
    public UserDTO  getUserByDateNaissance(String Date);
    public UserDTO  saveUser(UserDTO Userdto);
    public UserDTO deleteUser(Integer ID);
}
