package io.behappy.domain.task;

public class Task {

    private final String taskTitle;
    private final int unitsOfWork;

    public Task(String taskTitle, int unitsOfWork) {
        this.taskTitle = taskTitle;
        this.unitsOfWork = unitsOfWork;
    }

    public int getUnitsOfWork() {
        return unitsOfWork;
    }

    public String getTaskTitle() {
        return taskTitle;
    }
}
