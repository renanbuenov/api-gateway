package renan.apigateway.service;

import renan.apigateway.model.User;

public interface AuthenticationService {

    User signInAndReturnJWT(User signInRequest);
}