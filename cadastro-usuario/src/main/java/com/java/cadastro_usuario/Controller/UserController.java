package com.java.cadastro_usuario.Controller;

import com.java.cadastro_usuario.Model.User;
import com.java.cadastro_usuario.Model.UserSave;
import com.java.cadastro_usuario.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Void> saveUser(@RequestBody UserSave user){
        userService.saveUser(new User(user));
        return ResponseEntity.ok().build();
    }

}
