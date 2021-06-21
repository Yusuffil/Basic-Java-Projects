package com.hoaxify.ws.auth;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoaxify.ws.Error.ApiError;
import com.hoaxify.ws.User.User;
import com.hoaxify.ws.User.UserRepository;
import com.hoaxify.ws.shared.Views;
import org.apache.tomcat.util.http.parser.Authorization;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;


@RestController
public class AuthController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/api/1.0/auth")
    @JsonView(Views.Base.class)
    public ResponseEntity<?> handleAuthentication(@RequestHeader(value = "Authorization") String authorization){
        String base64encoded = authorization.split("Basic ")[1];
        String decoded = new String(Base64.getDecoder().decode(base64encoded));
        String[] parts = decoded.split(":");
        String username = parts[0];
        User inDB = userRepository.findByUsername(username);
            return ResponseEntity.ok().body(inDB);
    }
}
