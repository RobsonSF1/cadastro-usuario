package com.java.cadastro_usuario.Controller;

import com.java.cadastro_usuario.Model.User;
import com.java.cadastro_usuario.Model.UserDataSave;
import com.java.cadastro_usuario.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/id")
    public ResponseEntity<User> findUserById(@RequestParam Integer id){
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping("/email")
    public ResponseEntity<User> findUserByEmail(@RequestParam String email){
        return ResponseEntity.ok(userService.getUserByEmail(email));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUserById(@PathVariable Integer id, @RequestBody UserDataSave userDataSave){
        userService.updateUserById(id,new User(userDataSave));
        return ResponseEntity.ok("Usuário atualizado com sucesso");
    }

}
