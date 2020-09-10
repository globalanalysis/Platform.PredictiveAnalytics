package com.platform.Contolers.RestControler;


import com.platform.Application;
import com.platform.DataBaseObject.LoginUser;
import com.platform.Repository.LoginDAO.LoginRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * ControlerAuthorization
 * Основной контролер, служит для авторизации пользователей
 * http://localhost:8080/
 * @author Manul
 */
@RestController
public class ControlerAuthorization {


    /**
     * The Login repository.
     */
    @Autowired
    LoginRepository loginRepository;







    /**
     * Получаем весь список юзеров
     *
     * @return mefhod print
     */

    @GetMapping("/user")
   public List<LoginUser> getUser() {
        List<LoginUser> e =  loginRepository.getDataUserLogin();
         return  e;

    }


    /**
     *  Создает нового юзера/ Пример запроса
     *  http://localhost:8080/setuser?name=User&userrole=admin&login=login$&pass=RTYUFSGRTER
     */
    @GetMapping("/setuser")
     public void setUser(@RequestParam String name, @RequestParam String userrole, @RequestParam String login, @RequestParam  String pass) {
     loginRepository.setLoginUser(name, userrole,login,pass);

    }



    /**
     *  Поиск юзера по id
     *  Пример /getUserID?id=4
     *
     */



    @GetMapping("/getUserID")
        public LoginUser getUserID(@RequestParam(required=false) Integer id) {

        return loginRepository.findByUserId(id);

    }


    /**
     *  Delete юзера по id
     * Пример запроса /getUserID?id=4
     */



    @GetMapping("/deleteUserID")
    public void deleteUserID(@RequestParam(required=false) Integer id) {

         loginRepository.deleteUserID(id);

    }




}
