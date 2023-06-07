package com.example.demo.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDTO {

    private long id;
    private String role;
    private String username;
    private String fullName;
    private String password;
    private String email;
    private boolean status;

    private RoleDTO roleDTO;

    private String oldPassword;
    private String newPassword;
    private String confirmPassword;

}
