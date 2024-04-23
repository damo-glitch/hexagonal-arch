package org.me.hexagone_gestion_user_infra.adapters.spi;

import business_logic.models.User;
import org.me.hexagone_gestion_user_infra.Repositories.UserRepository;
import org.me.hexagone_gestion_user_infra.mapper.UserMapper;
import org.springframework.stereotype.Component;
import ports.spi.IGetAllUsersSpi;

import java.util.List;

@Component
public class GetAllUsersSpiImpl implements IGetAllUsersSpi {

    private final UserRepository userRepository;

    public GetAllUsersSpiImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::mapfromUserEntityToUser).toList();
    }
}
