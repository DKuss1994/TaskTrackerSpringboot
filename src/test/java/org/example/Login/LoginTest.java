package org.example.Login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    UserService userService = new UserService(new fakeUserRepository(),new fakePasswordService());
    @Test
    void testLoginTrueIfUserAndPasswordTrue(){
        Assertions.assertTrue(userService.login("Max","123456"));

    }
    @Test
    void testLoginFalseIfUserNotFound(){
        Assertions.assertFalse(userService.login("Max","123456"));
    }
    @Test
    void testLoginFalseIfPasswordFalse(){
        Assertions.assertFalse(userService.login("Max","123456"));
    }
}
