package com.platform.DataBaseObject;

import com.platform.ConfigApp.ConfigJava;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The type Login user test.
 */
@SpringBootTest
@DisplayName("Test class LoginUser")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LoginUserTest {
    /**
     * The Login user.
     */
    @Autowired
    LoginUser loginUser;

    /**
     * Sets up.
     */
    @BeforeAll
   void setUp() {


        loginUser.setUserrole("Admin");
        loginUser.setPass("RTY$%^^");
        loginUser.setLogin("login");
        loginUser.setName("Admin");
        loginUser.setId(22);
        assertNotNull(loginUser);
    }

    /**
     * Tear down.
     */
    @AfterAll
    void tearDown() {

    }

    /**
     * Gets id.
     */
    @Test
    void getId() {

    System.out.println();
    }

    /**
     * Sets id.
     */
    @Test
    void setId() {
        assertEquals(22,loginUser.getId() );

    }

    /**
     * Gets name.
     */
    @Test
    void getName() {

        assertEquals("Admin",loginUser.getName() );
    }


    /**
     * Gets login.
     */
    @Test
    void getLogin() {
        assertEquals("login",loginUser.getLogin() );

    }


    /**
     * Gets userrole.
     */
    @Test
    void getUserrole() {

        assertEquals("Admin",loginUser.getUserrole() );
    }


    /**
     * Gets pass.
     */
    @Test
    void getPass() {

        assertEquals("RTY$%^^",loginUser.getPass() );
    }


}