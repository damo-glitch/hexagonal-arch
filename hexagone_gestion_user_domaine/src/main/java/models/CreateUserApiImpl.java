package models;

import ddd.DomaineService;
import ports.api.ICreateUserApi;
import ports.spi.ICreateUserSpi;

@DomaineService
public class CreateUserApiImpl implements ICreateUserApi {
    private final ICreateUserSpi createUserSpi;

    public CreateUserApiImpl(ICreateUserSpi createUserSpi) {
        this.createUserSpi = createUserSpi;
    }
    @Override
    public User createUser(User user) {
        return createUserSpi.createUser(user);
    }
}
