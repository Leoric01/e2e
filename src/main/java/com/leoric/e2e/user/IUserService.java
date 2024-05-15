package com.leoric.e2e.user;

import com.leoric.e2e.registration.RegistrationRequest;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getAllUsers();
    User registerUser(RegistrationRequest registrationRequest);
    User findUserByEmail(String email);
    void deleteUserById(int id);
    void addUser(User user);
    void updateUser(User user);

}
