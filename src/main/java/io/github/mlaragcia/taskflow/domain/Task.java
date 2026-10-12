package io.github.mlaragcia.taskflow.domain;

public class Task {
    
    private String title;
    private TaskStatus status;
    private TaskPriority priority;

    public Task(String title){
        this.title = title;
        this.status = TaskStatus.TODO;
        this.priority = TaskPriority.MEDIUM;
    }

    public String getTitle(){
        return title;
    }

    public TaskStatus getStatus(){
        return status;
    }

    public TaskPriority getPriority(){
        return priority;
    }
}
