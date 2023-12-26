package com.example.user_project.service;

import com.example.user_project.dao.entities.User;
import com.example.user_project.dao.repositories.UserRepository;
import com.example.user_project.service.dtos.UserDTO;
import com.example.user_project.service.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserManagerAction implements UserManager{
    @Autowired
    UserRepository UserRepository;
    @Autowired
    UserMapper mapper;

    @Override
    public UserDTO getUserByEmail(String email)
    {
        User User = UserRepository.find


    }
    @Override
    public UserDTO  getUserByDateNaissance(String Date)
    {

    }
    @Override
    public UserDTO  saveUser(UserDTO Userdto)
    {


        User User = mapper.fromUserDtoToUser(Userdto);
        User user1 = UserRepository.save(User);
        UserDTO userdto = mapper.fromUserToUserDTO(user1);
      return userdto;
    }
    @Override
    public UserDTO deleteUser(Integer ID)
    {
        User user1 = UserRepository.findById(ID).orElseThrow();
        UserDTO userdto = mapper.fromUserToUserDTO(user1);
        UserRepository.deleteById(ID);
        return userdto;
    }

}
