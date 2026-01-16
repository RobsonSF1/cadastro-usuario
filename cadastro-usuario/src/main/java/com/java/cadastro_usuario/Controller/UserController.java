package com.java.cadastro_usuario.Controller;

import com.java.cadastro_usuario.Model.User;
import com.java.cadastro_usuario.Model.UserDataSave;
import com.java.cadastro_usuario.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Void> saveUser(@RequestBody UserDataSave user){
        userService.saveUser(new User(user));
        return ResponseEntity.ok().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDataSave> findUserById(@PathVariable Integer id){
        userService.getUserById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<User> findUserByEmail(@PathVariable String email){
        userService.getUserByEmail(email);
        return ResponseEntity.ok().build();
    }

}
