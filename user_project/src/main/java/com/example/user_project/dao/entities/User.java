package com.example.user_project.dao.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id_User;
    private String name;
    private String email;
    private String date_naissance;
    private String password;
}
