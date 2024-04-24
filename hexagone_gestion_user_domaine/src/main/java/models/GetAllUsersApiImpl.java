package models;

import ddd.DomaineService;
import ports.api.IGetAllUsersApi;
import ports.spi.IGetAllUsersSpi;

import java.util.List;
@DomaineService
public class GetAllUsersApiImpl implements IGetAllUsersApi {

    private final IGetAllUsersSpi getAllUsersSpi;

    public GetAllUsersApiImpl(IGetAllUsersSpi getAllUsersSpi) {
        this.getAllUsersSpi = getAllUsersSpi;
    }
    @Override
    public List<User> getAllUsers() {
        return getAllUsersSpi.getAllUsers();
    }
}
