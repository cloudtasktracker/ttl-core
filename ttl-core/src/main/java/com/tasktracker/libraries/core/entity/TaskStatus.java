package com.tasktracker.libraries.core.entity;

import java.io.Serializable;

/**
 *
 * Created by joan on 5/7/15.
 */
public enum TaskStatus implements Serializable {
    CREATED("created"),
    DONE("done");

    private String status;

    TaskStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static TaskStatus getTaskStatus(final String status){
        for(TaskStatus taskStatus : TaskStatus.values()){
            if(taskStatus.getStatus().equals(status)) return taskStatus;
        }
        return null;
    }
}
