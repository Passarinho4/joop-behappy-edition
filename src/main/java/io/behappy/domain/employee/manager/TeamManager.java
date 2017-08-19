package io.behappy.domain.employee.manager;

import com.google.common.base.MoreObjects;
import io.behappy.domain.employee.AbstractEmployee;
import io.behappy.domain.employee.Employee;
import io.behappy.domain.employee.Name;
import io.behappy.domain.employee.Role;
import io.behappy.domain.report.ManagerReport;
import io.behappy.domain.report.VisitableReport;
import io.behappy.domain.task.Task;

import java.util.ArrayList;
import java.util.Random;

import static com.google.common.base.Preconditions.checkArgument;

public class TeamManager extends AbstractEmployee implements Manager {

    private final ArrayList<Employee> employees;
    private final int maxTeamSize;
    private final Random randomGenerator;

    public TeamManager(Name name, Role role, int maxTeamSize) {
        super(name, role);
        checkArgument(maxTeamSize > 1, "Max team size should be > 1");
        this.maxTeamSize = maxTeamSize;
        employees = new ArrayList<>();
        randomGenerator = new Random();
    }

    @Override
    public void hire(Employee employee) {
        if (canHire()) {
            employees.add(employee);
        }
    }

    @Override
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public boolean canHire() {
        return employees.size() < maxTeamSize;
    }

    @Override
    public void assign(Task task) {
        employees.get(randomGenerator.nextInt(employees.size()))
                .assign(task);
    }

    @Override
    public VisitableReport reportWork() {
        ManagerReport report = new ManagerReport(name);
        employees.forEach(e -> report.addReport(e.reportWork()));
        return report;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("role", role)
                .add("maxTeamSize", maxTeamSize)
                .toString();
    }
}
