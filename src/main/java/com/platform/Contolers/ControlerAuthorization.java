package com.platform.Contolers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ControlerAuthorization
 * Основной контролер, служит для авторизации пользователей
 *
 */

@RestController
@RequestMapping("/")
public class ControlerAuthorization {



    /**
     *
     * Тестовый метод обработки запроса Spring Web
     *
     */
    @GetMapping
    public void getMefhodPrint() {

        System.out.println("Hello");




    }







}
