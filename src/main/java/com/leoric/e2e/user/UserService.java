package com.leoric.e2e.user;

import com.leoric.e2e.registration.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
        User user = new User(registrationRequest.getFirstName(),
                            registrationRequest.getLastName(),
                            registrationRequest.getEmail(),
                            registrationRequest.getPassword(),
                            Arrays.asList(new Role("ROLE_USER"))
        );
        return userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("User with this:" + email + " email not found"));
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
