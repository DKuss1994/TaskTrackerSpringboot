package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordHashTest {
    @Test
    void shouldHashPassword(){
        String password ="hello";
        String hash = PasswordService.hash(password);

        Assertions.assertNotNull(hash);
        Assertions.assertFalse(hash.isEmpty());
        Assertions.assertNotEquals(password,hash);
    }
    @Test
    void shouldVerifyCorrectPassword(){
        String password = "Hello?";
        String hash = PasswordService.hash(password);
        boolean result = PasswordService.verify(password,hash);

        Assertions.assertTrue(result);
    }
    @Test
    void shouldRejectWrongPassword(){
        String password = "Hello?";
        String wrongPassword = "hacker";
        String hash = PasswordService.hash(password);
        boolean result = PasswordService.verify(wrongPassword,hash);

        Assertions.assertFalse(result);
    }

}
