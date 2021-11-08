package pl.pro.PasswordApp.service;

import org.springframework.data.web.ReactivePageableHandlerMethodArgumentResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.pro.PasswordApp.entities.User;
import pl.pro.PasswordApp.entities.dto.UserDto;
import pl.pro.PasswordApp.repository.UserRepository;
import pl.pro.PasswordApp.request.LoginRequest;
import pl.pro.PasswordApp.request.RegisterRequest;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> register(RegisterRequest registerRequest){
        User newUser = new User();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(registerRequest.getPassword());
        newUser.setEmail(registerRequest.getEmail());
        newUser.setPassword(encodedPassword);
        newUser.setUsername(registerRequest.getUsername());

        userRepository.save(newUser);

        System.out.println(newUser.getId());

        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }


    public ResponseEntity<?> login(LoginRequest loginRequest){
        return null;
    }


}
