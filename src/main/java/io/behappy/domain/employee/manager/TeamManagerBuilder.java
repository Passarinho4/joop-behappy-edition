package io.behappy.domain.employee.manager;

import io.behappy.domain.employee.AbstractEmployeeBuilder;
import io.behappy.domain.employee.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;


public class TeamManagerBuilder extends AbstractEmployeeBuilder<TeamManagerBuilder> {

    private int maxTeamSize;
    private List<Predicate<Employee>> hireConstraints;

    public TeamManagerBuilder() {
        hireConstraints = new LinkedList<>();
    }

    public TeamManagerBuilder setMaxTeamSize(int maxTeamSize) {
        this.maxTeamSize = maxTeamSize;
        return this;
    }

    public TeamManagerBuilder addHireConstrains(Predicate<Employee> constraint) {
        hireConstraints.add(constraint);
        return this;
    }

    public int maxTeamSize() {
        return maxTeamSize;
    }

    @Override
    public TeamManagerBuilder me() {
        return this;
    }

    @Override
    public TeamManager build() {
        return new TeamManager(this);
    }

    public List<Predicate<Employee>> hireConstraints() {
        return hireConstraints;
    }
}
