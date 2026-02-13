package org.example.Login.Interface;

public interface PasswordCreate {
       String hash(String password);
       boolean verify(String password, String hash);
}
