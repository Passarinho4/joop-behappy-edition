package io.behappy.domain.employee.developer;

import io.behappy.domain.employee.AbstractEmployeeBuilder;

public class DeveloperBuilder extends AbstractEmployeeBuilder<DeveloperBuilder> {

    @Override
    public DeveloperBuilder me() {
        return this;
    }

    @Override
    public Developer build() {
        return new Developer(this);
    }
}
