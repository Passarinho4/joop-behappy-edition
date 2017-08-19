package io.behappy.domain.employee;

import static com.google.common.base.Preconditions.checkArgument;

public final class Name {

    private final String name;

    public Name(String name) {
        checkArgument(name.length()>0, "Name length should be > 0");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
