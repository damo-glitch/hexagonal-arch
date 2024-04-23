package ports.api;

import business_logic.models.User;

public interface ICreateUserApi {
    User createUser(User user);
}
