/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author agos1
 */
public class DbData {
    private final String user = "root";
    private final String password = "";
    private final String url ="jdbc:mysql://localhost:3306/registrodehistorias";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }
    
}
