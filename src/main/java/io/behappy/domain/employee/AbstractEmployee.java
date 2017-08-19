package io.behappy.domain.employee;

import java.util.Locale;

public abstract class AbstractEmployee implements Employee {

    protected final Name name;
    protected final Role role;
    protected final University university;
    protected final Gender gender;
    protected final Locale nationality;
    protected final Mail mail;

    public AbstractEmployee(AbstractEmployeeBuilder builder) {
        this.name = builder.name();
        this.role = builder.role();
        this.university = builder.university();
        this.gender = builder.gender();
        this.nationality = builder.nationality();
        this.mail = builder.mail();
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
    public University getUniversity() {
        return university;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public Locale getNationality() {
        return nationality;
    }

    @Override
    public Mail getMail() {
        return mail;
    }
}
