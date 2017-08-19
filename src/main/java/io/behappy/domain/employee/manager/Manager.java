package io.behappy.domain.employee.manager;

import io.behappy.domain.employee.Employee;

public interface Manager extends Employee {

    void hire(Employee employee);
    void fire(Employee employee);

    boolean canHire(Employee employee);

}
