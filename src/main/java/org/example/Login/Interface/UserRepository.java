package org.example.Login.Interface;
import org.example.Login.User;
public interface UserRepository {
    User findePasswordUserIDByUserName(String userName);
}
