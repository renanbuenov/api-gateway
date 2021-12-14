package renan.apigateway.service;

import renan.apigateway.model.Role;
import renan.apigateway.model.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}