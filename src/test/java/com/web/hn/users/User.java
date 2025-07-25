package com.web.hn.users;

public class User {

    public static String username = getUsername();
    public static String password = getPassword();

    public static String[] cuentasAhorro = {"2000", "3000"};
    public static String[] tarjetasCredito = {"2000", "3000"};
    public static String[] cuentasCheques = {"2000", "3000"};

    public static String getUsername() {
        return System.getProperty("test.user", "defaultUser");
    }
    public static String getPassword() {
        return System.getProperty("test.password", "defaultPassword");
    }
}
