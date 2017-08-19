package io.behappy.domain.employee;

public abstract class AbstractEmployee implements Employee {

    protected final Name name;
    private final Role role;

    protected AbstractEmployee(Name name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "AbstractEmployee{" +
                "executorName=" + name +
                ", role=" + role +
                '}';
    }
}
