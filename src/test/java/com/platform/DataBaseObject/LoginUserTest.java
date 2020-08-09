package com.platform.DataBaseObject;

import com.platform.ConfigApp.ConfigJava;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LoginUser")
class LoginUserTest {
    ConfigJava h = new ConfigJava();
    LoginUser loginUser = h.getLoginUser();

    @BeforeEach
    void setUp() {


        loginUser.setUserrole("Admin");
        loginUser.setPass("RTY$%^^");
        loginUser.setLogin("login");
        loginUser.setName("Admin");
        loginUser.setId(22);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getId() {

    System.out.println();
    }

    @Test
    void setId() {
        assertEquals(22,loginUser.getId() );

    }

    @Test
    void getName() {

        assertEquals("Admin",loginUser.getName() );
    }



    @Test
    void getLogin() {
        assertEquals("login",loginUser.getLogin() );

    }


    @Test
    void getUserrole() {

        assertEquals("Admin",loginUser.getUserrole() );
    }



    @Test
    void getPass() {

        assertEquals("RTY$%^^",loginUser.getPass() );
    }


}