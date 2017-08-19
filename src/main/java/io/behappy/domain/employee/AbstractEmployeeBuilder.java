package io.behappy.domain.employee;

import java.util.Locale;

public abstract class AbstractEmployeeBuilder<T extends AbstractEmployeeBuilder<T>> {

    private Name name;
    private Role role;
    private University university;
    private Gender gender;
    private Locale nationality;
    private Mail mail;
    private int maxTeamSize;

    public T setName(Name name) {
        this.name = name;
        return me();
    }

    public T setRole(Role role) {
        this.role = role;
        return me();
    }

    public T setUniversity(University university) {
        this.university = university;
        return me();
    }

    public T setGender(Gender gender) {
        this.gender = gender;
        return me();
    }

    public T setNationality(Locale nationality) {
        this.nationality = nationality;
        return me();
    }

    public T setMail(Mail mail) {
        this.mail = mail;
        return me();
    }

    public Name name() {
        return name;
    }

    public Role role() {
        return role;
    }

    public University university() {
        return university;
    }

    public Gender gender() {
        return gender;
    }

    public Locale nationality() {
        return nationality;
    }

    public Mail mail() {
        return mail;
    }

    public int maxTeamSize() {
        return maxTeamSize;
    }

    public abstract T me();

    public abstract AbstractEmployee build();


}
