package uz.pdp.university.service;

import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.university.DTO.SignInDTO;
import uz.pdp.university.DTO.SignUpDTO;
import uz.pdp.university.entity.UserEntity;
import uz.pdp.university.repository.UserRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class UserService {

    UserRepository userRepository;

    public UserEntity signIn(SignInDTO signInDto) {
        return userRepository.signIn(signInDto);
    }

    public UserEntity signUp(SignUpDTO signUpDTO) {
        return userRepository.signUp(UserEntity.builder()
                .name(signUpDTO.name())
                .username(signUpDTO.username())
                .password(signUpDTO.password())
                .role(signUpDTO.role())
                .build());
    }
}
