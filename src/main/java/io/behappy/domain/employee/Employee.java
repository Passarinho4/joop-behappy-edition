package io.behappy.domain.employee;


import io.behappy.domain.report.Report;
import io.behappy.domain.task.Task;

public interface Employee {
    Name getName();
    Role getRole();
    void assign(Task task);
    Report reportWork();
}
