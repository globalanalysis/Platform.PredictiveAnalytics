package com.platform.Repository.LoginDAO;

import com.platform.DataBaseObject.LoginUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * The type Login repository.
 */
public class LoginRepository {



    /**
     * The Jdbc template object.
     */
    @Autowired
    JdbcTemplate jdbcTemplateObject;
    /**
     * The Login mapper.
     */
    @Autowired
    LoginMapper loginMapper;


    /**
     * The Select sql.
     */


    /**
     * Get data user login list. Метод возвращает данные о всех пользователях
     *
     * @return the list
     */
    public List<LoginUser> getDataUserLogin(){

        String selectSQL = "SELECT id, name, userrole, login, pass  FROM public.customers";

         List<LoginUser> loginUser = jdbcTemplateObject.query(selectSQL, loginMapper);

         return loginUser;


    }





    /**
     * Метод создает нового пользователя
     *
     * @param name     the name
     * @param userrole the userrole
     * @param login    the login
     * @param pass     the pass
     */
    public void setLoginUser(String name, String userrole, String login, String pass){

        String insertSQL = "INSERT INTO public.customers(\n" +
                "\t name, userrole, login, pass)\n" +
                "\t VALUES ( ?, ?, ?, ?)";

        jdbcTemplateObject.update( insertSQL, name,userrole, login, pass );




    }


    /**
     * Find by user id login user.
     * Метод возвращает пользователя с заданным id
     * @param id the id
     * @return the login user
     */
    public LoginUser findByUserId(Integer id) {

        String selectUserID = "SELECT id, name, userrole, login, pass FROM public.customers WHERE id = ?";

        return jdbcTemplateObject.queryForObject(selectUserID, new Object[]{id}, loginMapper);

    }


    /**
     * Delete user id.
     * Метод удаляет пользователя с заданым id
     * @param id the id
     */
    public void deleteUserID(Integer id) {

        String deleteUserID = "DELETE FROM public.customers \n" +
                "\t  WHERE id = ?";

       jdbcTemplateObject.update( deleteUserID,new Object[]{id} );

    }








}
