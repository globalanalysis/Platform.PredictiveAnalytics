package com.platform.ConfigApp;

import com.platform.Contolers.ControlerAuthorization;
import com.platform.DataBaseObject.LoginUser;
import com.platform.Repository.LoginDAO.LoginMapper;
import com.platform.Repository.LoginDAO.LoginRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

/**
 * The type Config java.
 */
@Configuration

public class ConfigJava {

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
