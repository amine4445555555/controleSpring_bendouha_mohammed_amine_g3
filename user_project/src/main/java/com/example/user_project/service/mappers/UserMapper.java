package com.example.user_project.service.mappers;

import com.example.user_project.dao.entities.User;
import com.example.user_project.service.dtos.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public User fromUserDtoToUser(UserDTO Userdto){
        return this.modelMapper.map(Userdto,User.class);
    }
    public UserDTO fromUserToUserDTO(User user){
        return this.modelMapper.map(user,UserDTO.class);
    }
}
