package io.behappy.domain.employee.manager;

import io.behappy.domain.employee.Employee;
import io.behappy.domain.employee.Gender;
import io.behappy.domain.employee.University;

import java.util.function.Predicate;

public final class HireStrategiesFactory {

    public static Predicate<Employee> getOnlyAGH() {
        return e -> e.getUniversity().equals(University.AGH);
    }

    public static Predicate<Employee> getOnlyWomen() {
        return e -> e.getGender().equals(Gender.FEMALE);
    }

    //...
}
