package io.github.mlaragcia.taskflow.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class TaskTest {
    
    @Test 
     void shouldCreateTaskWithDefaultStatusAndPriority(){

        Task task = new Task("Estudiar Java");
        assertEquals("Estudiar Java", task.getTitle());
        assertEquals(TaskStatus.TODO, task.getStatus());
        assertEquals(TaskPriority.MEDIUM, task.getPriority());
        


    }

}
