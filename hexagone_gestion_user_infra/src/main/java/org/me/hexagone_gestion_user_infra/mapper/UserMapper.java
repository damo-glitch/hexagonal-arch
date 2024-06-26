package org.me.hexagone_gestion_user_infra.mapper;

import models.User;
import org.me.hexagone_gestion_user_infra.models.UserEntity;
import org.modelmapper.ModelMapper;

public class UserMapper {
    private static ModelMapper modelMapper;

    static {
        modelMapper = new ModelMapper();
    }

    /**
     * Mappage de User (Domaine) à UserEntity (Infra)
     * @param user
     * @return UserEntity
     */
    public static UserEntity mapToUserEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }

    /**
     *
     * @param userEntity
     * @return User
     */

    public static User mapToUser(UserEntity userEntity) {
        return modelMapper.map(userEntity, User.class);
    }
}
