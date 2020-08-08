package com.platform.Repository.LoginDAO;

import com.platform.DataBaseObject.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public class LoginRepository {

    @Autowired
    JdbcTemplate jdbcTemplateObject;
    @Autowired
    LoginMapper loginMapper;



    String selectSQL = "SELECT id, name, userrole, login, pass  FROM public.customers";

    public List<LoginUser> getDataUserLogin(){


         List<LoginUser> loginUser = jdbcTemplateObject.query(selectSQL, loginMapper);

         return loginUser;


    }




    String insertSQL = "INSERT INTO public.customers(\n" +
          "\t name, userrole, login, pass)\n" +
        "\t VALUES ( ?, ?, ?, ?)";


    public void setLoginUser(String name, String userrole, String login, String pass){

        jdbcTemplateObject.update( insertSQL, name,userrole, login, pass );




    }






    public LoginUser findByUserId(Integer id) {

        String selectUserID = "SELECT id, name, userrole, login, pass FROM public.customers WHERE id = ?";

        return jdbcTemplateObject.queryForObject(selectUserID, new Object[]{id}, loginMapper);

    }













}
