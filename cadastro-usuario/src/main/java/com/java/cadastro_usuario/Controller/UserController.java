package com.java.cadastro_usuario.Controller;

import com.java.cadastro_usuario.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;
}
