package io.behappy.domain.employee.developer;

import com.google.common.base.MoreObjects;
import io.behappy.domain.employee.AbstractEmployee;
import io.behappy.domain.employee.Name;
import io.behappy.domain.employee.Role;
import io.behappy.domain.report.DeveloperReport;
import io.behappy.domain.report.TaskSummary;
import io.behappy.domain.report.VisitableReport;
import io.behappy.domain.task.Task;

public class Developer extends AbstractEmployee {

    private final DeveloperReport report;

    public Developer(Name name, Role role) {
        super(name, role);
        report = new DeveloperReport(name);
    }

    @Override
    public void assign(Task task) {
        report.addTaskSummary(new TaskSummary(task.getTaskTitle(), task.getUnitsOfWork()));
    }

    @Override
    public VisitableReport reportWork() {
        return report;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("role", role)
                .toString();
    }
}
