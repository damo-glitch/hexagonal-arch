package org.me.hexagone_gestion_user_infra.adapters.api;

import business_logic.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ports.api.ICreateUserApi;
import ports.api.IGetAllUsersApi;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final ICreateUserApi createUserApi;

    private final IGetAllUsersApi getAllUsersApi;

    public UserController(ICreateUserApi createUserApi, IGetAllUsersApi getAllUsersApi) {
        this.createUserApi = createUserApi;
        this.getAllUsersApi = getAllUsersApi;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok(createUserApi.createUser(user));
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(getAllUsersApi.getAllUsers());
    }
}
