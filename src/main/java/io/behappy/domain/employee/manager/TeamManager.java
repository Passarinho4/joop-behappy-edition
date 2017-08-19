package io.behappy.domain.employee.manager;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import io.behappy.domain.employee.AbstractEmployee;
import io.behappy.domain.employee.Employee;
import io.behappy.domain.report.ManagerReport;
import io.behappy.domain.report.VisitableReport;
import io.behappy.domain.task.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import static com.google.common.base.Preconditions.checkArgument;

public class TeamManager extends AbstractEmployee implements Manager {

    private final ArrayList<Employee> employees;
    private final int maxTeamSize;
    private final Random randomGenerator;
    private final List<Predicate<Employee>> hireConstraints;

    public TeamManager(TeamManagerBuilder builder) {
        super(builder);
        checkArgument(builder.maxTeamSize() > 1, "Max team size should be > 1");
        this.maxTeamSize = builder.maxTeamSize();
        employees = new ArrayList<>();
        hireConstraints = Lists.newArrayList((Predicate<Employee>) employee -> employees.size() < maxTeamSize);
        hireConstraints.addAll(builder.hireConstraints());
        randomGenerator = new Random();
    }

    @Override
    public void hire(Employee employee) {
        if (canHire(employee)) {
            employees.add(employee);
        }
    }

    @Override
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    /**
     * I assume that all manager constrains must return positive value to hire.
     */
    @Override
    public boolean canHire(Employee employee) {
        return hireConstraints.stream()
                .allMatch(p -> p.test(employee));
    }

    @Override
    public void assign(Task task) {
        employees.get(randomGenerator.nextInt(employees.size()))
                .assign(task);
    }

    @Override
    public VisitableReport reportWork() {
        ManagerReport report = new ManagerReport(name);
        employees.stream()
                .sorted((o1, o2) -> ComparisonChain.start()
                        .compare(o1.getName(), o2.getName())
                        .compare(o1.getRole(), o2.getRole())
                        .compare(o1.reportWork().unitOfWorks(), o2.reportWork().unitOfWorks())
                        .result())
                .forEach(e -> report.addReport(e.reportWork()));
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
