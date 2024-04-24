package ports.spi;

import models.User;

public interface ICreateUserSpi {
    User createUser(User user);
}
