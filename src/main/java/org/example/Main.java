package org.example;


import org.example.Login.*;
import org.example.SQL.JdbcConnectionProvider;
import org.example.SQL.SqlServerConnection;

public class Main{
   public static void main (String[] args){
       UserLoginManager userLoginManager = new UserLoginManager();
      if(userLoginManager.start()){
          SystemManager systemManager = new SystemManager();
          systemManager.start();

      }
       System.out.println("Login failed. Try it again.");

    }
}
