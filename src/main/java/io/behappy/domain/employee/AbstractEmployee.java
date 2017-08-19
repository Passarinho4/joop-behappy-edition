package io.behappy.domain.employee;

public abstract class AbstractEmployee implements Employee {

    protected final Name name;
    protected final Role role;

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

}
