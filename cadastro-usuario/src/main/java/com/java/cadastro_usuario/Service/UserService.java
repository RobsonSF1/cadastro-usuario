package com.java.cadastro_usuario.Service;

import com.java.cadastro_usuario.Model.User;
import com.java.cadastro_usuario.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {


    private final UserRepository userRepository;

}
