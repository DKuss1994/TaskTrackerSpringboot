package org.example.Login.Interface;

import org.example.Login.User;

public class FakeUserNotFoundRepository implements UserRepository {

    @Override
    public User findePasswordUserIDByUserName(String userName) {
       return null;
    }
}
