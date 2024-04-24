package org.me.hexagone_gestion_user_infra.Repositories;

import org.me.hexagone_gestion_user_infra.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
