package com.m2i.CRM.controller.dto;

import com.m2i.CRM.enumeration.Grants;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 3, message = "user name should have at least 2 characters")
    private String username;

    @NotEmpty
    @Size(min = 8, message = "user name should have at least 8 characters")
    private String password;

    @NotEmpty
    @Email
    private String email;
    private Grants grants;

    public UserDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Grants getGrants() {
        return grants;
    }

    public void setGrants(Grants grants) {
        this.grants = grants;
    }
}
