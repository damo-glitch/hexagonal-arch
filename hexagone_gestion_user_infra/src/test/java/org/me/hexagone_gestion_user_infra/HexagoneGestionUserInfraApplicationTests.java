package org.me.hexagone_gestion_user_infra;

import business_logic.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.me.hexagone_gestion_user_infra.Repositories.UserRepository;
import org.me.hexagone_gestion_user_infra.adapters.spi.CreateUserSpiImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ports.api.ICreateUserApi;

@SpringBootTest
class HexagoneGestionUserInfraApplicationTests {


    @Test
    void contextLoads() {
    }

}
