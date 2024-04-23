package ports.api;

import business_logic.models.User;

import java.util.List;

public interface IGetAllUsersApi {
    List<User> getAllUsers();
}
