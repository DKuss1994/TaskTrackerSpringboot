package org.example.Login.Interface;

public class FakePasswordServiceFalse implements PasswordCreate {

    @Override
    public String hash(String password) {
        return password;
    }

    @Override
    public boolean verify(String password, String hash) {
        return false;
    }
}