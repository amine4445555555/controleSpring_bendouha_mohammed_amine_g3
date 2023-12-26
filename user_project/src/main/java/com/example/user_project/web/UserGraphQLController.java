package com.example.user_project.web;

import com.example.user_project.dao.entities.User;
import com.example.user_project.dao.repositories.UserRepository;
import com.example.user_project.service.UserManager;
import com.example.user_project.service.UserManagerAction;
import com.example.user_project.service.dtos.UserDTO;
import com.example.user_project.service.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {

    @Autowired
    UserManager m;
    @Autowired
    UserMapper mapper;
@MutationMapping
    public UserDTO saveUser(UserDTO Userdto)
    {


       return m.saveUser(Userdto);
    }
    @MutationMapping
    public UserDTO deleteUser(Integer ID)
    {
        return m.deleteUser(ID);
    }

}
