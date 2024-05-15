package com.leoric.e2e.registration;

import com.leoric.e2e.user.Role;
import lombok.Data;

import java.util.List;

@Data
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<Role> roles;
}
