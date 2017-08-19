package io.behappy.domain.report;

public class TaskSummary {

    private final String taskTitle;
    private final int unitOfWorks;

    public TaskSummary(String taskTitle, int unitOfWorks) {
        this.taskTitle = taskTitle;
        this.unitOfWorks = unitOfWorks;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public int getUnitOfWorks() {
        return unitOfWorks;
    }
}
