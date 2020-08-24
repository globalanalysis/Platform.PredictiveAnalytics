package com.platform.ConfigApp;

import com.platform.DataBaseObject.LoginUser;
import com.platform.Repository.LoginDAO.LoginMapper;
import com.platform.Repository.LoginDAO.LoginRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The type Config java.
 */
@Configuration
@EnableWebMvc

public class ConfigJava   {






    /**
     * Gets login user.
     *
     * @return the login user
     */
    @Bean
    public LoginUser getLoginUser () {

      return  new LoginUser();

    }


  //  LoginMapper

    @Bean
    public LoginMapper getLoginMapper () {

        return  new LoginMapper();

    }

// LoginRepository

    @Bean
    public LoginRepository getLoginRepository () {

        return  new LoginRepository();

    }






}
