package com.platform.DataBaseObject;

/**
 * The type Login user.
 * Базовый класс для создания пользователя в приложении
 */
public final class LoginUser {

    @Override
    public String toString() {
        return "LoginUser{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", userRole='" + userrole + '\'' +
                '}';
    }

    /**
     * Instantiates a new Login user.
     */
    public LoginUser() {
    }

    /**
     * Gets login.
     *
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets login.
     *
     * @param login the login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    private String login;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    private String name;


    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    /**
     * Gets user role.
     *
     * @param name the name
     * @return the user role
     */
    public String getUserRole(String name) {
        return userrole;
    }

    /**
     * Sets user role.
     *
     * @param userRole the user role
     */
    public void setUserRole(String userRole) {
        this.userrole = userrole;
    }

    public String userrole;

    /**
     * Gets pass.
     *
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * Sets pass.
     *
     * @param pass the pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    private String pass;






}
