package org.example.Login;

public interface PasswordCreate {
       String hash(String password);
       boolean verify(String password, String hash);
}
