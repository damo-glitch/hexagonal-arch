package org.me.hexagone_gestion_user_infra.adapters.spi;

import models.User;
import org.me.hexagone_gestion_user_infra.Repositories.UserRepository;
import org.me.hexagone_gestion_user_infra.mapper.UserMapper;
import org.me.hexagone_gestion_user_infra.models.UserEntity;
import org.springframework.stereotype.Component;
import ports.spi.ICreateUserSpi;

@Component
public class CreateUserSpiImpl implements ICreateUserSpi {

    private final UserRepository userRepository;

    public CreateUserSpiImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = UserMapper.mapToUserEntity(user);
        UserEntity userz = userRepository.save(userEntity);
        return UserMapper.mapToUser(userz);
    }
}
