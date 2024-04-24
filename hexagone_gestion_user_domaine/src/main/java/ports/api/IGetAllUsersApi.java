package ports.api;

import models.User;

import java.util.List;

public interface IGetAllUsersApi {
    List<User> getAllUsers();
}
