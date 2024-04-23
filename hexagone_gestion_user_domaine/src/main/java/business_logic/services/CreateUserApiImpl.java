package business_logic.services;

import business_logic.models.User;
import ports.api.ICreateUserApi;

public class CreateUserApiImpl implements ICreateUserApi {
    private final ICreateUserApi createUserApi;

    public CreateUserApiImpl(ICreateUserApi createUserApi) {
        this.createUserApi = createUserApi;
    }
    @Override
    public User createUser(User user) {
        return createUserApi.createUser(user);
    }
}
