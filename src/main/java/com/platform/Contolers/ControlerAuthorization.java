package com.platform.Contolers;


import com.platform.DataBaseObject.LoginUser;
import com.platform.Repository.LoginDAO.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * ControlerAuthorization
 * Основной контролер, служит для авторизации пользователей
 * http://localhost:8080/
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
       List<LoginUser> t =  loginRepository.getDataUserLogin();
      return t;

    }


    /**
     *  Создает нового юзера
     */
    @GetMapping("/setuser")
     public void setUser() {
     loginRepository.setLoginUser("C#", "неизвестно", "С№","TFGH#$%^");

    }





    /**
     *  Поиск юзера по id
     */



    @GetMapping("/getUserID")
    public LoginUser getUserID() {

       return loginRepository.findByUserId(5);

    }


    /**
     *  Delete юзера по id
     */



    @GetMapping("/deleteUserID")
    public void deleteUserID() {

         loginRepository.deleteUserID(7);

    }




}
