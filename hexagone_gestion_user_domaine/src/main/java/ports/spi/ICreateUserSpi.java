package ports.spi;

import business_logic.models.User;

public interface ICreateUserSpi {
    User createUser(User user);
}
