package io.github.mlaragcia.taskflow.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskStatusTest {

    @Test 
    public void shouldContainStatuses(){

        TaskStatus[] statuses = TaskStatus.values();

        assertEquals(3, statuses.length);
        assertEquals(TaskStatus.TODO, statuses[0]);
        assertEquals(TaskStatus.IN_PROGRESS, statuses[1]);
        assertEquals(TaskStatus.DONE, statuses[2]);

    }
}
