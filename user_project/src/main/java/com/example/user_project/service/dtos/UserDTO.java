package com.example.user_project.service.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    String name;
    String email;
    String date_naissance;

}
