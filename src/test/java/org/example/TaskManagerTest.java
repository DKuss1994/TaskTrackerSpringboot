package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

public class TaskManagerTest {
    TaskManager taskManager = new TaskManager();
    @Test
    void addListTaskTest(){
        String text= "Hello";
        TreeMap<Integer,String> exampel = new TreeMap<>();
        exampel.put(1,text);
        taskManager.add("Hello");
        Assertions.assertEquals(exampel,taskManager.getTaskMap());

    }
}
