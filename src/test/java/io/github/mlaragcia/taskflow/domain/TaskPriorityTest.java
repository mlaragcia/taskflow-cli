package io.github.mlaragcia.taskflow.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskPriorityTest {
    
    @Test 
    public void shouldContainPriority(){

        TaskPriority[] priorities = TaskPriority.values();

        assertEquals(3, priorities.length);
        assertEquals(TaskPriority.LOW, priorities[0]);
        assertEquals(TaskPriority.MEDIUM, priorities[1]);
        assertEquals(TaskPriority.HIGH, priorities[2]);
        

    }


}
