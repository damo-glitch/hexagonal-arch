package org.me.hexagone_gestion_user_infra.configuration;

import ddd.DomaineService;
import models.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION), @ComponentScan.Filter(classes = DomaineService.class)},
    basePackageClasses = {User.class}
)
public class DomaineConfiguration {
}
