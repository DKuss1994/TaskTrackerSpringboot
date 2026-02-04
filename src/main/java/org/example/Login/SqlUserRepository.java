package org.example.Login;

import org.example.Login.Interface.UserRepository;
import org.example.SQL.DatabaseConnection;

public class SqlUserRepository implements UserRepository {
    private DatabaseConnection databaseConnection;
    SqlUserRepository(DatabaseConnection databaseConnection){
        this.databaseConnection = databaseConnection;
    }
    @Override
    public User findePasswordUserIDByUserName(String userName) {
        return null;
    }
}
