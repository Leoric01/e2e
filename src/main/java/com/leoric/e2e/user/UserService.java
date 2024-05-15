package com.leoric.e2e.user;

import com.leoric.e2e.registration.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User registerUser(RegistrationRequest registrationRequest) {
        return null;
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public void deleteUserById(int id) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
