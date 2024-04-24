package ports.api;

import models.User;

public interface ICreateUserApi {
    User createUser(User user);
}
