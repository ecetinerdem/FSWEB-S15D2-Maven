package org.example.entity;

import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> carolsTasks, Set<Task> bobsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.carolsTasks = carolsTasks;
        this.bobsTasks = bobsTasks;
        this.unassignedTasks = unassignedTasks;
    }
}
