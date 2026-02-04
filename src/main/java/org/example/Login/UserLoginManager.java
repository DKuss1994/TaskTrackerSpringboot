package org.example.Login;

import org.example.SQL.JdbcConnectionProvider;
import org.example.SQL.SqlServerConnection;
import org.example.UserQuestions;

import java.util.Scanner;

public class UserLoginManager {
    private final Scanner sc = new Scanner(System.in);
    private final UserQuestions userQuestions = new UserQuestions(sc);
    public boolean start(){
        JdbcConnectionProvider jdbcConnectionProvider = new JdbcConnectionProvider();
        SqlServerConnection sqlServerConnection = new SqlServerConnection(jdbcConnectionProvider);
        SqlUserRepository sqlUserRepository = new SqlUserRepository(sqlServerConnection);
        PasswordService passwordService = new PasswordService();
        UserService userService = new UserService(sqlUserRepository,passwordService);
        String userName = userQuestions.userDescription("Username: ");
        String password = userQuestions.userDescription("Password: ");
        return userService.login(userName,password);
    }
}
