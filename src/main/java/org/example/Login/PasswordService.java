package org.example.Login;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordService implements PasswordCreate {
    @Override
    public String hash(String password) {
        return BCrypt.hashpw(password,BCrypt.gensalt(12));
    }
@Override
    public  boolean verify(String password, String hash) {
        return BCrypt.checkpw(password,hash);
    }
}
