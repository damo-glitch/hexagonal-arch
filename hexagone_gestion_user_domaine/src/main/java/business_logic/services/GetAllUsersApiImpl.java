package business_logic.services;

import business_logic.models.User;
import ports.api.IGetAllUsersApi;

import java.util.List;

public class GetAllUsersApiImpl implements IGetAllUsersApi {

    private final IGetAllUsersApi getAllUsersApi;

    public GetAllUsersApiImpl(IGetAllUsersApi getAllUsersApi) {
        this.getAllUsersApi = getAllUsersApi;
    }
    @Override
    public List<User> getAllUsers() {
        return getAllUsersApi.getAllUsers();
    }
}
