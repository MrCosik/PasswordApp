package pl.pro.PasswordApp.service;

import org.springframework.stereotype.Service;
import pl.pro.PasswordApp.entities.Password;
import pl.pro.PasswordApp.entities.dto.PasswordDto;
import pl.pro.PasswordApp.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public List<PasswordDto> getUserPasswords(){
        List<PasswordDto> passwordDtos = new ArrayList<>();

        for(Password password : userRepository.findAll()){

        }

        return userRepository.findAll();
    }



}
