package com.platform.Repository.LoginDAO;

import com.platform.DataBaseObject.LoginUser;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;



public class LoginMapper implements RowMapper<LoginUser> {


    @Override
    public LoginUser mapRow(ResultSet rs, int rowNum) throws SQLException {

        LoginUser loginUser = new LoginUser();
        loginUser.setId( rs.getInt("id"));
        loginUser.setName(rs.getString("name"));
        loginUser.setUserrole(rs.getString("userrole"));
        loginUser.setLogin(rs.getString("login"));
        loginUser.setPass(rs.getString("pass"));

        return loginUser;






    }
}
